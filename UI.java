package version2;
import java.util.Scanner;

public class UI implements Runnable
{
	private static UI instance;
	private Player p;
	private Sebastian s;
	private Watch watch;
	String input;
	Scanner in;
	
	UI()
	{
		this.in = new Scanner(System.in);
		Thread t = new Thread (this);
		t.start();
	}
	
	public static synchronized UI getInstance()
	{
		if(instance==null)
		{
			instance = new UI();
		} return instance;
	}
	
	public synchronized String read()
	{
		input = in.nextLine();
		input = input.toLowerCase();
		return input;
	}
	
	public synchronized void print(String out)
	{
		System.out.println(out);
	}

	@Override
	public void run() 
	{
		String[] cc = new String [] {"Charms Chest", "Magical Menagerie"};
		String[] hc = new String [] {"Greenhouse","Bookshelf"};
		String[] ac = new String [] {"Cauldron","Bookshelf"};
		String[] dc = new String [] {"Dummy","Bookshelf"};
		
		LegacyChamber CC=new Charms("Professor Flitwick",cc);
		LegacyChamber HC=new Herbology("Professor Sprout ",hc);
		LegacyChamber AC=new Alchemy("Professor Snape",ac);
		LegacyChamber DC=new DADA("Professor Lupin",dc);
		
		System.out.println("Please type 'I call forth the Founders' Stone' to start the game.\n");

		Scanner S = new Scanner(System.in);
		String input = S.nextLine();
		
		if(input.equalsIgnoreCase("I call forth the Founders' Stone"))
		{
			
			
			System.out.println("Welcome to the Wizarding World of the Hogwarts Legacy! \n");
			System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠠⠤⠀⠐⠒⠂⢀⢈⣉⡉⠉⣉⠉⠉⣉⡉⠉⠀⠐⠒⠂⠀⠤⠄⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠐⠂⠈⣡⡤⠤⣤⡀⢠⣾⠛⠉⠙⠀⢹⡇⢠⣿⡄⢀⣽⠃⣸⠟⢿⡀⠀⢹⣿⠛⣶⡄⢈⣁⣐⠂⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⡀⠄⢂⣡⠄⠐⣿⠀⢸⣿⠀⠀⢹⣷⠘⣿⡀⠈⣻⠇⠀⣿⡟⠀⢻⣾⠃⣰⡿⠷⠿⣧⠀⢸⡿⢾⡟⠁⠉⢹⣿⠛⠇⣤⠬⣔⡠⢀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠌⠀⠀⠈⢻⣦⡶⠻⣧⠘⢿⣦⣀⣼⠟⠀⠙⠻⠶⠛⠀⠀⠉⠀⠀⠀⠃⠘⠛⠃⠀⠀⠛⠃⠾⡇⠈⢿⡄⠀⣸⡇⠀⡀⢿⣦⡘⠃⠀⠡⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⡨⠂⠀⠀⠀⢿⣆⠀⠿⠓⠀⠉⢉⣁⠀⠤⠄⠀⠒⠒⠀⠀⠈⠉⠉⠉⠉⠁⠀⠀⠒⠒⠀⠠⠤⠀⣀⡀⠻⠈⠉⠃⠚⢷⣤⣿⠇⠀⠐⢅⠀⠀⠀⠀\n"
					+ "⠀⠀⠔⠁⠀⠀⠑⢄⠀⢉⡀⠤⠐⠂⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠐⠂⠤⢀⡀⠀⡠⠊⠀⠀⠀⠢⠀⠀\n"
					+ "⢀⠊⣀⣀⣀⠀⠀⠀⠙⠒⠒⢒⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡒⠒⠐⠋⠀⠀⠀⣀⣀⣀⠑⡀\n"
					+ "⠉⠀⠀⠀⢰⠀⠀⠀⣀⠄⠂⠁⠀⠀⡠⠊⠑⠒⠢⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠔⠒⠂⠑⢄⠀⠀⠈⠐⠠⣀⠀⠀⠀⡆⠀⠀⠀⠉\n"
					+ "⠀⠀⠀⠀⠀⢀⠄⠊⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠈⠑⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠊⠁⠀⠀⠀⠀⠀⠀⠱⣄⠀⠀⠀⠀⠑⠠⡀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠐⠁⠀⠀⠀⠀⢀⠞⠁⠀⠀⢀⣶⣶⣦⠀⠀⠀⠀⠈⠑⠂⠀⠠⡀⢀⠄⠀⠐⠊⠁⣠⣴⣶⣶⣄⠀⠀⠀⠀⠀⠈⠣⡀⠀⠀⠀⠀⠈⠂⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠧⢄⡀⠀⠀⠘⣿⡇⣸⠀⣠⣶⣿⣿⣦⡀⠀⠀⠙⠃⠀⢀⣴⣿⣿⠛⠉⠉⣿⣿⡆⠀⠀⠀⠀⢀⡠⠼⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠲⣄⠀⠙⢷⡿⠀⣿⣿⣿⣿⣿⣿⠂⠀⠀⠀⢀⠞⠛⠉⠁⠀⢀⣴⣿⡿⠁⠀⠀⣠⠖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⣸⠇⠠⣿⣿⣿⣿⡏⠁⣠⣤⣤⠀⡎⠀⢀⣤⣶⣾⣿⠿⠋⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⣿⠀⢰⣿⣿⣿⣿⣿⠿⠟⠀⠀⠈⠀⢠⣿⡿⠋⠉⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠘⣷⣿⣿⣿⣿⡿⠛⠳⠦⢤⣀⣀⡀⠿⠟⠓⢄⠀⠀⣠⣶⣿⣿⣷⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⢹⣿⣿⣯⠘⡄⠲⣶⣶⠖⠀⠠⣶⣦⡶⠂⢠⣿⣿⣿⣿⣿⣿⠟⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇⠀⣶⠿⠛⣿⡇⠀⢃⠀⢸⣿⡀⠀⠀⢸⣿⡇⠀⡜⠙⢿⣿⣿⣿⣿⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠤⠤⠿⠷⠤⠼⠷⠤⢼⠀⢸⣿⠟⠛⠛⢻⣿⠁⠀⡧⠤⠤⠤⠿⠯⠤⠤⠤⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠞⠀⠀⣠⣤⣤⣀⣀⠀⠀⡘⠀⠈⣿⠀⠀⠀⢸⣿⠀⠀⢳⠶⣾⣿⣷⡄⠀⢠⣾⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢊⠀⠀⢿⣿⣿⣿⣿⣿⠟⠡⡁⠀⠒⠛⠒⠀⠀⠾⠛⠒⠀⢈⣄⣽⣿⣿⣧⣀⣸⣿⣿⣿⣷⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠸⣷⡀⢸⣿⣿⣿⣧⣀⠀⠀⠑⠄⠤⠄⠐⠒⠒⠂⢠⣤⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠙⠦⡀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⣔⠁⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠈⣢⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⠀⠀⠀⠉⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⠔⠁⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢄⠀⠀⢀⣾⡿⠋⠀⠀⢹⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⠇⠈⠉⠻⢿⣿⡇⡠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⡄⠈⠁⢀⡀⠿⠷⠿⠿⠛⣿⣿⠿⣿⡄⠀⠀⠀⠀⢸⣿⣿⣿⠹⣿⠟⠛⣇⠀⢀⡀⠀⠀⢩⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⡴⠋⠙⠦⡀⠀⣴⡾⠿⠟⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⣿⣀⠀⣿⠿⠋⠙⢦⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠢⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⣀⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠢⣄⠀⠀⠀⠀⠀⠀⣠⠔⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢣⡀⠀⠀⢀⡜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⠤⠤⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n\n"
					+ "You have discovered the Founders' Stone and unlocked the Legacy Chambers.\n"
					+ "You are now at the entrance of the chambers.\n");
			
			System.out.println("You have been tasked with a very special quest to find Sebastian Sallow, a friend of yours who is lost within this enormous castle.\n"
					+ "But here's the catch; It is after curfew hours, so you only have 4 minutes to find him without being caught by the groundskeeper, Mr.Filch.\n"
					+ "You will be given guidance regarding how to navigate the castle and find your friend. Once you have found him, type 'Evanesco' to vanish.\n"
					+ "If 4 minutes have passed and you weren't able to find him, you will be given 10 seconds to vanish yourself safely, and then you can try again.\n"
					+"Good luck!\n");
			
			System.out.println("Clock is ticking... 4 minutes left.\n");
			this.watch = Watch.getInstance(this);
			this.p = Player.getInstance(this, watch);
			this.s = Sebastian.getInstance(this);
			
			while(!input.equalsIgnoreCase("evanesco"))
			{
				System.out.println("Please choose one of the following options:\n-look around\n-walk north\n-walk south\n-walk east\n-walk west\n-evanesco\n");
				input=S.nextLine();
				
				
				if(input.equalsIgnoreCase("evanesco"))
				{
					System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n"); 
					System.exit(0);
				}
				
				switch(input)
				{
					case "look around":
						System.out.println("The entrance is a dimly lit room with doors leading to the four chambers.\n"
							+ "The Charms Chamber lies to the North.\n"
							+ "The Alchemy Chamber lies to the West.\n"
							+ "The Herbology Chamber lies to the East.\n"
							+ "The Defense Against the Dark Arts Chamber lies to the South.\n");
						break;
					
					case "walk north":
						p.location("charms");
						System.out.println("You have entered the Charms Chamber.\n");
						System.out.println("Please choose one of the following options:\n-look around\n-talk to Professor Flitwick\n-"
								+ "use Charms Chest\n-use Magical Menagerie\n-exit chamber\n-evanesco\n");
						input=S.nextLine();
						while(!input.equalsIgnoreCase("Exit Chamber"))
						{
							if(input.equalsIgnoreCase("look around")) System.out.println(CC);
							else if (input.equalsIgnoreCase("talk to Professor Flitwick")) System.out.println(CC.Talk("Professor Flitwick"));
							else if (input.equalsIgnoreCase("use Charms Chest")) System.out.println(CC.Use(cc[0]));
							else if (input.equalsIgnoreCase("use Magical Menagerie")) System.out.println(CC.Use(cc[1]));
							else if (input.equalsIgnoreCase("Evanesco")) {System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n"); System.exit(0);}
							else 
							{
								if(input.contains("talk")) System.out.println(CC.Talk("invalid"));
								else if (input.contains("use")) System.out.println(CC.Use("invalid"));
								else System.out.println("The command you have entered is invalid. Please try again.\n");
							}
							
							input = S.nextLine();
						}
						System.out.println("You have exited the Charms Chamber\n");
						break;
					
					
					case "walk west":
						p.location("alchemy");
						
						input=S.nextLine();
						
						while(!input.equalsIgnoreCase("Exit Chamber"))
						{
							if(input.equalsIgnoreCase("look around")) System.out.println(AC);
							else if (input.equalsIgnoreCase("talk to Professor Snape")) System.out.println(AC.Talk("Professor Snape"));
							else if (input.equalsIgnoreCase("use Cauldron")) System.out.println(AC.Use(ac[0]));
							else if (input.equalsIgnoreCase("use Bookshelf")) System.out.println(AC.Use(ac[1]));
							else if (input.equalsIgnoreCase("Evanesco")) {System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n"); System.exit(0);}
							else 
							{
								if(input.contains("talk")) System.out.println(AC.Talk("invalid"));
								else if (input.contains("use")) System.out.println(AC.Use("invalid"));
								else System.out.println("The command you have entered is invalid.\n");
							}
							input = S.nextLine();
						}
						System.out.println("You have exited the Alchemy Chamber\n");
						break;
					
					case "walk south":
					p.location("dada");
						System.out.println("You have entered the Defense Against the Dark Arts Chamber.\n");
						System.out.println("Please choose one of the following options:\n-look around\n-talk to Professor Lupin\n-"
								+ "use Dummy\n-use Bookshelf\n-exit chamber\n-evanesco\n");
						
						input=S.nextLine();
						
						while(!input.equalsIgnoreCase("Exit Chamber"))
						{
							if(input.equalsIgnoreCase("look around")) System.out.println(DC);
							else if (input.equalsIgnoreCase("talk to Professor Lupin")) System.out.println(DC.Talk("Professor Lupin"));
							else if (input.equalsIgnoreCase("use Dummy"))System.out.println (DC.Use(dc[0]));
							else if (input.equalsIgnoreCase("use Bookshelf"))System.out.println( DC.Use(dc[1]));
							else if (input.equalsIgnoreCase("Evanesco")) {System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n"); System.exit(0);}
							else 
							{
								if(input.contains("talk")) System.out.println(DC.Talk("invalid"));
								else if (input.contains("use")) System.out.println(DC.Use("invalid"));
								else System.out.println("The command you have entered is invalid.\n");
							}
							input = S.nextLine();
						}
						System.out.println("You have exited the Defense Against the Dark Arts Chamber\n");
						break;
					
					case "walk east":
					p.location("herbology");
						System.out.println("You have entered the Herbology Chamber.\n");
						System.out.println("Please choose one of the following options:\n-look around\n-talk to Professor Sprout\n-"
								+ "use Greenhouse\n-use Bookshelf\n-exit chamber\n-evanesco\n");
						
						input=S.nextLine();
						
						while(!input.equalsIgnoreCase("Exit Chamber"))
						{
							if(input.equalsIgnoreCase("look around")) System.out.println(HC);
							else if (input.equalsIgnoreCase("talk to Professor Sprout")) System.out.println(HC.Talk("Professor Sprout"));
							else if (input.equalsIgnoreCase("use Greenhouse"))System.out.println (HC.Use(hc[0]));
							else if (input.equalsIgnoreCase("use Bookshelf")) System.out.println (HC.Use(hc[1]));
							else if (input.equalsIgnoreCase("Evanesco")) {System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n"); System.exit(0);}
							else 
							{
								if(input.contains("talk")) System.out.println(HC.Talk("invalid"));
								else if (input.contains("use")) System.out.println(HC.Use("invalid"));
								else System.out.println("The command you have entered is invalid.");
							}
							input = S.nextLine();
							
						}
						System.out.println("You have exited the Herbology Chamber\n");
						break;
						
				
					case "evanesco":
						System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!"); System.exit(0);
						break; 
						
					 default:
						System.out.println("The command you have entered is invalid. Please try again.\n");
						break;
						}
				}
		}
		System.out.println("You have exited the game.\nThank you for playing Hogwarts Legacy!\n");
		System.exit(0);
		
		}
		
	}
	
	

