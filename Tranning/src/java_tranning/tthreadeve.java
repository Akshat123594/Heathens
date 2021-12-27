package java_tranning;

public class tthreadeve {
	int n=10;
public synchronized void even()
{ 
	for(int i=1;i<=n;i++)
	{
		if(n%2==0)
		{
			System.out.println(i);
			notifyAll();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public synchronized void odd()
{  for(int i=0;i<n;i++)
	if(i%2!=0)
	{
		System.out.print(i);
		notifyAll();
	}
	else {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args)
{
	 tthreadeve ev=new  tthreadeve();
	 new Thread() {
		public void run()
		{
			ev.even();
		}
	 }.start();
	 new Thread() {
		 public void run() {
			 ev.odd();
		 }
	 }.start();
}
}
