package homework1;

public class DomZad2 {
    public static void main(String[] args) {
        boolean isB = beetwin(3, 8);
        System.out.println(isB);
        System.out.println(beetwin(1, 5));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(-1));
        printWordNTimes("mir", 5);
        visGod(2400);
    }




    private static boolean beetwin(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
    private static void isPositiveOrNegative(int x) {
        if (x >= 0)  {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
    private static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    private static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }

    }
    private static void visGod(int god) {
        if ((god % 4 == 0) && (god % 400 == 0) || (god % 100 != 0)) {System.out.println(god + " високосный");}
        else {System.out.println(god  +  " не високосный");
    }
    }
}


