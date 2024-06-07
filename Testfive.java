import java.util.Scanner;

public class Testfive {
    public static void main(String[] args) {

	//   ݵ        ·ݺ      ӡƱ ۡ 
	//4-10           ˣ 18-60 ꣩  60Ԫ    ͯ  <18        30Ԫ      ˣ >60        ֮һ 20Ԫ
	//          40     20
        Scanner wy = new Scanner(System.in);
        System.out.println("       ·ݣ 1-12  ");
        int month = wy.nextInt();

        if (month >= 4 && month <= 10) {
            System.out.println("          ");
            int age = wy.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("60");
            } else if (age < 18) {
                System.out.println("30");
            } else if (age > 60) {
                System.out.println("20");
            }
        } else {
            System.out.println("          ");
            int age = wy.nextInt();
            if (age >= 18) {
                System.out.println("40");
            } else {
                System.out.println("20");
            }
        }
        //  ȫ  ȷ                      ̫   ˹           
    }
}