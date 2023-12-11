public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 12345678; num <= 98765432; num++) {
            if (hasUniqueDigits(num) && num % 12345 == 0) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("Total count: " + count);
    }

    public static boolean hasUniqueDigits(int number) {
        boolean[] digits = new boolean[10];
        while (number > 0) {
            int digit = number % 10;
            if (digits[digit]) {
                return false;
            }
            digits[digit] = true;
            number /= 10;
        }
        return true;
    }
}