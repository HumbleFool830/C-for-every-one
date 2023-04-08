import java.util.function.Function;

public class functionalInterface{
protected static class myMyth{
    public static Integer triple(int num) {
        return num*3;  
    }}
    public static void main(String[] args) {

        // myMyth sunil = new myMyth();
        // System.out.println(sunil.triple(10);

        // By using functional interface.
        Function<Integer,Integer> math = myMyth :: triple;
        Integer result = math.apply(5);
        System.out.println(result);

        TriFunction<Integer,Integer,Integer,Integer> add3 = (x,y,z) -> x+y+z;

        System.out.println(add3.apply(2, 2,2));


        NoArgFunction<String> sayHello = () -> "hey hi sunil";

        System.out.println(sayHello.apply());

    }
}