import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mommify {
    public String mommify(String input) {
        int vowelCount = 0;
        Pattern pattern = Pattern.compile("[aeiou]{1}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            vowelCount++;
        }

        if ((vowelCount / (float) input.length()) >= 0.3) {
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                String result1 = matcher.replaceAll("Mommy");
                System.out.println(result1);
                Pattern pattern1 = Pattern.compile("[aeiou]{2,}");
                Matcher matcher1 = pattern1.matcher(result1);
                if (matcher1.find()) {
                    String result = matcher1.replaceAll("Mommies");
                    return result;
                }
                return result1;
            }
        }
        return input;
    }
}