public class OverLoadExercise {
    public static void main(String[] args) {

        //��д������Methods�ж����������ط��������ã�������Ϊm�����������ֱ����һ��int����������int������һ���ַ���������
        //�ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
        //�������main()�����зֱ��ò��������������������

        Methods a = new Methods();
        a.m(3);
        a.m(2, 3);
        a.m("hello");
        System.out.println(a.max(2, 4));
        System.out.println(a.max(2.3, 4.3));
        System.out.println(a.max(6.5, 4.2, 8.3));

        A b = new A();
        System.out.println(b.score("jack", 89, 81));
    }
}

class Methods {
    public void m(int a) {
        System.out.println("ƽ��������=" + Math.pow(a, 2));
    }

    public void m(int a, int b) {
        System.out.println("��˵Ľ��=" + a * b);
    }

    public void m(String str) {
        System.out.println("�ַ���=" + str);
    }
    //�����������ط���max(),��һ����������������intֵ�е����ֵ���ڶ�����������������doubleֵ�е����ֵ
    //��������������������doubleֵ�е����ֵ������������������

    public int max(int a, int b) {
        int res = a;
        if (a > b) {
            return a;
        } else {
            return b;
        }

        //return a > b ? a : b;
    }

    public double max(double a, double b) {
        double res = a;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public double max(double a, double b, double c) {
        double res = a;
        double max1 = a > b ? a : b;
        return max1 > c ? max1 : c;
    }
}

class A {
    public String score(String name, double... subs) {

        int sum = 0;
        for (int i = 0; i < subs.length; i++) {
            sum += subs[i];
        }
        return name + "�ܳɼ�Ϊ" + sum;
    }
} 


