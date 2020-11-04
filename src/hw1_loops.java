public class hw1_loops {
    public static void main(String[] args) {
        //task1: Create an array and fill it with 2 number.
        int[] numArr1 = new int[2];
        numArr1[0] = 33;
        numArr1[1] = 44;
        //Or
        int[] numArr2 = {33, 44};

        //task2: Create an array and fill it with numbers from 1:1000.
        int[] arr_1_1000 = new int[1000];
        for (int i = 0; i < arr_1_1000.length; i++) {
            arr_1_1000[i] = i + 1;
        }
        System.out.println("First element of the array is " + arr_1_1000[0] + ", last one is " + arr_1_1000[arr_1_1000.length - 1] + ".");

        //task3: Create an array and fill it with odd numbers from -20:20
        int n = 0, lowerLim = -20, upperLim = 20;
        for (int i = lowerLim; i <= upperLim; i++) {
            if (i % 2 != 0) {
                n++;
            }
        }
        /*
         Or
         n = (upperLim - lowerLim) / 2;
         if ((upperLim - lowerLim) % 2 == 1) {
             ++n;
         }
         if ( upperLim% 2 == 1 && lowerLim%2 == 1) {
             ++n;
         }
        */
        int[] arrOfOdds = new int[n];
        for (int i = lowerLim, ind = 0; i <= upperLim; i++) {
            if (i % 2 != 0) {
                arrOfOdds[ind] = i;
                ind++;
            }
        }
        System.out.println(arrOfOdds.length + " is odds' array length and should be the same as n: " + n);
        System.out.println("Last odd number of the array is " + arrOfOdds[arrOfOdds.length - 1]);

        //Task 4: Create an array and fill it. Print all elements which can be divided by 5.
        int[] numArr3 = {33, 25, 65, 34, 54, 4334, 555, 660, 540, 420390, 475, 44, 4, 3, 7};
        for (int i = 0; i < numArr3.length; i++) {
            if (numArr3[i] % 5 == 0) {
                System.out.print(numArr3[i] + " ");
            }
        }

        //task5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        double[] numArr4 = {44, 55, 33.444, 55.555, 31.555, 76.666, 554.666, 8888.33};
        for (int i = 0; i < numArr4.length; i++) {
            if (numArr4[i] > 24.12 && numArr4[i] < 467.23) {
                System.out.print(numArr4[i] + " ");
            }
        }
        System.out.println(); //for next task to pbe printed on the new line

        //task6: Create an array and fill it. Print count of elements which can be divided by 2.
        int[] numArr5 = {334, 2754, 650, 347, 6541, 43342, 550, 660, 540, 849884, 475, 44, 4, 12, 18};
        int countOfDivBy2 = 0;
        for (int i = 0; i < numArr5.length; i++) {
            if (numArr5[i] % 2 == 0) {
                countOfDivBy2++;
            }
        }
        System.out.println("Count of elements which can be divided by 2 of the array is: " + countOfDivBy2);

        /*Task 7: Given an integer, 0< N < 21 , print its first 10 multiples.
        Each multiple N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.*/
        int[] arrNum7 = new int[20];
        for (int i = 1; i <= arrNum7.length; i++) {
            System.out.println("First 10 multiples of " + i + " printed below.");
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + j * i);
            }
        }
        //problem: print non-repeated number applying XOR operator
        int[] ar = {46, 4, 4, 7, 46, 7, 55, 77, 55};
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            result = result ^ ar[i];
        }
        System.out.println(result);

        /* for printing non-repeated numbers
        for (int i = 0; i < ar.length; ++i) {
            int count = 0;
            for (int j = 0; j < ar.length; ++j) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(ar[i]);
            }
        }
        */

    }
}
