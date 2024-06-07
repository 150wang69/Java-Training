public class Homework03 {
    int count = 9;

    public void count1() {
        count = 10;//�������ԡ�
        System.out.println("count1=" + count);//10
    }

    public void count2() {
        System.out.println("count1=" + count++);//ע���Ǻ�++���������������
    }

    public static void main(String[] args) {
        // new Homework03() �ڶ��д���һ�������û�аѵ�ַ���ظ��������ã�û��ָ��ջ�ռ䣩����Ϊ���������ص㣺ֻ����һ�Ρ�
        //û�����֣�ʹ�ú�ͱ����١�
        //new Homework03().count1();  ָ���������������ʹ�������count1������
        new Homework03().count1();//10
        Homework03 h = new Homework03();
        h.count2();//9�������9����������10
        h.count2();//10 �����10����������11
    }
}