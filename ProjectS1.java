
import java.util.Scanner;

public class ProjectS1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Welcome To The BMI Calculator \n");

        System.out.print("Please Enter Your Height : "); 
        double Height = input.nextDouble();

        System.out.print("\n Please Enter Your Weight : ");
        double Weight = input.nextDouble();

        double BMI = Weight / (Height * Height);
        System.out.printf("\n Your BMI Is %.2f , And Based On The Calculated BMI You Have " ,BMI );

        if (BMI < 18.5) {
            System.out.println("(Underweight)");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("(Normal Weight)");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("(Overweight)");
        } else {
            System.out.println("(Obese)");
        }

    }

}
