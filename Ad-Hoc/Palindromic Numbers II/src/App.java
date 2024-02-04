import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static boolean isPalindrome(int n){
        int copy = n;
        int res= 0;
        while(n>0){
            int digit = n%10;
            res = res*10 + digit;
            n = n/10;
        }
      
        if(copy == res){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int i = 0;
        while (t>0) {
           t--;
           i++;
           int n = sc.nextInt();

           if(isPalindrome(n)){
            System.out.println("Case "+i+":"+" Yes");
           }else{
            System.out.println("Case "+i+":"+" No");
           }
            
        }

        sc.close();
    }
}
