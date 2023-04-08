package project1.lamadaExpressions;

import java.util.function.BiFunction;

public class biFunction {

    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> sum = (x,y) -> x+y;
        System.out.println(sum.apply(5,5));
    }
    
}
