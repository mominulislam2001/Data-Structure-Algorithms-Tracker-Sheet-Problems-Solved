import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++){
            
            arr[i] = sc.nextInt();

        }

        int target = arr[a-1];
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                if(arr[i]>=target){
                    count++;
                }
            }
            
        }

        System.out.println(count);
    }
}
