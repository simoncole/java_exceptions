import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomInts {
    public static void main(String[] args){ 
        int[] ints = populateArr();
        getUserElement(ints);
    }

    public static int[] populateArr() {
        int [] ints = new int[100];
        for(int i = 0; i < 100; i++){
            Random rand = new Random();
            ints[i] = rand.nextInt(1000);
        }
        return ints;
    }

    public static void getUserElement(int[] ints) {
        Scanner scanner = new Scanner(System.in);
        int index;
        try {
            System.out.print("Enter the index of the int you would like to see: ");
            index = scanner.nextInt();
            int element = ints[index];
            System.out.println(element);
        }
        catch(InputMismatchException e) {
            System.out.println("Enter an integer for the index, try again");
            getUserElement(ints);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("The index must be less than 100, try again");
            getUserElement(ints);
        }
        scanner.close();

    }
}
