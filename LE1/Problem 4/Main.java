/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		One ob1=new One(10);
		Two ob2=new Two(10);
	}
}

/*

This is why we are getting error
Earlier error = constructor One in class One cannot be applied to given types;
required: int
found: no arguments

This error occurs because, when Two is being constructed,
the compiler tries to implicitly call the no-argument constructor of One,
but One does not have a no-argument constructor. 
Instead, it has a parameterized constructor that requires an argument of type int


To fix the error, 
you need to explicitly call the parameterized constructor of the base class One from the subclass Two using the super(int x) syntax.

Explanation:
When an object of class Two is created, the constructor of Two is called.
Inside the constructor of Two, the super(x) statement calls the parameterized constructor of the base class One.
After calling super(x), the constructor of Two completes its execution.

*/
