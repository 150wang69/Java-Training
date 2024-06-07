import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {

        //ʹ�ö�ά�����ӡһ��10�е�������ǡ�
	    /*˼·������
                1.��һ����1��Ԫ�أ���n����n��Ԫ�ء�
                2.ÿһ�е�һ��Ԫ�غ����һ��Ԫ�ض���1
                3.�ӵ����п�ʼ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ��arr[i][j]
				    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];*/

        Scanner wy = new Scanner(System.in);
        System.out.println("��������");
        int a = wy.nextInt();
        int arr[][] = new int[a][a];     //int arr[][] = new int[a][];   arr[i] = new int[i+1];
        System.out.println("�õ�" + a + "���������");

        for (int i = 0; i < a; i++) {   //����ʮ��һά���顣
            int len = i + 1; //�õ�һά����ĳ���
            for (int j = 0; j < len; j++) {
                arr[i][0] = 1;
                arr[i][len - 1] = 1;
                if (i > 1 && j > 0) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}