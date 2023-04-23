package version2;

public class Watch extends ConcreteSubject implements Subject, Runnable
{
	Thread t;
	private static Watch instance;
	private static UI ui;
	int time=0;
	
	Watch(UI ui)
	{
		this.ui=ui;
		t = new Thread(this);
		t.start();
	}
	
	public static synchronized Watch getInstance(UI ui)
	{
		if(instance==null)
			{
				instance=new Watch(ui);
			}
		return instance;
	}
	
	@Override
	public void run() 
	{
			for( time=5;time>=0;time--)
			{
				notifyObservers(time);
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//wait for 1 minute.
			}
		
	}

}
