package sprint;

public class StringConcatenator{
    public String concatenate(String... parts){ // 
        if (parts == null || parts.length == 0){
            return "";
        }

        StringBuilder builder = new StringBuilder();
        for (String part : parts){
            if (part != null){
                builder.append(part);
            }
        }
        return builder.toString();
    }
}