package arrayTest;

public class ArrayTest {

	public static void main(String[] args) {
	// REFERENCE DATA
		int i=10;
		int j=20;
		int k=23;
		
		//array 
		int [] a= new int [5]; // static value 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//System.out.println("array value of a is::"+a);
			     //0  ,1  ,2  , 3
		int [] b= {100,200,300,400};// dynamic value given. N no of value we can give at BEFORE compile time 
		System.out.println("length of B VALUE is::"+b.length);

	}

}
