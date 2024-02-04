import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            t--;

            String s = sc.nextLine();
            int countOne = 0;
            for(int i =0;i<s.length();i++){
        
                if(s.charAt(i)=='1'){
                    countOne++;
                }
            }

            int countX = -1;
            int index  = -1;
            if(s.charAt(0) == '1'){
                countX = 0;
                for(int i = 0;i<s.length();i++){

                    if(s.charAt(i) == '1'){
                        countX++;
                    }else{
                        break;
                    }

                }

            }else{

                for(int i = 0;i<s.length();i++){
                    if(s.charAt(i) == '1'){
                       index = i;
                       break;
                    }
                }


            }
            int countY = -1;
            if(countX == -1 && index != -1){
                countY = 0;
                for(int i = index;i<s.length();i++){

                    if(s.charAt(i) == '1'){
                        countY++;
                    }else{
                        break;
                    }
                }

            }

            if(countX != -1){
                if(countX == countOne) System.out.println("YES");
                else System.out.println("NO");
            }else{
                if(countY == countOne ) System.out.println("YES");
                else System.out.println("NO");
            }
           

           

          
        }

        sc.close();
    }
}
