
import java.util.Scanner;
public class Break
{

	public static void main(String[]args){
	
	//��ϰ1
	//1-100���ڵ�����ͣ���� ���͵�һ�δ���20�ĵ�ǰ����foe+break��
	
		int sum = 0;
	for (int i =1;i<=100 ;i++ )
	{
		sum += i;
		if (sum>20)
		{
			System.out.println("��ǰi="+i);
		   break;
		}
			
	}
	
	//��ϰ2
	//ʵ�ֵ�½��֤�������λ��ᣬ����û���Ϊ�����󡱣����롰666��������ʾ��½�ɹ���������ʾ���м��λ��ᣬ��ʹ��for+break��ɡ�
     Scanner wy = new Scanner(System.in);
	 String name ="";
	 String passwd = "";
	 int chance =3;//��¼һ�ξͼ���һ�Ρ�
	
                  for (int i =1; i<=3;i++ )
              {
	System.out.println("�������û���");
		name = wy.next();
		System.out.println("����������");
       passwd = wy.next();
  //�Ƚ���������ֺ������Ƿ���ȷ��
  //����˵�����ַ����Ƚϵķ�����String������equal������
 
	  if ("����".equals(name) && "666".equals(passwd))
  {
	  System.out.println("�û���"+"\t"+name+"\n"+"����"+"\t"+passwd);
	  System.out.println("�����֤��ȷ����½�ɹ�");
	  break;
     
	  
  }else{
	  chance--;

  System.out.println("��ʣ��"+chance+"�λ���");

  }
  
}
     		
	
	
	
	}
}