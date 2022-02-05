import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc Answer = new Calc();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my basic calculator");
        System.out.println("Please put in the first number of the equation below");
        int num1 = input.nextInt();
        System.out.println("Please put in the second number of the equation below");
        int num2 = input.nextInt();
        int Type = 0;
        while (Type == 0) {
            System.out.println("Please put in the number relator to the type of equation below. 1 = multiplication, 2 = Division, 3 = Addition, 4 = Subtraction");
            Type = input.nextInt();
            if (Type == 1) {
                Answer.Multiplication(num1, num2);
            } else if (Type == 2) {
                Answer.Division(num1, num2);
            } else if (Type == 3) {
                Answer.Addition(num1, num2);
            } else if (Type == 4) {
                Answer.Subtraction(num1, num2);
            }
            else {
                Type = 0;
            }
        }
    }
}
