public class NWD {

    public static void main(String[] args) {

        int a = 156; //2*78
        int b = 78;

        System.out.println("NWD: " + nwd(a, b));
    }

    public static int nwd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return a;
    }

}
