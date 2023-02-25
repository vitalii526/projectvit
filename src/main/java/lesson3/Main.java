package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //arraysIntro();
        //iterate();

 //       copyAndUnionArrays();

        //       for (int i=0; i < initialArray.length; i++) {
 //           union[i] = initialArray[i];
  //      }
  //      System.out.println(Arrays.toString(union));

  //      for (int i = initialArray.length, j = 0; j < additionalArray.length; i++, j++) {
 //           union[i] = additionalArray[j];
  //      }
  //      System.out.println(Arrays.toString(union));
  //      dimensialArray();

 //       referencedTypeArray();
    }

    private static void referencedTypeArray() {
        boolean[] booleans = new boolean[5]; // [false, false, false, false, false]

        String[] strings = new String[3]; // [null, null, null]
        System.out.println(Arrays.toString(strings));
        strings [1] = "My Word";
        System.out.println(Arrays.toString(strings));
    }

    private static void dimensialArray() {
        int [][] dimensialArray = new int [2][4]; // [[0, 0, 0, 0], [0, 0, 0, 0]]
        dimensialArray [0][1] = 5;
        System.out.println(dimensialArray[0][1]);
        System.out.println(dimensialArray[1][3]);
    }

    private static void copyAndUnionArrays() {
        int[] initialArray = {1, 2, 3, 4, 5};
        int[] additionalArray = {6, 7, 8, 9, 10};

        int[] union = new int[initialArray.length + additionalArray.length];


        System.arraycopy(initialArray, 0, union, 0, initialArray.length);
        System.out.println(Arrays.toString(union));
        System.arraycopy(additionalArray, 0, union, initialArray.length, additionalArray.length);
        System.out.println(Arrays.toString(union));
    }

    private static void iterate() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(arraySum(array));

        int[] array2 = {-1, -1, -1};
        System.out.println(arraySum(array2));
    }

    private static int arraySum(int[] array) {
        int sum = 0;
     //   for (int i=0; i< array.length; i++) {
       //     sum += array[i];
        //}
        for (int a: array) {
            sum +=a;
        }
        return sum;
    }

    private static void arraysIntro() {
        int[] emptyArray = new int[5];// [0, 0, 0, 0, 0]
        int[] createdArray = {1, 2, 3, 4, 5};// [1, 2, 3, 4, 5]

        int thirdElement = createdArray[2];
        System.out.println(thirdElement);
        String emptyArrayAsString = Arrays.toString(emptyArray);
        System.out.println(emptyArrayAsString);
        System.out.println(Arrays.toString(createdArray));

        emptyArray[3] = -1;
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 100;
        System.out.println(Arrays.toString(emptyArray));
    }
}
