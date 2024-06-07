import java.util.Random;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Tom t = new Tom();
        int isWinCount = 0;
        int arr1[][] = new int[3][3];
        int j = 0;
        String[] arr2 = new String[3];
        Scanner wy = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("����ѡ��0-2");
            int num = wy.nextInt();
            t.setPerson(num);
            int tomGuess = t.getPerson();
            arr1[i][j + 1] = person;
            int comGuess = t.com();
            arr2[i] = isWin;
            arr[i][j] = t.count;

            System.out.println("=================================");
            System.out.println("����\t��ҳ�ȭ��\t���Գ�ȭ��\t��Ӯ���");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t");
            System.out.println("====================================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }

        System.out.println("����\t��ҳ�ȭ��\t���Գ�ȭ��\t��Ӯ���");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1[a].length; b++) {
                System.out.println(arr1[a][b] + "\t\t\t");

            }
            System.out.println(arr2[a]);
            System.out.println();
        }
        System.out.println("��Ӯ��" + isWinCount + "��");
    }
}

class Tom {
    int person;
    int com;
    int win;
    int count;

    public void showInfo() {
        Random r = new Random();
        com = r.nextInt(3);//��ʾ0-2���������
        return com;
    }

    //��Ҳ�ȭ�����ַ���
    //0: ȭͷ   1�� ����  2�� ��
    public void setPerson(int person) {
        if (person > 2 || person < 0) {
            throw new IllegalArgumentException("�����������");
        }
        this.person = person;

    }

    public int getPerson() {
        return person;
    }

    //��ȭ�����
    public String vs() {
        if (person == 0 && com == 2) {
            return "��Ӯ��";
        } else if (person == 1 && com == 2) {
            return "��Ӯ��";
        } else if (person == 2 && com == 0) {
            return "��Ӯ��";
        } else if (person == com) {
            return "ƽ��";
        } else {
            return "������";
        }
    }

    public int winCount(String s) {
        count++;
        if (s.equals("��Ӯ��")) {
            win++;
        }
        return win;
    }
}