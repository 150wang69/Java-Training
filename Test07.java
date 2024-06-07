public class Test07 {
    public static void main(String[] args) {
        //��֪��һ����������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������

        int arr1[] = {10, 12, 45, 90};
        //Ҫ�����23��������Ϊ����
		/*  int arr2[] = new int[arr1.length+1];
		  arr2[arr1.length]=23;

		  for (int i = 0;i<arr1.length ;i++ )
		  {
			 arr2[i]=arr1[i];

		  }

		   for (int j =0;j<arr2.length-1 ;j++ )
		   {
			   for (int i = 0;i<arr2.length-1 ;i++ )
			   {
				  if (arr2[i] > arr2[i+1])
				  {
					int temp = arr2[i];
					arr2[i]=arr2[i+1];
					arr2[i+1]=temp;
					//ð������

				  }
			   }
			}

		  for (int i = 0;i<arr2.length ;i++ )
		  {
			   System.out.print(arr2[i]+"\t");
		  }

		*/

        //�ȶ�λ������

		/*����arr1���飬�������insertNum<=arr1[i],˵��i����Ҫ�����λ�á�
	    ʹ��index������  index = -1��
		 ����������û�з���insertNum<=arr1[i],˵��index = arr1.length-1
		 */

        int insertNum = 23;
        int index = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (insertNum <= arr1[i]) {
                index = i;
                break;//�ҵ�λ�ú���˳���
            }
        }
        //�ж�index��ֵ��
        if (index == -1)//˵����û���ҵ�λ�á�
        {
            index = arr1.length;
        }

        System.out.println("index=" + index);

        //���ݣ�
        int arr2[] = new int[arr1.length + 1];

        //������Ҫ��arr1 ��Ԫ�ؿ�����arr2���У�����Ҫ����index��λ�á�

        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i != index)//˵�����Խ�arr1��Ԫ�ؿ�����arr2�С�
            {
                arr2[i] = arr1[j];
                j++;

            } else {//i���λ�þ���Ҫ���������

                arr2[i] = insertNum;

            }
        }

        arr1 = arr2;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        //��arr1ָ��arr2��ԭ��������arr�ͳ�Ϊ���������١�
        //���ַ������ɣ���Ҫѧϰ�ڶ��ַ�����
    }
}