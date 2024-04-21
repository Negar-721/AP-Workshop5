public class AUTMath {

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subtrack(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int divide(int num1, int num2) {
        assert num2 != 0;
        int result = num1 / num2;
        return result;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static int pow(int base, int power) {
        if (power == 0) {
            return 1;

        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;
    }
}