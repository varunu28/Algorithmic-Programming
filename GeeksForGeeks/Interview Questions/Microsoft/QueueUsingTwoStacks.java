import java.util.Stack;

public class QueueUsingTwoStacks {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    void insert(int num) {
        s1.push(num);
    }

    int remove() {
        if (s1.empty()) {
            return -1;
        }

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        int num = s2.pop();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }

        return num;
    }
}
