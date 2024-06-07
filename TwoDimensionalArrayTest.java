
public class TwoDimensionalArrayTest {
    public static void main(String[] args) {

        //��ϰ1
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};//�����ö�ά���飬���õ��͡�
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//������ά���������Ԫ��
            for (int j = 0; j < arr[i].length; j++) {//����һά���������Ԫ��
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println();//����
        }
        System.out.println("��=" + sum);
    }
}