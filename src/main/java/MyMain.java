import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        int x = (int) (Math.random() * 10 + 10);
        return x;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {

        int a = randomTeen();
        int b = randomTeen();
        int c = randomTeen();

        System.out.println("The three random numbers are: " + a + ", " + b + ", " + c);
        System.out.println("The Largest Number is: " + Mathey.max(a, b, c));
        System.out.println("The Smallest Number is: " + Mathey.min(a, b ,c));

        System.out.println();

        System.out.println("Mathey.max tests: ");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(2.1, 1.5)); //2.1
        System.out.println(Mathey.max(1.5, 2.1)); //2.1
        System.out.println(Mathey.max(2.1, 1.5, 3.5,2.4)); //3.5
        System.out.println();

        System.out.println("Random Int Tests: ");
        System.out.println(Mathey.randomInteger(0,5)); // 1-5
        System.out.println(Mathey.randomInteger(5)); //0-5
        System.out.println();

        System.out.println("Pow Tests: ");
        System.out.println(Mathey.pow(2,5)); //32
        System.out.println(Mathey.pow(3,4));//81
        System.out.println(Mathey.pow(5,2));//25
        System.out.println();

        System.out.println("Abs Tests: ");
        System.out.println(Mathey.abs(-4)); //4
        System.out.println(Mathey.abs(0)); //0
        System.out.println(Mathey.abs(2)); //2
        System.out.println();

        System.out.println("Round Tests: ");
        System.out.println(Mathey.round(2.2)); //2
        System.out.println(Mathey.round(0.4)); //0
        System.out.println(Mathey.round(2.0)); //2
        System.out.println(Mathey.round(0.5)); //1
        System.out.println();

        System.out.println("Floor Tests: ");
        System.out.println(Mathey.floor(2.2)); //2
        System.out.println(Mathey.floor(0.4)); //0
        System.out.println(Mathey.floor(2.0)); //2
        System.out.println(Mathey.floor(0.5)); //0
        System.out.println();

        System.out.println("Ceil Tests: ");
        System.out.println(Mathey.ceil(4.99)); //5
        System.out.println(Mathey.ceil(0.4)); //1
        System.out.println(Mathey.ceil(2.0)); //3
        System.out.println(Mathey.ceil(0.5)); //1
        System.out.println();

        System.out.println("Sqrt Tests: ");
        System.out.println(Mathey.sqrt(25.0)); //5
        System.out.println(Mathey.sqrt(64.0)); //8
        System.out.println(Mathey.sqrt(5.0)); //2.236067977499978
        System.out.println();

        System.out.println("Pythag Example: ");
        System.out.println("When a = 5, and b = 12, c = " + Mathey.pythag(5,12)); //13
    }

}


