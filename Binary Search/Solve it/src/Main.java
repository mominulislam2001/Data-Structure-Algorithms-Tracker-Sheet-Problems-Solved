import java.util.Scanner;

public class Main {

    static int p, q, r, s, t, u;
    static double EPS = 1e-7;

    public static double equation(double x) {
        return p * Math.exp(-x) + q * Math.sin(x) + r * Math.cos(x) + s * Math.tan(x) + t * x * x + u;
    }

    public static double bisectionMethod() {
      
        double low = 0, high = 1;
        while (Math.abs(low - high) > EPS) {
            
            double x = (low + high) / 2;
            
            if (equation(low) * equation(x) <= 0) {
                high = x;
            
            } else {
                low = x;
            }
      
        }

        return (low + high) / 2;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
           
            p = sc.nextInt();
            q = sc.nextInt();
          
            r = sc.nextInt();
           
            s = sc.nextInt();
            t = sc.nextInt();
            u = sc.nextInt();

            if (equation(0.0) * equation(1.0) > 0) {
               
                System.out.println("No solution");
          
            } else {
              
                double res = bisectionMethod();
              
                System.out.printf("%.4f\n", res);
            }
        }

        sc.close();
    }
}
