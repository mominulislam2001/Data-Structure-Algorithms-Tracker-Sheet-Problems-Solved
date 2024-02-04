import java.util.Scanner;
//shows wrong answer
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int m = sc.nextInt();

            int res[] = new int[2];
            for(int i = 0;i<arr.length;i++){
            
            
            int dif = Integer.MAX_VALUE;
          
            for(int j=i+1;j<arr.length;j++){

                if (arr[i] + arr[j] == m) {
                    int currentDiff = Math.abs(arr[i] - arr[j]);
                    
                    if (currentDiff < dif) {
                        dif = currentDiff;
                        res[0] = arr[i];
                        res[1] = arr[j];
                    }
                }          

            }

            

        }

           
            System.out.printf("Peter should buy books whose prices are %d and %d.", res[0], res[1]);
            System.out.println();
            System.out.println();
            
        }

        sc.close();
    }

    
}
