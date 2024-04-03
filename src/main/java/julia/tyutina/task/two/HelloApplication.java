package julia.tyutina.task.two;

public class HelloApplication {

    public static void main(String[] args) {
        campare(3, 3);
        sum(2, 2);
        minus(2, 1);
        multiply(2, 2);
        divide(4, 2);
        campare("first", "first");
        campare("first", "second");

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printEvenNumbers(numbers);
    }

    private static void printEvenNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void campare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void minus(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void campare(String first, String second) {
        if (first.equals(second)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
