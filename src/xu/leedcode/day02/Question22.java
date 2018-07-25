package xu.leedcode.day02;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Question22 {
    private ArrayDeque<ArrayList<String>> parsDeque;
    private static final String PARENTHESIS_COUPLE = "()";
    private static final String PARENTHESIS_LEFT = "(";
    private static final String PARENTHESIS_RIGHT = ")";

    public List<String> generateParenthesis(int numOfPars) {
        parsDeque = new ArrayDeque<ArrayList<String>>(numOfPars);
        parsDeque.add(new ArrayList<String>());
        ArrayList<String> listOne = new ArrayList<String>();
        listOne.add("()");
        parsDeque.add(listOne);
        for(int i=2; i<=numOfPars; i++){
            ArrayList<String> lastArr = parsDeque.getLast();
            ArrayList<String> newArr = new ArrayList<String>();
            for(String eachString : lastArr){
                newArr.add(eachString+PARENTHESIS_COUPLE);
                newArr.add(PARENTHESIS_COUPLE+eachString);
                newArr.add(PARENTHESIS_LEFT+eachString+PARENTHESIS_RIGHT);
            }
            newArr.remove(0);
            parsDeque.add(newArr);
        }
        return parsDeque.getLast();
    }
}
