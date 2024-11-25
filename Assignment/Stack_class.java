
public class Stack_class {

    int stack[], tos, maxsize;

    void create_stack(int size) {
        tos = -1;
        maxsize = size;
        stack = new int[maxsize];
    }

    void push(int element) {
        stack[++tos] = element;
    }

    int pop() {
        int temp = stack[tos];
        tos--;
        return temp;
    }

    int peek() {
        return stack[tos];
    }

    boolean is_Empty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean is_Full() {
        if(tos == maxsize - 1) {
            return true;
        } else {
            return false;
        }
    }

    void print_stack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

}
