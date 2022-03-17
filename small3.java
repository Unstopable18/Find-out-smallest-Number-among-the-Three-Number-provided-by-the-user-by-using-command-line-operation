import java.util.Scanner;
public class small3
{
    public static void main(String[] args) 
    {
        int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        System.out.println("*************************************************************");
        System.out.println("Smallest Number among the given  "+num1+", "+num2+", "+num3+"  is  "+result);
        System.out.println("*************************************************************");
    }
}