import java.util.Scanner;

//BT tinh tong cac so o duong cheo chinh cua ma tran hinh vuong
public class TotalMainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so hang: ");
        int rows = input.nextInt();

        System.out.print("Nhap so cot: ");
        int cols = input.nextInt();

        while (rows != cols) {
            System.out.println("Khong phai ma tran hinh vuong vui long nhap lai: ");
            System.out.print("Nhap so hang: ");
            rows = input.nextInt();
            System.out.print("Nhap so cot: ");
            cols = input.nextInt();
        }

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap cac phan tu: [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    total += matrix[i][j];
                }
            }
        }
        System.out.print("Tong cac so o duong cheo chinh la: " + total);
    }
}