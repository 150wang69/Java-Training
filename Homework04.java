public class Homework04 {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject p = new PassObject();
        p.printAreas(c, 5);
    }
}

class Circle {
    double radius;

    public Circle() {//�޲ι�����

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    //��ӷ���setRadius,�޸Ķ���İ뾶
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) //����ǩ��/����
    {
        for (int i = 1; i <= times; i++) {
            System.out.print("i = " + i + "\t");
            c.setRadius(i);//�޸�c�Ķ��󣬰뾶ֵ
            System.out.println("���=" + c.findArea());
        }
    }
}
