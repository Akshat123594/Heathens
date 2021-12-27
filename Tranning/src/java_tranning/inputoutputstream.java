package java_tranning;
import java .io.*;
public class inputoutputstream {
	
	public void eat()
	{
		System.out.println("Eats Only Non Veg");
	}
	public static void main(String[] args) throws IOException {
//	
		inputoutputstream t=new inputoutputstream();
		if(t instanceof inputoutputstream)
		{
			System.out.println(" t is the reference for tiger");
		}
		else
		{
			System.out.println(" It's not a reference");
		}
	}
	}
		

	
