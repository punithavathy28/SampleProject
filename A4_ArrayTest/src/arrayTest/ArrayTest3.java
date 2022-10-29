package arrayTest;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [5];
	     //a.length array size
		// a.clone() array copy
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		a[5]=600; // we INSERT extra value TO ARRAY
			//ACTUALLY array size is a[5] but we try to insert 6th value
		// it show OUT OF BOUND ECEPTION
		
 System.out.println(a[0]);
 System.out.println(a); // Memory value it show
          for (int i=0; i< a.length; i++){
 System.out.println(a[i]);
          }
	}

}
