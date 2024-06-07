public class MethodExercise02 {
    public static void main(String[] args) {

        MyTools m = new MyTools();
        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("�ö�ά����Ϊ");
        m.TwoDimensionalArray(arr);
        //------------------------------
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        Person p2 = m.copyPerson(p);
        //����p��p2�����������Ķ���������ͬ
        System.out.println("p������ age =" + p.age + " name=" + p.name);
        System.out.println("p2������ age =" + p2.age + " name=" + p2.name);
        //�˴�������ͨ����������hashCode���������Ƿ���ͬһ����
        //������p == p2
        System.out.println(p == p2);
    }
}

class Person {
    int age;
    String name;
}

//��ϰ������дһ������copyPerson�����Ը���һ��Person���󣬷��ظ��ƵĶ��󡣿�¡����ע��Ҫ��õ����¶���
//��ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ���ѡ�

class MyTools {
    //��ϰһ����д��MyTools�࣬��дһ���������Դ�ӡ��ά��������ݡ�

    public void TwoDimensionalArray(int arr[][]) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//��д˼·�� 
/*  1.�����ķ������� Person��
    2.���������� copyPerson
	3.�������β� (Person p)
	4.�����壬����һ���¶��󣬲��������ԣ����ؼ���
	*/

    public Person copyPerson(Person p) {

        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}