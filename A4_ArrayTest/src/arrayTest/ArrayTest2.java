package arrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [5];
	     //a.length array size
		// a.clone() array copy
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		// we declare array size 5 but we use only 3 
		//balance a[3] a[4] is memory waste

          for (int i=0; i< a.length; i++){
 System.out.println(a[i]);
          }
	}

}
