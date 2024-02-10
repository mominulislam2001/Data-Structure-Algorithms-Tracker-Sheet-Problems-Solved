import java.util.Scanner;

public class Main {

    private static int calcSum(int i, int mid,int arr[]) {
        int sum = 0;
        for (int j = i; j <= mid; j++) {
            sum += arr[j];
        }
        return sum;
    }
   
public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
  
    int n1 = sc.nextInt();
    int arr1 [] = new int[n1];
    for(int i = 0;i<n1;i++){
       
        arr1[i] = sc.nextInt();

    }
    int n2  = sc.nextInt();

    int arr2[] = new int[n2];
    for(int i = 0;i<n2;i++){
       5
        arr2[i] = sc.nextInt();

    }
   

    for (int i = 0; i < n2; i++) {
        int low = 0;
        int high = n1 - 1;

        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            int sumBeforeMid = calcSum(0, mid, arr1);

            if (sumBeforeMid >= arr2[i]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        
        if (low > n1 - 1) {
            System.out.println(n1);
        } else if (arr2[i] <= calcSum(0, low, arr1)) {
            System.out.println(low + 1);
        } else {
            System.out.println(low + 2);
        }
    }
}

    
}
