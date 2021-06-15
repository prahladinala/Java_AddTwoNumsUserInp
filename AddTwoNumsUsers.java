import java.util.Scanner;

public class AddTwoNumsUsers {
    public static void main(String[] args){
//        void => what is void ?
//             When we create a function Sometimes it returns something sometimes it may not
//             void means that the function returns null
//             Some functions returns integers| Float | Double| String.....
        int myFirstNumber;
        int mySecondNumber;
        int result;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        myFirstNumber = in.nextInt();

        System.out.println("Enter number 2: ");
        mySecondNumber = in.nextInt();

        System.out.println("Your added value is: ");
        result = myFirstNumber + mySecondNumber;
        System.out.println(result);

//        TODO: edit to take string inputs
    }
}
