/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Mother m= new Child ( );
        m.show( ); 
        // Child ch=new Child ( ); 
        // ch. show ( ); 
	}
}

/* No Static = Hello JUET
With Mother Static =  error: show() in Child cannot override show() in Mother   overridden method is static
With Child Static =   error: show() in Child cannot override show() in Mother   overriding method is static
With Both Static =    Hello World
*/