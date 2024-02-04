import java.util.Scanner;

public class Main {

    private static boolean isK(long[] arr, long k) {
        long lowerRung = 0;

        for (int i = 0; i < arr.length; i++) {
            long dif = arr[i] - lowerRung;

            if (dif > k) {
                return false;
            } else if (dif == k) {
                k = k - 1;
            }

            lowerRung = arr[i];
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;

        while (t > 0) {
            c++;
            t--;
            int n = sc.nextInt();

            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long low = 0;
            long high = arr[arr.length -1]; 

            

            long res = -1;

            while (low <= high) {
                long mid = (low + high) / 2;

                if (isK(arr, mid)) {
                    res = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println("Case " + c + ": " + res);
        }
    }
}
