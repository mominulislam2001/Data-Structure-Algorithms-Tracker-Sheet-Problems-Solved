import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = scanner.nextInt();

        int result = calculateRhombusCells(order);
        System.out.println(result);

        scanner.close();
    }

    static int calculateRhombusCells(int order) {
        if (order == 1) {
            return 1;
        }

        int previousOrderCells = calculateRhombusCells(order - 1);
        int currentOrderCells = previousOrderCells + 4 * order - 4;

        return currentOrderCells;
    }

}
