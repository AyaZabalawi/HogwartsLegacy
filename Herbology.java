package version2;

public class Herbology extends LegacyChamber implements Use, Talk, Location
{
	private static UI ui;
	
	//Default constructor
	public Herbology()
	{
		super();
	}
	//Non-default constructor
	public Herbology(String pname, String[] itemslist)
	{
		super(pname, itemslist);
		pname = "Professor Sprout";
		itemslist = new String [] {"Greenhouse","Bookshelf"};
	}
	
	
	//Talk function
	
	public String Talk(String talk)
	{
		if(talk.equalsIgnoreCase(pname))
			return( pname+": Greetings student! This is the Herbology Chamber. Use the \n"
					+ "Greenhouse to practice your skills, or read some texts from the Herbology bookshelf.\n");
		else
			return("The character you have entered is invalid.\n");
		
	}
	
	//Look Around function
	
	public void Location()
	{
		toString();
	}
	
	public String toString()
	{
		return("You see Professor Sprout and a "
				+ "Greenhouse. There is also an Herbology Bookshelf you can read various texts from.\n");
	}
	
	//Use function
		
		public String Use(String Item) {
			if(Item==itemslist[0])
			{
				return "You can use this Greenhouse to practice your herbology skills.\n"; 
			}
			else if (Item==itemslist[1])
			{
				return "The Herbology Bookshelf contains various texts about magical plants, flowers, and fungi.\n";
			}
			else
				return "The item you have entered was not found in the Herbology Chamber. Please enter 'use Greenhouse'"
						+ " or 'use Bookshelf'.\n";
		}
}
		
