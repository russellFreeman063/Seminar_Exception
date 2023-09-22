package Homework_2;

public class Task_2 {

    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1,1,1,1,1,1,1,1,1,1,1,1};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
