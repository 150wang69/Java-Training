public class Homework01 {
    public static void main(String[] args) {

        A01 a01 = new A01();
        double[] arr01 = {1.5, 6.3, 4.2, 8.1};
        System.out.println("max=" + a01.max(arr01));
        ///////////////////////////////////////////
        A02 a02 = new A02();
        String[] arr02 = {"��", "��", "��"};
        int index = a02.find(arr02, "��");
        System.out.println("���ҵ���index��" + index);
        ///////////////////////////////////////////////
        Book book = new Book();
        System.out.println("���ĺ����ļ۸���" + book.updatePrice(86));
        /////////////////////////////////////////////////////////////////
        A03 a03 = new A03();
        int arr04[] = a03.copyArr(4, 6, 7);
        System.out.println("���ƺ������Ϊ");
        for (int i = 0; i < arr04.length; i++) {
            System.out.print(arr04[i] + "\t");
        }
    }
}

class A01 {
    public double max(double[] arr01) {
        double m = arr01[0];
        for (int i = 1; i < arr01.length; i++) {
            if (m < arr01[i]) {
                m = arr01[i];
            }
        }
        return m;
    }
}

class A02 {
    public int find(String[] arr02, String str) {

        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] == str) //if(str.equals(arr02[i])){}
            {
                return i;
            }
        }
        return -1;
    }
}

class Book {
    public double updatePrice(double d) {
        if (d > 150) {
            return 150;
        }
        if (d > 100 && d <= 150) {
            return 100;
        }
        return d;
    }
}

class A03 {
    public int[] copyArr(int... arr03) {
        //������Ϻ󷵻�һ��������
        int arr04[] = new int[arr03.length];
        for (int i = 0; i < arr03.length; i++) {
            arr04[i] = arr03[i];
        }
        return arr04;
    }
}