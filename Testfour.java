import java.util.Scanner;//��Ҫ;;;;;;;;;;;;;;;;

public class Testfour {
    public static void main(String[] args) {
        //��ϰ1
        double d1 = 11.0;
        double d2 = 18.0;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println(d1 + d2);
        }

        //��ϰ2
        int num1 = 3;
        int num2 = 12;
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0)//�˴�һ��Ҫ��==  =��== ===������https://blog.csdn.net/qq_42244874/article/details/80786949
        { //�����֮��==�����ǣ��Ƚ�������ת��Ȼ���ٽ����жϣ��������Ͳ�ͬҲ����ȣ�
            //��=�ĺ�������Ǹ�ֵ����
            System.out.println("����֮�ͼ��ܱ�3�������ܱ�5����");
        } else {
            System.out.println("����֮�Ͳ��Ǽ��ܱ�3�������ܱ�5����");
        }
        //��ϰ3
        Scanner myScanner = new Scanner(System.in);
        System.out.println("���������");
        int year = myScanner.nextInt();
        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            System.out.println("�����Ϊ����");
        } else
            System.out.println("����ݲ�������");
    }
}