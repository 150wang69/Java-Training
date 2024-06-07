public class Testtwo {

    public static void main(String[] args) {
        //��ҵ1
        char c1 = '\t';
        char c2 = '\n';
        char c3 = '\r';
        char c4 = '\\';
        char c5 = '1';
        char c6 = '2';
        char c7 = '3';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);

		//��ҵ2
        System.out.println("���˲���ĸǴıȡ�" + "������������");
        System.out.println("��" + "Ů");
        System.out.println("65��Ǯ" + "66��Ǯ");
		//�޸ģ�
        String book1 = "�˲���ĸǴı�";
        String book2 = "�������� ";
        System.out.println(book1 + book2);

        //�Ա�Ӧ����char
        char n1 = '��';
        char n2 = 'Ů';
        System.out.println(n2 + n1);//�õ��Ĳ�����Ů���õ�������ֵ����������

        int i1 = 65;
        double i2 = 66.6;
        float i3 = 67f;
        System.out.println(i1 + i2 + i3);//�õ�������Ӻ�Ľ������Ϊ�ǻ����������ͣ������ַ�����

		//��ҵ3
		//δ�ñ�����
        System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n����\t18\t750\tŮ\t��Ȥ�Ķ���");

		//�ñ�����
        String s1 = "����";
        String s2 = "18";
        String s3 = "750";
        String s4 = "Ů";
        String s5 = "��Ȥ�Ķ���";
        System.out.println(s1 + s2 + s3 + s4 + s5);

		//�޸ģ���׼�𰸡�
        String name = "����";
        int age = 18;
        double score = 750.0;
        char gender = 'Ů';
        String hobby = "��Ȥ�Ķ���";
        System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n" + name + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);
    }
}