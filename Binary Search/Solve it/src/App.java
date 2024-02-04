import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int r = scanner.nextInt();
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int u = scanner.nextInt();

            double result = findSolution(p, q, r, s, t, u);
            System.out.println(formatResult(result));
        }

        scanner.close();
    }

    private static double equationValue(double x, int p, int q, int r, int s, int t, int u) {
        return p * Math.exp(-x) + q * Math.sin(x) + r * Math.cos(x) + s * Math.tan(x) + t * x * x + u;
    }

    private static double findSolution(int p, int q, int r, int s, int t, int u) {
        double EPS = 1e-9;
        double left = 0, right = 1;

        while (left + EPS < right) {
            double mid = (left + right) / 2;
            if (equationValue(mid, p, q, r, s, t, u) > 0) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (Math.abs(equationValue(left, p, q, r, s, t, u)) < EPS) {
            return roundTo4Decimal(left);
        } else {
            return -1; // Indicates no solution
        }
    }

    private static double roundTo4Decimal(double value) {
        return Math.round(value * 10000.0) / 10000.0;
    }

    private static String formatResult(double result) {
        return result >= 0 ? String.format("%.4f", result) : "No solution";
    }
}
