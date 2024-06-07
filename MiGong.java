public class MiGong {
    public static void main(String[] args) {

//��չ˼�������������·����
//˼·��(1)��� (2)ͼ->������·��
        //˼·��
        //1.�ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
        //2.�ȹ涨 map �����Ԫ��ֵ��0 ��ʾ������ ��1 ��ʾ�ϰ��

        int[][] map = new int[8][7];
        //3.���������һ�к��������һ��ȫ������Ϊ1��

        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //4.������ߺ����ұߵ����ж���Ϊ1.
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        System.out.println("========��ǰ��ͼ���========");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }

        //ʹ��findway��·
        A way = new A();
        way.findway(map, 1, 1);//���ô���

        System.out.println("\n======��·���������======");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//ʹ�õݹ���ݵ�˼�����Թ����⡣

class A {
    //1.findway��������ר�����ҳ��Թ���·��
    //2.����ҵ��ͷ���true��û�ҵ��ͷ���false��
    //3.map���Ƕ�ά���飬����ʾ�Թ���
    //4.i,j��ʾ�����λ�ã���ʼ��λ��Ϊ(1,1)
    //5.����ʹ�õݹ飬�ȹ涨map����ĸ���ֵ�ĺ���
    //6.0 ��ʾ������ ��1 ��ʾ�ϰ��� �� 2 ��ʾ�����ߵ�· ��3 ��ʾ�߹������߲�ͬ��·����·����
    //7.��map[6][5] = 2 , ��˵���ҵ�ͨ·���Ϳ��Խ���������ͼ����ҡ�
    //8.��ȷ���������·���� ��->��->��->��
    public boolean findway(int[][] map, int i, int j) {

        if (map[6][5] == 2)//˵���ҵ�·
        {
            return true;
        } else {
            if (map[i][j] == 0)//��ǰλ��Ϊ0˵����·����
            {  //�ٶ�������ͨ
                map[i][j] = 2;
                //ʹ����·������ȷ���Ƿ���Ŀ�����ͨ��
                //��->��->��->��
                if (findway(map, i + 1, j))//������
                {
                    return true;
                } else if (findway(map, i, j + 1))//������
                {
                    return true;
                } else if (findway(map, i - 1, j))//������
                {
                    return true;
                } else if (findway(map, i, j - 1))//������
                {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else {//map[i][j] = 1,2,3;
                return false;
            }
        }
    }
}