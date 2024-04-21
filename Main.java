import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("1# sum");
        System.out.println("2# subtract");
        System.out.println("3# multiply");
        System.out.println("4# divide");
        System.out.println("5# factorial");
        System.out.println("6# pow");
        System.out.println("choose your option !");
        System.out.println("-------------------");
        int choice;
        int res;
        int predictedResult;
        while (true) {
            choice = scanner.nextInt();
            if (!(1 <= choice && choice <= 6)) {
                System.out.println("choose between 1 to 6");

            } else {
                break;
            }
        }
        if (choice == 5) {
            System.out.println("enter the number: ");
            a = scanner.nextInt();
            b = 0;
        }
        else {
            System.out.println("enter 1st number");
            a = scanner.nextInt();
            System.out.println("enter 2nd number");
            b = scanner.nextInt();
        }
        System.out.println("enter your predicted result");
        predictedResult = scanner.nextInt();
        switch (choice) {
            case 1:
                res = AUTMath.sum(a, b);
                break;
            case 2:
                res = AUTMath.subtract(a, b);
                break;
            case 3:
                res = AUTMath.multiply(a, b);
                break;
            case 4:
                res = AUTMath.divide(a, b);
                break;
            case 5:
                res = AUTMath.factorial(a);
                break;
            case 6:
                res = AUTMath.pow(a, b);
                break;
            default:

                res = 9999999;
        }

        assertResult(res, predictedResult);

    }

    public static void assertResult(int res, int predictedResult) {

        if (res == predictedResult) {
            System.out.println("all good!");
            return;

        }
        System.out.println("there is something wrong!");
        System.exit(1);

    }
}