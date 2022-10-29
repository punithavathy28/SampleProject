package arrayTest;

public class TwoDimensionTest {

	public static void main(String[] args) {
		                  //row col
		int [][]a = new int [3][3];

		a[0][0]=100 ;
		a[0][1]=200 ;
		a[0][2]= 300;
		
		a[1][0]= 45;
		a[1][1]= 12;
		a[1][2]= 345;
		
		a[2][0]=67;
		a[2][1]=200;
		a[2][2]=734;
		
		for(int row=0; row<a.length; row++){
			for(int col=0; col<a[row].length; col++){
				System.out.print(a[row][col]+"  ");
			}
			System.out.println();
		}
	}

}
