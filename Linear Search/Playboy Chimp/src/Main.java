import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int shorterFunc(int[] arr, int lHeight) {
        int low = 0;
        int high = arr.length - 1;
        int shorter = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < lHeight) {

                shorter = arr[mid];
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return shorter;
    }

    private static int tallerFunc(int[] arr, int lHeight) {

        int low = 0, high = arr.length - 1;
        int taller = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > lHeight) {

                taller = arr[mid];
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        return taller;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            int el = sc.nextInt();
            arr[i] = el;

        }

        int t = sc.nextInt();

        while (t > 0) {
            t--;

            int lHeight = sc.nextInt();

            int taller = tallerFunc(arr, lHeight);

            int shorter = shorterFunc(arr, lHeight);

            if (shorter == -1) {
                
                System.out.print("X ");
           
            }else {
               
                System.out.print(shorter + " ");
           
            }

            if (taller == -1) {
              
                System.out.println("X");
            
            }else {
                System.out.println(taller);
            }

        }

        
    }

    
}
