import java.util.Scanner;



public class Main {

    // public static boolean isAscendingOrder(int[] array) {
    //     for (int i = 0; i < array.length - 1; i++) {
    //         if (array[i] > array[i + 1]) {
    //             return false; 
    //         }
    //     }
    //     return true; 
    // }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            t--;
            int n = sc.nextInt();
        
      
            int arr[] = new int[n];

            for(int i =0;i<arr.length;i++){
                int el = sc.nextInt();
                arr[i] = el;
            }

            int max = arr[0];
            int ans = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {
                
                int dif =  max - arr[i];
                
                ans = Math.max(ans,dif);
              
                max = Math.max(max, arr[i]);
            }



            System.out.println(ans);
           
            
    
        }
        
        
       
          
        }
        
      
}

