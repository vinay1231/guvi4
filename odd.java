import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
	}
}
