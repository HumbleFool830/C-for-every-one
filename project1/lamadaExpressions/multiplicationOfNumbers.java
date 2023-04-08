package project1.lamadaExpressions;
import java.util.function.BiFunction;

public class multiplicationOfNumbers {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> mutiply = (x,y) -> x*y;
        System.out.println(mutiply.apply(3,4)); 
        
    }

}
