package java_tranning;

public class Singelton {
static Singelton obj=getInstance();

private Singelton()
{
	
}
private static Singelton getInstance()
{ int i=1;
	if(obj==null)
	{
		while(i!=1)
	return new Singelton();
		i--;
	}
	return obj;
	
}


}
