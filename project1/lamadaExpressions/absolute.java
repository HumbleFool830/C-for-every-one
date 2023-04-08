package project1.lamadaExpressions;
import java.util.function.Function;

public class absolute {
    public static void main(String[] args) {
        Function<Integer,Integer> absolute = ( x) -> x<0 ? -x : x;
        System.out.println(absolute.apply(-100));

        Function<Integer,Integer> sumofNumber = (x) -> {
            return x+100;
        };

        System.out.println(sumofNumber.apply(100));
        
}
    
}
