package povtor1;

import java.util.concurrent.ThreadLocalRandom;

public class MainForLessonOne {

    public static void main(String[] args) {
       /*System.out.println("Hello, world!");*/
        /*printHello();*/
        //testVars();

        checkAppraisal();


  }




    static void printHello() {
      System.out.println("Привет");
      System.out.println("Мы в методе printHello!");
      System.out.println("☺");
  }
    private static void testVars() {
        int varA = 9;
        int varB = 5;

        System.out.println(1.0 * varA / varB);
        System.out.println((double) varA / varB);

        double varDoubleA = 9.1;
        double varDoubleB = 5.0;

        System.out.println(varDoubleA / varDoubleB);

        int result = varA / varB;

        boolean isRed = false;

        char chr1 = '☺';
        char chr2 = 1234;
        System.out.println(chr1);
        System.out.println(chr2);
        System.out.println((char) (chr1 + chr2));

        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + ", " + worldStr + "!");
        System.out.println(helloStr + ", " + worldStr + "!" + (3 + 5));
    }

    private static void checkAppraisal() {
        int appraisal = 5;
        System.out.println("Школьник принес оценку: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец! Так держать!");
        } else if (appraisal == 4) {
            System.out.println("Молодец, но ты можешь лучше!");

            //   } else if (appraisal == 3 || appraisal == 2 || appraisal == 1) {
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Готовь уроки лучше!");
        } else {
            System.out.println("Не мухлюй! Говори правду!");
        }
        System.out.println("Проверка дневника окончена");

    }}
