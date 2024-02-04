import java.util.Arrays;
import java.util.Scanner;
//got accepted
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            Arrays.sort(arr);
          
            int low = 0;
            int high = n-1;
            int b1 = -1;
            int b2 = -1;
            while(low<high){

                if(arr[low] + arr[high] < m){
                    ++low;

                }else if(arr[low]+arr[high] == m) {
                     b1 = low;
                     b2 = high;
                     ++low;
                     --high;
                }else{
                    --high;
                }

            }
           
            System.out.printf("Peter should buy books whose prices are %d and %d.", arr[b1],arr[b2]);
            System.out.println();
            System.out.println();
            
        }

        sc.close();
    }

    
}

