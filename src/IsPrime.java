public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(159));
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return true;
            }
            i = i + 6;
        }

        return true;
    }

}
