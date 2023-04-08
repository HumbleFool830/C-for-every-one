import java.util.function.Function;

public class sumOfNnumbers {
    protected static class sum{
        public static Integer sumOfN(int n) {
            if(n==1)
            {
                return 1;
            } 
            else{
                return n+sumOfN(n-1);
            }           
        }
    }
    public static void main(String[] args) {
        Function<Integer,Integer> sumofNumber = sum :: sumOfN;
        Integer result = sumofNumber.apply(10);
        System.out.println(result);
    }
}
