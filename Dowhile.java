import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args) {
        Scanner wy = new Scanner(System.in);
        //��ϰ1
        //��ӡ1-100����
        System.out.println("��������ʼֵ");
        int start01 = wy.nextInt();
        int num01 = start01;
        System.out.println("������ĩֵ");
        int end01 = wy.nextInt();
        do {
            System.out.println(num01);
            num01++;
        }
        while (num01 <= end01);
        //��ϰ2
        //����1-100�ĺ�
        System.out.println("��������ʼֵ");
        int start02 = wy.nextInt();
        int num02 = start02;
        System.out.println("������ĩֵ");
        int end02 = wy.nextInt();
        int sum = 1;
        do {
            System.out.println("sum" + sum);
            num02++;
            sum += num02;
        }
        while (num02 <= end02);
        //��ϰ3
        //ͳ��1-200֮���ܱ�5���������ܱ�3�����ĸ�����
        System.out.println("��������ʼֵ");
        int start03 = wy.nextInt();
        int num03 = start03;
        System.out.println("������ĩֵ");
        int end03 = wy.nextInt();
        int count = 0;
        do {
            if (num03 % 5 == 0 && num03 % 3 > 0)//����ʹ��num03 % 3 ! =0
            {
                System.out.println(num03);
                count++;
            }
            num03++;
        }
        while (num03 <= end03);
        System.out.println("count=" + count);
        //��ϰ4
        int i = 0;
        do {
            System.out.println("������Ǯ���Ͻ���Ǯ��");
            i++;
        }
        while (i <= 4);//��������������������
        //����ִ��һ�Σ����Լ���һ��ִ�д�����
        System.out.println("��Ǯ");

//��ϰ4�޸ģ�
//char answer = '';
//do  {
//   System.out.println("��Ǯô��");
//   answer = wy.next().charAt(0);
//   System.out.println("���Ļش���"+answer);
//

//}while(answer !='y');
//����ش�y���˳�ѭ����
//System.out.println("����Ǯ�ˣ����ô��ˡ�");
    }
}