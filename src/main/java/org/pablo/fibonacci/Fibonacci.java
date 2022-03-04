package org.pablo.fibonacci;

public class Fibonacci {
    public int compute(int value){
        int result;
        if (value == 0){
            result = 0;
        }else if (value == 1){
            result = 1;
        }else {
            result = compute(value-1) + compute(value-2);
        }
        return result;
    }
}
