package version2;

public class Player extends ConcreteObserver implements Runnable
{
	private static Player instance;
	private Sebastian seb;
	private static UI ui;
	private static Watch watch;
	String loc="";
	boolean vanished;
	String input="";
	
	public Player(UI ui, Watch watch)
	{
		super(watch);
		this.ui=ui;
		Thread t = new Thread(this);
		t.start();
	}
	
	public static synchronized Player getInstance(UI ui, Watch watch)
	{
		if(instance==null)
			{
				instance=new Player(ui,watch);
			}
		return instance;
	}
	
	@Override
	public void run() 
	{
		watch.getInstance(ui);
	}
	
	public void location(String passedlocation) 
	{
		this.loc=passedlocation;
		seb = new Sebastian(ui);
		seb.playerloc=passedlocation;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(seb.found)
		{
			ui.print("Found Sebastian!\nType Evanesco to vanish before someone catches you!\n");
			String input=ui.read();
			if(input.equals("evanesco"))
			{
				ui.print("Vanishing... game over.\n");
				ui.print("You have exited the game.\nThank you for playing Hogwarts Legacy!\n");
				System.exit(0);
			}
			
			
		}
	}
	
	public synchronized void update(int time) 
	{
			//time == 5 -> 4 minutes left
			//time == 4 -> 3 minutes left
			//time == 3 -> 2 minutes left
			//time == 2 -> 1 minute left
			//time == 1 -> 10 seconds left
			//time == 0 -> time is up
		
			if(time==5 || time==4 || time==3 || time==2)
			{
				ui.print("Clock is ticking... "+(time-1)+" minutes left.\n");
			}
			
			else if (time==1)
			{
				ui.print("Time is up! You have 10 seconds to vanish before someone catches you.\n");
				ui.print("Type Evanesco to vanish.\n");
				
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				String in=ui.read();
				
				if(in.equals("evanesco"))
				{
					ui.print("Vanishing... game over.\n");
					ui.print("You have exited the game.\nThank you for playing Hogwarts Legacy!\n");
					System.exit(0);
				}
				
				else if(in=="")
				{
					ui.print("You have been caught!Game over!");
					System.exit(0);
				}
					
			}
			}
			
			else if (time==0)
			{
				ui.print("You have been caught!Game over!\n");
				System.exit(0);
			}
	
	}
}
