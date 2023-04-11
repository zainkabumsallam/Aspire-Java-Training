package assignments;

public class Assignment2 {

    public static int sumOfEven(int number) {
        return (number == 0) ? 0 : ((number % 2 == 0) ? number + sumOfEven(number - 2) : sumOfEven(number - 1));
    }

    public static int sumOfOdd(int number) {
        return (number == 1) ? 1 : ((number % 2 == 0) ? sumOfOdd(number - 1) : number + sumOfOdd(number - 2));
    }

    public static int sumOfDividableBy7(int number) {
        return (number == 0) ? 0 : ((number % 7 == 0) ? number + sumOfDividableBy7(number - 1) : sumOfDividableBy7(number - 1));
    }


    public static void main(String[] args) {

        int sum1 = sumOfEven(100);
        int sum2 = sumOfOdd(100);
        int sum3 = sumOfDividableBy7(100);

        System.out.println("Sum of even numbers = " + sum1);
        System.out.println("Sum of odd numbers = " + sum2);
        System.out.println("Sum of dividable by 7 numbers = " + sum3);
    }
}