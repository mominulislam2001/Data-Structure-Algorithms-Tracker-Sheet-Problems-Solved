import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
       
        String s = sc.nextLine();
       
        Stack <Character> stack = new Stack<>();
       
        int cnt  = 0;
      
        for(int i = 0;i<s.length();i++){
           
            char c = s.charAt(i);
            
            if(stack.size() == 0){
                stack.push(c);
            }else{
                if(stack.peek() == c){
                    stack.pop();
                    cnt++;
                }else{
                    stack.push(c);
                }
            }

        }

        if(cnt%2 == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
    }
}
