import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean boxes[] = new boolean[5];
        System.out.println(boxes[0]);
        // Read input
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] cowbells = new int[n];
        for (int i = 0; i < n; i++) {
            cowbells[i] = scanner.nextInt();
        }

        
        // Find the optimal box size without binary search
        int maxBoxSize = 0;

        for (int i = k; i >=0; i++) {

            
            int currentSize = cowbells[i] + cowbells[n - k + i];
            maxBoxSize = Math.max(maxBoxSize, currentSize);
        }

        // Output the result
        System.out.println(maxBoxSize);
    }
}
