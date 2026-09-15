public class Pr5 {
    public static void main(String[] args) {
        int result = sum(4,5);
        System.out.println(result);

        int resultTask2 = sum(1,2,3);
        System.out.println(resultTask2);

        boolean resultTask3 = isEven(7);
        System.out.println(resultTask3);

        printMessage("Hello World");
    }

    public static int sum(int a,int b) {
        return a + b;
    }

    public static int sum( int a, int b, int c) {
        return a + b +c;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
