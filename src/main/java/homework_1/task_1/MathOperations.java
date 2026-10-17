package homework_1.task_1;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
    }

    // до DRY
//    public int add(int a, int b) {
//        return a + b;
//    }
//    public int addThreeNumbers(int a, int b, int c) {
//        return a + b + c;
//    }
//    public int addFourNumbers(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    // c DRY
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
