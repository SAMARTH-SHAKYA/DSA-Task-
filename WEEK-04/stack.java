// to push 5 elemensts and reverse 
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);

    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        System.out.println(temp);
        reverse(st);
        st.push(temp);

    }
    
}
