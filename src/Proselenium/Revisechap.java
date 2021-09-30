package Proselenium;

public class Revisechap {

	public static void main(String args[]) {
	
		// TODO Auto-generated method stub

		//Variables
		// Implicit conversion : Converting small datatype value into large data type (double d = 5;) - It converts implicitly to 5.5
		// Explicit Conversion or Type casting : Converting large datatype to small datatype (int i = (int)5.5) - We need to cast it explicitly by providing specific data type.
	
		/* pgm for   * * * *
				     * * * *
				     * * * *
				     * * * *                
		
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		/* pgm for  1
		 			1 2
		 			1 2 3
		 			1 2 3 4
		 			1 2 3 4 5
		 			1 2 3 4 5 6
             */
		
		/*for(int i=1;i<=6;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		 pgm for  1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
 */
		//Method overloading and overriding
/*
	class Casio	{
		public void add(int i,int j)
		{
			System.out.println(i+j);
		}
		
		public void add(int i,int j,int k)
		{
			System.out.println(i+j+k);
		}
		
	}



class OverloadingDemo {
	public static void main(String args[])
	{
		Casio obj = new Casio();
		obj.add(3, 4);
		obj.add(3, 4, 6);
	}
}
	*/
		//2d array
		/*
		int a[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}
		};
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		*/
		//2d array and jagged array with enhanced for loop
		
		int a[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}
		};
		
		int b[][] = {
				{1,2,3,4},
				{2,4,6},
				{5,6,7,8,9}
		};
		
		for (int k[]: b) 
		{
			for(int l: k)
			{
				System.out.print(" " +l);
			}
			System.out.println();
		}
		
	}
}