package Lambdas;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class GreetMain {

    public static void main(String[] args) {

        //method override using a class implementing an interface
        Greeting greet = new HelloGreet();
        greet.sayHello();

        //method override directly from interface
        Greeting greet2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Peeps from direct override");
            }
        };

        greet2.sayHello();

        //Override using Lambdas
        Greeting greet3 = () -> System.out.println("Hello from Lambda");
        greet3.sayHello();

        //Lambda for calculate interface

        Calculate cal = (int x, int y) -> {
            Random rand = new Random();
            int randNum = rand.nextInt(200);
            return x * y + randNum;
        };

        System.out.println("Calculation is: "+ cal.calculateIt(4, 2));

        //using built in IntBinaryOperator Interface

        IntBinaryOperator cal2 = (int x, int y) -> {
            Random rand = new Random();
            int randNum = rand.nextInt(200);
            return x * y + randNum;
        };

        System.out.println("New Calculation is: "+ cal2.applyAsInt(4, 9));
    }
}
