package assignments;

public class Assignment1 {

    public static void main(String[] args) {

        //Sum of even numbers from 0 to 100 using for, while, and do while
        //for
        int sumOfEvenFor = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumOfEvenFor += i;
        }
        System.out.println("sumOfEvenFor = " + sumOfEvenFor);

        //while
        int sumOfEvenWhile = 0;
        int i = 0;
        while (i <= 100) {
            sumOfEvenWhile += i;
            i += 2;
        }
        System.out.println("sumOfEvenWhile = " + sumOfEvenWhile);

        //do while
        int sumOfEvenDoWhile = 0;
        i = 0;
        do {
            sumOfEvenDoWhile += i;
            i += 2;
        } while (i <= 100);
        System.out.println("sumOfEvenDoWhile = " + sumOfEvenDoWhile);


        //Sum of odd numbers from 0 to 100 using for, while, and do while
        //for
        int sumOfOddFor = 0;
        for (i = 1; i <= 100; i += 2) {
            sumOfOddFor += i;
        }
        System.out.println("sumOfOddFor = " + sumOfOddFor);

        //while
        int sumOfOddWhile = 0;
        i = 1;
        while (i <= 100) {
            sumOfOddWhile += i;
            i += 2;
        }
        System.out.println("sumOfOddWhile = " + sumOfOddWhile);

        //do while
        int sumOfOddDoWhile = 0;
        i = 1;
        do {
            sumOfOddDoWhile += i;
            i += 2;
        } while (i <= 100);
        System.out.println("sumOfOddDoWhile = " + sumOfOddDoWhile);


        //Sum of numbers dividable by 7 from 0 to 100 using for, while, and do while
        //for
        int dividableBy7For = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                dividableBy7For += i;
            }
        }
        System.out.println("dividableBy7For = " + dividableBy7For);

        //while
        int dividableBy7While = 0;
        i = 1;
        while (i <= 100) {
            if (i % 7 == 0) {
                dividableBy7While += i;
            }
            i += 1;
        }
        System.out.println("dividableBy7While = " + dividableBy7While);

        //do while
        int dividableBy7DoWhile = 0;
        i = 1;
        do {
            if (i % 7 == 0) {
                dividableBy7DoWhile += i;
            }
            i += 1;
        } while (i <= 100);
        System.out.println("dividableBy7DoWhile = " + dividableBy7DoWhile);
    }
}