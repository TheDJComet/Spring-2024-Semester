/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int tableSize=9;
        
        int [][] table = new int[tableSize][tableSize];
        
        
        
        
        
        
        
        // first print the top header row
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ; i<=tableSize;i++) {
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                table[i-1][j-1] = (i)*(j);
                System.out.format("%4d",table[i-1][j-1]);
            }
        
            System.out.println();
        }
    } 

};

