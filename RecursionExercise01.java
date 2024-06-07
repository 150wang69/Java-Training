public class RecursionExercise01 {
    public static void main(String[] args) {
        int tool01 = 1;
        Math01 m1 = new Math01();
        int res01 = m1.fibonacci(6);
        System.out.println("��쳲����������е�6����=" + res01);

        Math02 day = new Math02();
        int res02 = day.monkeypeach(1);
        if (res02 != -1) {
            System.out.println("��1����" + res02 + "������");
        } else {
            System.out.println("������1-10");
        }
    }
}

//��ϰһ��ʹ�õݹ����쳲���������1��1��2��3��5��8��13....�������n������ֵ��
class Math01 {
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

//��ϰ�������ӳ������⣬��һ�����ӣ����ӵ�һ��Ե������е�һ�룬�������һ�����Ժ�ÿ�춼�Ե����е�һ�룬Ȼ���ٶ��һ����
//������ʮ���ʱ�����ٳ�ʱ����û�ԣ�������ֻʣ��һ�������ˡ�������ж��ٸ����ӣ�
class Math02 {
    public int monkeypeach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (monkeypeach(day + 1) + 1) * 2;
        } else {
            System.out.println("day�ķ�Χ��1-10");
            return -1;
        }
    }
}