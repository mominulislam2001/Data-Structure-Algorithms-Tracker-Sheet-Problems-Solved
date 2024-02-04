import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        
      
        int arr1[] = new int[n];
        int arr2[] = new int[n];
            
        for(int i=0;i<n;i++){
            int el = sc.nextInt();
            arr1[i] = el;
            int el2 = sc.nextInt();
            arr2[i] = el2;
        }
        
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i==j) continue;
                if(arr1[i] == arr2[j]) count ++;

            }
        }

       
        System.out.println(count);




        
    }
}
