package org.example.homeworkten1;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2)
    {
//        if (op == "+"){
//            return v1 + v2;
//        }
//        else if (op == "-"){
//            return v1 - v2;
//        }
//        else if (op == "*"){
//            return v1 * v2;
//        }
//        else
//            return v1 / v2;

        switch (op){
            case "+": return v1 + v2;
            case "-": return v1 - v2;
            case "*": return v1 * v2;
            case "/": return v1 / v2;
        }
        return 0;
    }
}