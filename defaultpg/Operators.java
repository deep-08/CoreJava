package defaultpg;

/*********Arithmetic Operator**********/
public class Operators {

	public static void main(String[] args) {
		// + - / * %
		int a = 11 , b =2,c;
		c = a%b;
	System.out.println(c);
	System.out.println("int a is " + (a+b));
	System.out.println("int a is " + (a-b));
	System.out.println("int a is " + (a*b));
	System.out.println("int a is " + (a%b));
	System.out.println("int a is " + (a/b));
	
		c= ++a;
		c=a++;
		System.out.println(c);
		System.out.println(c);
/*	Increment/Decrements
	Post Increment
	Pre Increment
*/	
		
/*****************Relational Operator***********/
//		> < >= <= == != - Returns Boolean type
		int j=10, k=10;
		System.out.println(j!=k);
		System.out.println(j<k);
		System.out.println(j>k);
		System.out.println(j>=k);
		System.out.println(j<=k);
		System.out.println(j==k);
		
		
		char i = 'a';
		System.out.println(i!=k);

/*****************Bitwise Operator***********/
//		&(And) |(or) ^(Exor) ~(Not) << left shift >> right shift >>> right shift zero fill
		
		int x=9 , y= 12;
		int z=x & y;
		System.out.println("x & y is " + z);
		z=x | y;
		System.out.println("x & y is " + z);
		z=x ^ y;
		System.out.println("x & y is " + z);
		z=~x;
		System.out.println("x & y is " + z);
// Encryption message for bitwise operator
		int m=5;
		System.out.println((byte)m<<28); //TypeCasting method
		System.out.println("right shift with zero fill " + (m>>>28));
// Boolean Bitwise operation
		Boolean A= true , B = false;
		System.out.println(A&B);
// Logical operators
//		&& || & | - Works btw to boolean return type.
		int e= 22;
//							false	  true --> false
		System.out.println((e>20) && (e>30));
		System.out.println((e<20)|| (e>30));
		System.out.println((e<20)| (e>20));
	
	}
		
}

