package xu.leedcode.day03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question8 {
    public int myAtoi(String str) {
        String patternStr = "^ *([-+]?)(\\d+)";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher mRst = pattern.matcher(str);
        if(!mRst.find()) return 0;
        String signal = mRst.group(1);
        String value = mRst.group(2);
        if (signal.equals("")) signal = "+";
        try {
            return Integer.parseInt(signal + value);
        } catch (NumberFormatException ne) {
            return (signal.compareTo("-") != 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}