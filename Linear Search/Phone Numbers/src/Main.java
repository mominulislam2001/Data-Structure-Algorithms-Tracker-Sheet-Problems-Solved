import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
            int c = 0;
        
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '8'){
                    c++;
                }
            }
    
           
    
            boolean flag = false;
            int res = -1;
            for(int i = c;i>=0;i--){
                if(s.length()/11 >= i){
                    flag = true;
                    res = i;
                    break;
                }
                
    
            }
    
            if(flag)   System.out.println(res);
            
            else   System.out.println("0");
            
        
       sc.close();
      

        
        
    }
}
