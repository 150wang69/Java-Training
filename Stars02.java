import java.util.Scanner;

public class Stars02 {
    public static void main(String[] args) {

        Scanner wy = new Scanner(System.in);
        System.out.println("Ҫ  ӡ           ");
        int aspect = wy.nextInt();
        int i = 1;
        while (i <= aspect) {
            int k = 1;
            while (k <= aspect - i) {
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= aspect * 2 - 1) {
                if (j == 1 || j == 2 * i - 1 || i == aspect) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.print(" \n");
        }
    }
}