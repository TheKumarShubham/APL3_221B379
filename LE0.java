/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Juet{
    public
    String name;
    int age;
    
    void setname(String s){
        name=s;
        
    }
    void setage(int x){
        age=x;
        
    }
    void getname(){
        System.out.println(name);
        
    }
    void getage(){
        System.out.println(age);
    }
}
public class Main
{
	public static void main(String[] args) {
		Juet ob=new Juet();
		ob.setname("ABC");
		ob.setage(10);
		ob.getname();
		ob.getage();
	}
}
