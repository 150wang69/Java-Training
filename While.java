import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //��ϰ1
        //��ӡ1-100֮�������ܱ�3����������

        Scanner wy = new Scanner(System.in);
        System.out.println("��������ʼֵ");
        int start01 = wy.nextInt();
        int num01 = start01;
        System.out.println("������ĩֵ");
        int end01 = wy.nextInt();
        System.out.println("�����뱻����");
        int t = wy.nextInt();
        while (num01 <= end01) {
            if (num01 % t == 0)//������˫�Ⱥ��ˣ�����������������������
            //����������������������������������������������������������
            {
                System.out.println(num01);
            }
            num01++;
        }

        System.out.println("��������ʼֵ");
        int start02 = wy.nextInt();
        int num02 = start02;
        System.out.println("������ĩֵ");
        int end02 = wy.nextInt();
        int i = 2;
        while (num02 <= end02) {
            if (num02 % i == 0)//������˫�Ⱥ��ˣ�����������������������
            //����������������������������������������������������������
            {
                System.out.println(num02);
            }
            num02++;
        }
    }
}