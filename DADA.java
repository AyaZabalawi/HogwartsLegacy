package version2;

public class DADA extends LegacyChamber implements Use, Talk, Location
{
	private static UI ui;
	
	//Default constructor
	public DADA()
	{
		super();
	}
	//Non-default constructor
	public DADA(String pname, String[] itemslist)
	{
		super(pname, itemslist);
		pname = "Professor Lupin";
		itemslist = new String [] {"Dummy", "Bookshelf"};
	}
	
	
	//Talk function
	
	public String Talk(String talk)
	{
		if(talk.equalsIgnoreCase(pname))
			return( pname+": Greetings student! \nThis is "
					+ "the Defense Against the Dark Arts Chamber. \nUse the "
					+ "Dummy to practice defensive spells, or read some texts \n"
					+ "from the Defense Against the Dark Arts bookshelf.\n");
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
		return ("You see Professor Lupin and a "
				+ "Dummy. There is also a Defense Against the Dark Arts Bookshelf you can read various texts from.\n");
	}
	
	//Use function
		
		public String Use(String Item) {
			if(Item==itemslist[0])
			{
				return "You can use this Dummy to practice your defensive spells.\n"; 
			}
			else if (Item==itemslist[1])
			{
				return "The Defense Against the Dark Arts Bookshelf contains various texts you can read"
						+ " to learn about the defensive arts.\n";
			}
			else
				return "The item you have entered was not found in the Defense Against the Dark Arts Chamber. "
						+ "Please enter 'use Dummy' or 'use Bookshelf'.\n";
		}
}
