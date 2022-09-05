import java.sql.Array;

public class JavaExercises {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1,2,258, 1};

//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                count = count+1;
//                System.out.println(array[i] + " ");
//            }
//
//        }
//        System.out.println();
//        System.out.println(count);

        int max =array[0];
        for (int i = 1; i <array.length ; i++) {
           if(array[i] >max)
//               array[i] =max;
               max = array[i];

        }System.out.print(max);

    }
}


//        System.out.println("\n\n");
//        for (int i = -10; i <array.length; i++) {
//            if (i%2!=0)
//            System.out.print(i+ " ");
//        }

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= n; i++) {
//                for (int j = 0; j <= n - i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//    }
//}




