import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
       
        int[] lucky = {4, 7, 47, 74, 44, 444, 447, 474, 477, 777, 774, 744};
       
        int n;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < 12; i++) {
            if (n % lucky[i] == 0) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
