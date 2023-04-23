package version2;

public class Sebastian implements Runnable
{
	private static Sebastian instance;
	private static UI ui;
	String playerloc;
	boolean found=false;
	
	Sebastian(UI ui)
	{
		this.playerloc="";
		this.ui=ui;
		Thread t = new Thread (this);
		t.start();
	}
	
	public static synchronized Sebastian getInstance(UI ui)
	{
		if(instance==null)
			{
				instance=new Sebastian(ui);
			}
		return instance;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			if(playerloc.equals("alchemy"))
			{
				ui.print("You have entered the Alchemy Chamber.\n");
				ui.print("Please choose one of the following options:\n-look around\n-talk to Professor Snape\n-"
						+ "use Cauldron\n-use Bookshelf\n-exit chamber\n-evanesco\n");
				ui.print("Sebastian: I am here!");
				found=true;
				
				break;
			}
		}
	}
	
}
