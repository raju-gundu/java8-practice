import java.util.stream.IntStream;

/**
 * This code differentiates between Imperative and declarative way of coding
 * Sum of 100 numbers
 */
public class ImperativeVsDeclarativeEx1 {
    public static void main(String[] args) {
        /**
         * Imperative - how style of programming
         */
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum using imperative approach " + sum);

        /**
         * Declarative - what style of programming
         */
        int sum1 = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum using declarative approach " + sum1);
    }


}
