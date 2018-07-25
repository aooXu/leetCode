import xu.leedcode.day02.Question22;

public class Main {
    public static void main(String[] args){
        Question22 q = new Question22();
        for(String eachStr:q.generateParenthesis(3)){
            System.out.println(eachStr);
        }

    }
}
