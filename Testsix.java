import java.util.Scanner;

public class Testsix {
    public static void main(String[] args) {

        //��ϰ1
        //ĳ����100000Ԫ��ÿ����һ��·����Ҫ�ɷѡ��������£�
        //1.���ֽ�>50000ʱ,ÿ�ν�5%.
        //2.���ֽ�<=50000ʱ��ÿ�ν�1000.
        //��̼�����˿��Ծ�������·�ڣ�Ҫ��ʹ��while break��ʽ��ɡ�
        double allmoney = 100000;
        int road = 0;
        lable1:
        while (allmoney >= 1000) {
            lable2:
            if (allmoney > 50000) {
                allmoney *= 1 - 0.05;
                System.out.println("ʣ���ֽ�" + allmoney);
                break lable2;
            } else {
                allmoney -= 1000;
                System.out.println("ʣ���ֽ�" + allmoney);
            }
            road++;
        }
        System.out.println("��ͨ��·��" + road + "��");

        //��ϰ2
        //ʵ���ж�һ�����������ĸ���Χ�� >0;<0;=0
        Scanner wy = new Scanner(System.in);
        System.out.println("����������");
        int i = wy.nextInt();
        if (i > 0) {
            System.out.println(i + ">0");
        } else if (i < 0) {
            System.out.println(i + "<0");
        } else if (i == 0)//������˫�Ⱥţ�����
        {
            System.out.println(i + "=0");
        }

        //��ϰ3
        //�ж�һ������Ƿ�Ϊ����
        System.out.println("���������");
        int j = wy.nextInt();
        if (j % 4 == 0 && j % 100 != 0) {
            System.out.println("��������ͨ����");
        } else if (j % 400 == 0) {
            System.out.println("��������������");
        } else {
            System.out.println("���겻������");
        }

        //��ϰ4
        //�ж�һ�������Ƿ���ˮ�ɻ�������ָһ����λ���������λ�����ֵ����������䱾��.
        //���磺153 = 1*1*1+3*3*3+5*5*5
        System.out.println("������һ����λ��");
        int k = wy.nextInt();
        //k�İ�λ��k/100  ʮλ��k%100/10 ��λ��k%10
        int k1 = k / 100;
        int k2 = k % 100 / 10;
        int k3 = k % 10;
        if (k == k1 * k1 * k1 + k2 * k2 * k2 + k3 * k3 * k3) {
            System.out.println("�����λ����ˮ�ɻ���");
        } else {
            System.out.println("�����λ������ˮ�ɻ���");
        }

        //��ϰ5
        //���1-100֮��Ĳ��ܱ�5����������ÿ5��һ�С�
        int a = 0;
        int num = 1;
        lable1:
        for (; num <= 100; num++) {
            if (num % 5 != 0) {
                System.out.print("num=" + num);
                System.out.print(" ");
                a++;
                if (a % 5 == 0) {
                    System.out.print("\n");
                }
                continue lable1;
            }
        }

        //��ϰ6
        //���Сд��a-z�ʹ�д��A-Z��
        char c1 = 'a';
        char c2 = 'A';
        for (; c1 <= 'z'; c1++) {
            System.out.print(c1 + " ");
        }
        System.out.print("\n");
        for (; c2 <= 'Z'; c2++) {
            System.out.print(c2 + " ");
        }

        //��ϰ8
        //���1-1/2+1/3-1/4...1/100�ĺ�
        int b = 1;
        double sum = 0;
        for (; b <= 100; b++) {
            if (b % 2 == 0) {
                sum -= 1.0 / b;
            } else {
                sum += 1.0 / b;
            }
        }
        System.out.println("�ܺ�=" + sum);

        //��ϰ9
        //��1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+100)�Ľ����
        int sum01 = 0;
        int c = 1;
        for (; c <= 100; c++)//c ���Ա�ʾ�ڼ���Ҳ���Ա�ʾ��ǰ������һ������
        {
            for (int d = 1; d <= c; d++) {
                sum01 += d;
            }

        }
        System.out.println("sum=" + sum01);
    }
}