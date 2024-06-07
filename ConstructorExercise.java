public class ConstructorExercise {
    public static void main(String[] args) {
        Person p1 = new Person();//�޲ι�����
        System.out.println("p1����Ϣ name=" + p1.name + " age=" + p1.age);
        Person p2 = new Person("jack", 20);
        System.out.println("p2����Ϣ name=" + p2.name + " age=" + p2.age);
    }
}
//��ϰһ
class Person {
    String name;
    int age;
    public Person() {
        age = 18;
    }
    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}