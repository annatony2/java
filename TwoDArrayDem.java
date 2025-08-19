import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Transpose matrix (swap row & col)
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}