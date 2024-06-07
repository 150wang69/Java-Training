import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //��ϰ1��
        //��ӡ1��100֮��������9�ı�����������ͳ�Ƹ������ܺ͡�

        //1.����Ϊ�򣺼������ӵ�������ɼ򵥵���������ɡ�
        //2.�������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ��
        int sum = 0;
        int count = 0;//ͳ�Ƹ�������ı�����
        Scanner wy = new Scanner(System.in);
        System.out.println("��������ʼֵ");
        int start = wy.nextInt();
        System.out.println("������ĩֵ");
        int end = wy.nextInt(); //Ϊ����Ӧ���õ����󣬽����еķ�Χ��Ϊ��������������
        System.out.println("�����뱻����");
        int t = wy.nextInt();//�����Ը���һ�������ĸ����ı�����Ϊһ��������
        for (int num = start; num <= end; num++) {
            if (num % t == 0) {
                System.out.println("number = " + num);
                count++;
                sum += num;
            }//ͳ�Ƹ�������Ҫ����һ��������
        }
        System.out.println("count= " + count);
        //����һ�������������ܺ͡�
        System.out.println("sum= " + sum);
        //������ʹ��scanner��������
        System.out.println("��������ʼֵ");
        int start02 = wy.nextInt();
        System.out.println("������ĩֵ");
        int end02 = wy.nextInt();
        for (int i = start02; i <= end02; i++) {
            int k = end02 - i;
            System.out.println("sum=" + i + "+" + k + "=" + end02);
        }
    }
}
	
	