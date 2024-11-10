package Lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior java 8
         */
        Runnable runnable = new Runnable(){
          @Override
          public void run() {
              System.out.println("Inside Runnable 1");
          }
        };

        new Thread(runnable).start();

        /**
         * Using Java 8 Lambda
         * Lambda syntax -: () -> {}
         */
        Runnable runnableLambda = () -> System.out.println("Inside Runnable Lambda");
        new Thread(runnableLambda).start();

        new Thread(()->System.out.println("Inside Runnable2")).start();

    }
}
