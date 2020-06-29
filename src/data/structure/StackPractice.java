package data.structure;

import java.util.Random;
import java.util.Stack;

public class StackPractice {





    public static void main(String[] args) {
        Stack<String> stackpractice = new Stack<>();
        stackpractice.push("Library1");
        stackpractice.push("Library2");
        stackpractice.push("Library3");
        stackpractice.push("Library4");
        stackpractice.pop();


        System.out.println("the size of stack" + stackpractice.size());
        System.out.println("peek book" + stackpractice.peek());


        for (int i = 0; i < 20; i++) {
            int numberId = new Random().nextInt(200);












        }


    }
}

