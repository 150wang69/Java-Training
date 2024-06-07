import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        //��ϰ1
        Scanner wy = new Scanner(System.in);
        System.out.println("��������ĸ");
        char c1 = wy.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("A");
                break;

            case 'b':
                System.out.println("B");
                break;

            case 'c':
                System.out.println("C");
                break;

            default:
                System.out.println("other");
        }
        //��ϰ2
        System.out.println("������ɼ�");
        double score = wy.nextDouble();//������Ҫһ��ת����
        //ʹ��switch��֧����
        switch ((int) (score / 60)) {
            case 1:
                System.out.println("�ɼ��ϸ�");
                break;
            case 0:
                System.out.println("�ɼ����ϸ�");
                break;
            default:
                System.out.println("�������");
        }
        //ʹ�ö��֧����
        System.out.println("���������");
        float score01 = wy.nextFloat();
        if (score01 >= 60 && score01 <= 100) {
            System.out.println("�ϸ�");
        } else if (score01 < 60 && score01 >= 0) {
            System.out.println("���ϸ�");
        } else {
            System.out.println("�������");
        }
        //ʹ����Ԫ���������
        System.out.println("���������");
        double score02 = wy.nextDouble();
        String s1 = "�ϸ�";
        String s2 = "���ϸ�";
        String result = score / 60 == 1 ? s1 : s2;

        System.out.println(result);

        //��ϰ3
        System.out.println("�����·�");
        int month = wy.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�ļ�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�＾");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("����");
                break;
            default:
                System.out.println("�������");
        }
    }
}