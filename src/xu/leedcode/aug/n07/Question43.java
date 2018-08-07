package xu.leedcode.aug.n07;

public class Question43 {
    private static int CHAR_START_NUM = '0';
    private String numA = "";
    private String numB = "";

    public String multiply(String num1, String num2) {
        numA = num1;
        numB = num2;
        int aLength = numA.length();
        int bLength = numB.length();
        int maxLength = Math.max(aLength, bLength)+1;
        int resultLength = (bitMultipleOfTwoNumInBit(aLength, bLength)>10) ? maxLength+1: maxLength;
        char[] tmpChars = new char[resultLength];
        for (int i=0; i<resultLength; i++){
            tmpChars[i] = calBit(i);
        }
        return String.valueOf(tmpChars);
    }

    private char calBit(int num){
        if (num == 1){
            return (char) (CHAR_START_NUM + bitMultipleOfTwoNumInBit(0,0));
        }else{
            int tmpValue = 0;
            for(int i=0; i<num; i++){
                tmpValue+=bitMultipleOfTwoNumInBit(i, num-i);
            }
            return (char) (CHAR_START_NUM + tmpValue%10);
        }
    }

    private int bitMultipleOfTwoNumInBit(int bitOfA, int bitOfB){
        int bitInA = numA.charAt(bitOfA)-CHAR_START_NUM;
        int bitInB = numB.charAt(bitOfB)-CHAR_START_NUM;
        return (bitInA*bitInB<0)? 0 : (bitInA*bitInB)%10;
    }
}
