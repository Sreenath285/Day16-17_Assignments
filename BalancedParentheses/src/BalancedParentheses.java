public class BalancedParentheses {

    public static void main(String[]args){

        StackArray<String> list = new StackArray<>();
        String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";

        //search for every parenthesis
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            if (item == '('){
                list.push(item);
            } else if (item == ')'){
                list.pop();
            }
        }

        if(list.isEmpty()){
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Unbalanced Parentheses");
        }
    }
}
