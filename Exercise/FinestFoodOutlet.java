import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;
import java.net.http.*;
import java.net.URI;
import com.google.gson.*;

class Result {

    /*
     * Complete the 'finestFoodOutlet' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING city
     *  2. INTEGER votes
     * API URL https://jsonmock.hackerrank.com/api/food_outlets?city={city}&page={page_no}
     */

    public static String finestFoodOutlet(String city, int votes) {
        try {
            // URL encode the city name to handle spaces and special characters
            String encodedCity = URLEncoder.encode(city, "UTF-8");
            
            // Create HTTP client
            HttpClient client = HttpClient.newHttpClient();
            
            // Variables to track the best outlet
            String bestName = "";
            double bestRating = -1.0;
            int bestVotes = -1;
            
            int currentPage = 1;
            int totalPages = 1;
            
            // Gson parser for JSON processing
            Gson gson = new Gson();
            
            // Loop through all pages
            while (currentPage <= totalPages) {
                // Build URL for current page
                String url = "https://jsonmock.hackerrank.com/api/food_outlets?city=" + encodedCity + "&page=" + currentPage;
                
                // Create HTTP GET request
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
                
                // Send request and get response
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                
                // Parse JSON response
                JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
                
                // Get total pages from first page response
                if (currentPage == 1) {
                    totalPages = jsonResponse.get("total_pages").getAsInt();
                }
                
                // Get data array containing outlets
                JsonArray dataArray = jsonResponse.getAsJsonArray("data");
                
                // Process each outlet in the current page
                for (int i = 0; i < dataArray.size(); i++) {
                    JsonObject outlet = dataArray.get(i).getAsJsonObject();
                    JsonObject userRating = outlet.getAsJsonObject("user_rating");
                    
                    double avgRating = userRating.get("average_rating").getAsDouble();
                    int outletVotes = userRating.get("votes").getAsInt();
                    String outletName = outlet.get("name").getAsString();
                    
                    // Check if outlet meets minimum votes requirement
                    if (outletVotes >= votes) {
                        // Update best if this has higher rating, 
                        // or same rating but more votes (tie-breaker)
                        if (avgRating > bestRating || 
                            (avgRating == bestRating && outletVotes > bestVotes)) {
                            bestRating = avgRating;
                            bestVotes = outletVotes;
                            bestName = outletName;
                        }
                    }
                }
                
                currentPage++;
            }
            
            return bestName;
            
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}

public class FinestFoodOutlet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String city = bufferedReader.readLine();

        int votes = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.finestFoodOutlet(city, votes);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
