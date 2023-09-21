import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoIntegersApp {
    public static void main(String[] args){

        int[] nums = getInputs();
        System.out.println("The sum is: " + (nums[0] + nums[1]));

    }
    public static int[] getInputs(){
        try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter first number: ");
                int int1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int int2 = scanner.nextInt();
                int[] nums = {int1, int2};
                scanner.close();

                return nums;
            }
            catch(InputMismatchException e){
                System.out.println("Wrong input type, try again");
                return getInputs();
            }
    }
}
