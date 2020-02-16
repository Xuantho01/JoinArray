import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value to insert: ");
//        int value = scanner.nextInt();
//        System.out.println("enter index: ");
//        int index = scanner.nextInt();
        int size1;
        int[] array1;
            System.out.println("Enter size1: ");
              size1 = scanner.nextInt();
              array1 = new int[size1];
            int i = 0;
            while(i < array1.length){
            System.out.print("Enter value " + (i + 1) + ": ");
              array1[i] = scanner.nextInt();
              i++;
            }

        int size2;
        int[] array2;
            System.out.println("Enter size2: ");
            size2 = scanner.nextInt();
        array2 = new int[size2];
        int j = 0;
        while(j < array2.length){
            System.out.print("Enter value" + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }

        int size3 = size1 + size2;
        int[] array3;
        array3 = new int[size3];
        for(int k = 0; k < array1.length;k++){
            array3[k] = array1[k];
        }
        for(int n = 0; n < array2.length;n++){
            array3[array1.length+n] = array2[n];
        }
        System.out.println("Array after join: ");
        for (int m = 0; m < array3.length; m++){
            System.out.print(array3[m]+"\t");
        }

    }
}
