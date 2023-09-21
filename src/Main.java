import java.util.Scanner;
// I have neither given nor received any unauthorised aid on this piece of work.
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // add() method
        System.out.println("Please enter an integer: ");
        int numOne = userInput.nextInt();
        System.out.println("Please enter another integer: ");
        int numTwo = userInput.nextInt();
        int resultOne = add(numOne,numTwo);
        System.out.println(resultOne);

        // greeting() method
        System.out.println("\nPlease enter a name: ");
        String name = userInput.next();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);


        //add() method
        System.out.println("\nEnter four numbers separated a space:");
        int a = userInput.nextInt();
        System.out.println("Enter a second number:");
        int b = userInput.nextInt();
        System.out.println("Enter a third number:");
        int c = userInput.nextInt();
        System.out.println("Enter a fourth number:");
        int d = userInput.nextInt();
        int resultThree = add(a,b,c,d);
        System.out.println(resultThree);

        //printMe() method
        System.out.println("\nWrite anything you like: ");
        printMe(userInput.nextLine());
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static String greeting(String name) {
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne, numTwo), add(numThree, numFour));
    }

    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}
