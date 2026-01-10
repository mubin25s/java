public class FindMax {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 42;
        int num3 = 28;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("The maximum number is: " + max);
    }
}
