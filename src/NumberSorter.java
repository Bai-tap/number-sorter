import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        displaySortedNumber(num1, num2, num3);
    }
    public static void displaySortedNumber(int num1, int num2, int num3) {
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.printf("%s%s%s",num1,num2,num3);
    }
}
