import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean well =isbaland(input);
        System.out.println(well);

    }
    public static boolean isbaland(String expression){
        Stack<Character> stack = new Stack<>();
        for (char s:
                expression.toCharArray()) {
            if (s == '(' ){
                stack.push(s);
            }if (s == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
