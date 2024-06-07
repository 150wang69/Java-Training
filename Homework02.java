public class Homework02 {
    public static void main(String[] args) {
        Circle round = new Circle(3);
        System.out.println("���=" + round.area());
        System.out.println("�ܳ�=" + round.circumference());
        /////////////////////////////////////////////////////////
        Cale num = new Cale(8, 0);
        System.out.println("��=" + num.sum());
        System.out.println("��=" + num.difference());
        System.out.println("��=" + num.product());
        System.out.println("��=" + num.quotient());
        ////////////////////////////////////////////
        Dog d = new Dog(2, "С��", "��ɫ");
        System.out.println("��ֻС�������䡢���������ֱַ���" + d.show());
    }
}

class Circle {
    double radius;
    public Circle(double radius) {

        this.radius = radius;
    }

    public double area() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {

        return 2 * Math.PI * radius;
    }
}

class Cale {
    double num01;
    double num02;

    public Cale(double num01, double num02) {
        this.num01 = num01;
        this.num02 = num02;
    }

    public double sum() {
        return num01 + num02;
    }

    public double difference() {
        return num01 - num02;
    }

    public double product() {
        return num01 * num02;
    }

    public Double quotient() {

        if (num02 == 0) {
            System.out.println("�̲�����");
            return null;
        }

        return num01 / num02;
    }

}

class Dog {
    int age;
    String name;
    String color;

    public Dog(int age, String name, String color;)

    {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public String show() {

        return age + "\t" + name + "\t" + color;

    }
}