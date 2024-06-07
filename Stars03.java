import java.util.Scanner;

public class Stars03 {
    public static void main(String[] args) {
        Scanner wy = new Scanner(System.in);
        System.out.println("��������");
        int aspect = wy.nextInt();

        for (int i = 1; i <= aspect; i++) {
            for (int k = 1; k <= aspect - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        int a = 1;
        for (; a <= aspect - 1; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * aspect - 1 - 2 * a; c++) {
                if (c == 1 || c == 2 * aspect - 1 - 2 * a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}