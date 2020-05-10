import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    public static boolean isPalindrome(String input) {
        String[] stack = toStack(input);
        String[] queue = toQueue(input);
        for (int i = 0; i < stack.length; i++) {
            if (!stack[i].equals(queue[i])) {
                return false;
            }
        }
        return true;
    }

    private static String[] toStack(String input) {
        String[] stringArray = input.toLowerCase().split("");
        Stack<String> stack = new Stack<>();

        for (String character : stringArray) {
            stack.push(character);
        }

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stack.pop();
        }
        return stringArray;
    }

    private static String[] toQueue(String input) {
        String[] stringArray = input.toLowerCase().split("");
        Queue<String> queue = new LinkedList<>();

        Collections.addAll(queue, stringArray);

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = queue.poll();
        }
        return stringArray;
    }
}
