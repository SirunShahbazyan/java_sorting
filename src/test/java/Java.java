public class Java {
    public static void main(String[] args) {
//        int[] array = new int[] {1, 45, 78, 89, -25};


//        int[] intArray = new int[6];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i+1;
//            System.out.print(intArray[i] + " ");
//
//        }
//
//        System.out.println("\n\n");
//
//        int count =0;
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] % 2 != 0) {
//                count++;
//            }
//        }
//        System.out.print(count + " ");

//        int count = 0;
//        int[] intArray = new int[25];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i + 1;
//            if (intArray[i] % 2 != 0) {
//                count++;
//            }
//        }
//          System.out.print(count);
//
//        int count =0;
//        int[] array = {1,4,8,9,7,8,12,14,22};
//                for (int i = 0; i<array.length; i++){
//                    System.out.print(array[i] + " ");
//
//                if(array[i]%2==0){
//                    count++;
//                }
//
//                }
//                    System.out.println("\n");
//                    System.out.println(count);

//
//        for (int i = 0; i < intArray.length; i++) {
//            if (i >= 8 && i <= 21)
//
//                System.out.print(i + " ");

//        for (int i : intArray) {

//            System.out.print(intArray[i]);
//        }

//        }

//        for (int i = 0; i < intArray.length; i++) {
//            if (i % 3 == 0  || i % 4 == 0)
//
//                System.out.print(i + " ");
//        }

//        int count = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            if (i % 2==0)
//                count++;
//            System.out.print(i + " ");
//
//        }
//
//            System.out.print("\n\n");
//            System.out.print(count + " ");

//        int sum = array[0];


//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + " ");
//        }


//        sum = sum + array[i];
//        System.out.print("\n");
//        System.out.print(sum + " ");

        int[] array1;
        array1 = new int[] {5, 10, 5, 12, 10};
        int res = array1[0];
        for (int i = 1; i < array1.length; i++) {
            res = res ^ array1[i];

        }System.out.print(res);
    }
}



