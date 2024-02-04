import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
       
        while(t>0){
            t--;
            k++;
            int a= sc.nextInt();
            int b = sc.nextInt();
            int total = 0;
           
            if(a<=b){
                for(int i = b;i>0;i--){
                    total = total + 4;
                    if(i==a){
                    
                        total += 11;
                    
                    }
                }
                total += 8;
            }else if(b<a){

                for(int i = b;i<a;i++){
                    
                    total = total + 4;

                }

                total = total + 11;

                for(int i = a;i>0;i--){
                    total = total + 4;
                    
                }
                total += 8;

                

            }
           
            System.out.println("Case "+k+": " +total);
        }
        
        
    }

    
}
