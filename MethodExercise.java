public class MethodExercise {
    public static void main(String[] args) {

        //  ϰһ    д  AA    һ         ж һ     Ǽ   odd    ż        boolean  
        AA a = new AA();
        if (a.aa(3)) {
            System.out.println("      ż  ");
        } else {
            System.out.println("          ");
        }
        a.print(4, 4, '#');
    }
}

class AA {
    public boolean aa(int n) {
      /* if (n % 2 ==0)//ż  
       {
		  return true;
       }else{
		  return false;
	   }//    
      */

        //return n % 2 ==0 ? true:false;

        return n % 2 == 0;
    }

    //     С  С  ַ   ӡ  Ӧ             ַ      磺 У 4 У 4   ַ #
    public void print(int row, int column, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}


