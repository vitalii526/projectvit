import java.util.Arrays;

public class Domzad3 {
    public static void main(String[] args) {
        massivArray();
        massivSto();
        massivShesti();
        kvadr();
        }




    private static void massivArray() {
        //final int ARRAY_SIZE = 10;
        //int[] data = new int[ARRAY_SIZE];
        int[] data = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    //private static String convertArrayToString(int[] data) {
//        String str = "[";
//        for (int i = 0; i <data.length; i++) {
//            str += data[i];
//            if (i != data.length - 1) {
//                str += ", ";
//            }
//        }
//        str +="]";
//        return str;
//    }

        //return null;
        private static void massivSto() {
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
            System.out.println(Arrays.toString(data));
        }
    private static void massivShesti() {
        int [] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] = data[i] * 2;
            }
        }
        System.out.println(Arrays.toString(data));
    }

    public static void kvadr() {
        int[][] data = new int[4][4];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0, x = data[i].length - 1; j < data[i].length; j++, x--) {
                if (i == j || i == x) data[i][j] = 1;
                else data[i][j] = 0;
                System.out.print(data[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


    }