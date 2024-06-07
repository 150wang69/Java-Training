public class Test08 {
    public static void main(String[] args) {

        //�������10��������1-100��Χ�ڣ����浽���飬�����ӡ�Լ�����ƽ��ֵ�����ֵ�����ֵ���±꣬�����������Ƿ���8������֡�
        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }

        System.out.println("������ɵ������ǣ�");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("����������Ϊ��");

		/*  for (int j = 0;j<arr.length/2 ;j++ )
		  {
			  for (int i= 0;i<arr.length ;i++ )
			  {
				 int temp = arr[i];
				 arr[i] = arr[arr.length-1-i];
				 arr[arr.length-1-i] = temp;

			  }

		  }

		  for (int i = 0;i<arr.length ;i++ )
		  {
			  System.out.print(arr[i]+"\t");
		  }
		*/

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
            sum += arr[i];
        }

        int average = sum / 10;
        System.out.print("ƽ��ֵΪ��" + average);
        int index = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("���ֵΪ��" + max);
        System.out.println("�±�Ϊ��" + index);

        int ser = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                ser = i;
                System.out.println("����Ԫ������8");
                break;
            }
        }
        if (ser == -1) {
            System.out.println("����Ԫ����û��8");
        }
    }
}