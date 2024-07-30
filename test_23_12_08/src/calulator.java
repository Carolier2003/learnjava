/**
 * {@code @Author} 19667
 * {@code @create} 2024/2/1 23:27
 */
public class calulator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String expression = "3+2*6-2";
        char[] arr = expression.toCharArray();
        arrayStack2 numStack = new arrayStack2(10);
        arrayStack2 operStack = new arrayStack2(10);
        // 遍历表达式
        for (int i = 0; i < arr.length; i++) {
            int num;
            // 如果是数字
            if (isNum(arr[i])) {
                num = arr[i] - '0';
                // 处理多位数字
                while (isNum(arr[i + 1])) {
                    i++;
                    num *= 10;
                    num += arr[i] - '0';
                    i++;
                }
                numStack.push(num);
            }
            //如果是符号
            else {
                //如果符号栈为空，则直接入栈
                if (operStack.isEmpty()) {
                    operStack.push(arr[i]);
                }
            }
        }
    }

    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }
}

class arrayStack2 {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    // 构造方法
    public arrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    // 判断是否栈满
    boolean isFull() {
        return top == maxSize - 1;
    }

    // 判断是否栈空
    boolean isEmpty() {
        return top == -1;
    }

    // 入栈
    public void push(int number) {
        if (isFull()) {
            System.out.println("栈已满，无法入栈");
            return;
        }
        top++;
        stack[top] = number;
    }

    // 出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，没有数据");
        }
        int temp = stack[top];
        top--;
        return temp;
    }

    // 展示队列中的元素
    public void showStack() {
        if (isEmpty()) {
            System.out.println("栈空，无法展示数据");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] 的 元素为 %d\n", i, stack[i]);
        }
    }


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
