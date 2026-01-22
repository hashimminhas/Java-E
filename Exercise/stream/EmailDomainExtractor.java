package sprint;

import java.util.List;
public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> emails) {
        return emails.stream()
            .filter(e -> e.indexOf("@") == e.lastIndexOf("@") &&
                             e.indexOf("@") > 0 &&
                             e.indexOf("@") < e.length() - 1)
            .map(e -> e.split("@")[1].toLowerCase())
            .distinct()
            .toList();
    }
}