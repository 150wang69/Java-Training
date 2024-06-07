import java.util.Scanner;

public class Stars01 {
    public static void main(String[] args) {

		//��ӡһ�����Ľ�����������
		//˼·������
		//1.����Ϊ���ȴ�ӡһ�����Ρ��ٴ�ӡ�������������ӡ������������
		//����ӡ���Ľ���������ȥ��ͷ�ո���ǰ�еĵ�һ��λ�ú����һ��λ��Ҳ��*��
		//�����ȷ��ֹ��ɡ����ֹ��ɺ���Ҫ����������������
        Scanner wy = new Scanner(System.in);
        System.out.println("һ��Ҫ��ӡ�����������");
        int t = wy.nextInt();
        for (int i = 1; i <= t; i++)//i��ʾ����
        {
            for (int k = 1; k <= t - i; ) {
                System.out.print(" ");
                k++;
            }

            //���ֹ���2n-1.
            for (int j = 1; j <= i * 2 - 1; j++) {//��ȥ��ͷ�ո���ǰ�еĵ�һ��λ�ú����һ��λ��Ҳ��*��
                if (j == 1 || j == 2 * i - 1 || i == t) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                //ln����ͻ��С�����ȥ��ln��
            }
            //Ӧ����ÿ����һ��ͻ���
            //�ڴ�ӡ֮ǰ��Ҫ����ո�
            //����ÿһ��ǰ�Ŀո�Ϊ�ܲ���t-��ǰ������
            System.out.print("\n");
        }
    }
}