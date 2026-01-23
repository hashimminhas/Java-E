public class Cursor {
    
    public String getCoords(String startCoords, String movements) {
        // Parse starting coordinates
        // Expected format: "(x,y)" or "x,y"
        String[] parts = startCoords.replace("(", "").replace(")", "").split(",");
        int x = Integer.parseInt(parts[0].trim());
        int y = Integer.parseInt(parts[1].trim());
        
        // Process each movement
        for (int i = 0; i < movements.length(); i++) {
            char move = movements.charAt(i);
            
            switch (move) {
                case 'L':
                    x--;  // Move left
                    break;
                case 'R':
                    x++;  // Move right
                    break;
                case 'U':
                    y++;  // Move up
                    break;
                case 'D':
                    y--;  // Move down
                    break;
                // Ignore invalid characters
            }
        }
        
        // Return in format "(x,y)"
        return "(" + x + "," + y + ")";
    }
}