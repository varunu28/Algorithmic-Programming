import java.util.Stack;

public class SortStack {

    public Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> tempStack;
        int size = stack.size();
        int sortedCount = 0;

        while (size > 0) {
            tempStack = new Stack<>();
            int min = Integer.MAX_VALUE;
            int minCount = 1;
            int popCount = stack.size() - sortedCount;

            while (popCount -- > 0) {
                int poppedNum = stack.pop();
                if (min == poppedNum) {
                    minCount++;
                }
                else if (min > poppedNum){
                    min = poppedNum;
                    minCount = 1;
                }

                tempStack.push(poppedNum);
            }

            size -= minCount;

            while (minCount-- > 0) {
                stack.push(min);
                sortedCount++;
            }

            while (!tempStack.empty()) {
                int t = tempStack.pop();
                if (t != min) {
                    stack.push(t);
                }
            }
        }

        return stack;
    }
}

