package arrayTest;

public class ObjectArrayTest {

	public static void main(String[] args) 
	{     // object array store all type of data ,, each data type have different memory size ,
		//so difficult to arrange for this reason its performance is slow
		
		Object [] a = new Object [5];
		a[0]= "100";		//10mb
		a[1]= "Vcentry";	//100b
		a[2]= true;			//1kb
		a[3]= 'a';			//1mb
		a[4] = 10.4;
		for (int i=0; i< a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
