package repo1;

public class UnaryOpeartorIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double db1 = 14.5d;
		System.out.println(db1);
		db1++;
		System.out.println(db1);
		
		int i1 = 10;
		int j = i1++ + ++i1;
		System.out.println("value of j " + "" + j);

		int i2 = 10;
		int k = ++i2 + ++i2 + ++i2 + i2++;
		System.out.println("value of k " + "" + k);

		int i3 = 10;
		int m = ++i3 + i3++ + i3++ + i3++  + i3-- + i3-- + --i3;
		System.out.println("value of m " + "" + m);
		
		
		int i = 10;
		i = i++;
		System.out.println("value of i " + "" + i);

		


		int j1 = 10;
		j1 = j1++ + j1;
		System.out.println("value of j1 " + "" + j1);
		
		 int a = 10;   
		   a = a++ + a + ++a ;
		   System.out.println("value of a " + "" + a);
		   
		   int i4 = -10;
	       int i5 = 10;
	       int i6 = 10;
	       int i7 = 10;
	       int i8 = 10;
	       int i9 = 10;
	       

System.out.println("value of i4 " + "" + i4);      
        
System.out.println("value of i5++ " + "" + i5++);      
        
System.out.println("value of ++i6 " + "" + ++i6);      
        
System.out.println("value of i7-- " + "" + i7--);      
        
System.out.println("value of --i8 " + "" + --i8);      
        
System.out.println("value of ~i9 " + "" + ~i9);


int x = 1;
int y = 0;
if (x++ > ++y) {
    System.out.print("Hello");
}else {
    System.out.print("Welcome");
}
System.out.println("Log" + x + ":" + y);
	       

		

//		final int i = 10;
//		i++;
//		System.out.println(i);
		
//		boolean bool = true;
//		bool++;
//		System.out.println(bool);


int i0 = 10; 
int j0 = i0++ + ++i0; 
System.out.println(i0); 
System.out.println(j0);

int ii = 10;
int jj= 7; 
double db2 = ii/jj; 
System.out.println("value of db2 " + "" + db2);
double db3 = (double)ii/jj; 
System.out.println("value of db3 " + "" + db3);
double db4 = ii/(double)jj;
System.out.println("value of db3 " + "" + db4);


int i11 = 10;
int j22 = i11++ + i11++ + --i11 + ++i11 + ++i11; 
System.out.println(i11); 
System.out.println(j22);
	}

}
