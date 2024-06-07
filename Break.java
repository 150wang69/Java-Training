import java.util.Scanner;
public class Break{	
	public static void main(String[]args){
	//练习1
	//1-100以内的数求和，求出 当和第一次大于20的当前数（foe+break）	
		int sum = 0;
		for (int i =1;i<=100 ;i++ ){
			sum += i;
			if (sum>20){
				System.out.println("当前i="+i);
		   		break;
			}
		}
	//练习2
	//实现登陆验证，有三次机会，如果用户名为“www”，密码“666”，则提示登陆成功。否则提示还有几次机会，请使用for+break完成。
	    	Scanner wy = new Scanner(System.in);
		String name ="";
		String passwd = "";
		int chance =3;//登录一次就减少一次。
		for (int i =1; i<=3;i++ ){
			System.out.println("请输入用户名");
			name = wy.next();
			System.out.println("请输入密码");
	       		passwd = wy.next();
			//比较输入的名字和密码是否正确。
			//补充说明：字符串比较的方法：String类里有equal方法。
	 		if ("www".equals(name) && "666".equals(passwd)){
				System.out.println("用户名"+"\t"+name+"\n"+"密码"+"\t"+passwd);
				System.out.println("身份验证正确，登陆成功");
		  		break;	  
	  		}else{ 
				chance--;
				System.out.println("还剩下"+chance+"次机会");
			}
	  	}	
	}
}
