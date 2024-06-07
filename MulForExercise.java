import java.util.Scanner;

public class MulForExercise {
    public static void main(String[] args) {
        //��ϰ1
        //ͳ��������ĳɼ������ÿ����������ͬѧ�����ÿ�����ƽ���ֺ����а༶��ƽ���֡�
        //ͳ�������༰��������
        Scanner wy = new Scanner(System.in);
        System.out.println("һ���м����༶��");
        int num01 = wy.nextInt();
        System.out.println("�༶");
        int grade = wy.nextInt();
        double sum02 = 0;
        int pass = 0;
        for (; grade <= num01; ) {
            System.out.println(grade + "��ĳɼ�");
            System.out.println("����ѧ������");
            int num02 = wy.nextInt();
            double sum01 = 0;
            int i = 1;
            for (; i <= num02; i++) {
                wy.nextLine();
                System.out.println("�������" + i + "��ͬѧ������");
                String name = wy.nextLine();
                System.out.println("������ɼ�");
                double score = wy.nextDouble();
                System.out.println(name + "\t" + score);
                sum01 += score;
                System.out.println("�����ܷ�=" + sum01);
                if (score >= 60) {
                    pass++;
                    System.out.println("Ŀǰ�ϸ�" + pass + "��");
                }
            }
            double average01 = sum01 / 5;
            System.out.println("����ƽ����" + "\t" + average01);
            sum02 += sum01;
            System.out.println("��������ܷ�=" + sum02);

            grade++;

        }
        double average02 = sum02 / 15;
        System.out.println("���������ƽ����" + average02);
        System.out.println("�������ܺϸ�����Ϊ" + pass);
        //�������������������ڿ�һ����ѭ��Ū�����ˡ�����
        //��ϰ2
        //��ӡ��99�˷���
        System.out.println("�žų˷���");
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; ) {
                System.out.print(a + "*" + b + "=" + a * b + "\t");
                b++;
            }
            System.out.print();
        }
    }
}




