public class Test {
    public static void main(String[] args) {
        int[]  array = new int[]{1, -2, 7, 1, 2};
//
//    int k = 0;
//    int sum = array[0];
//    for (int i = 1; i < array.length; i++) {
//        sum = sum + array[i];
//    }
//        System.out.println("\n");
//        System.out.println(sum);
//

//
//    int result = array[0];
//        for (int i = 1; i < array.length; i++) {
//            result = result ^ array[i];
//        }
//            System.out.print(result);


//        boolean whileTrue = true;
//        int countOfFors = 0;
//        while (whileTrue) {
//            whileTrue=false;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int first = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = first;
//                    whileTrue=true;
//                }
//            }
//            countOfFors++;
//        }
//            for (int a : array) {
//                System.out.print(a + " ");
//            }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                while(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
            System.out.print(array[i] + " ");
        }
        }
    }
