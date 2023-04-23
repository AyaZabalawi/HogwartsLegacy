package version2;

public class Charms extends LegacyChamber implements Use, Talk, Location
  {
	
	private static UI ui ;
	
	//Default constructor
	public Charms()
	{
		super();
	}
  
	//Non-default constructor
	public Charms(String pname, String[] itemslist)
	{
		super(pname, itemslist);
		pname = "Professor Flitwick";
		itemslist = new String [] {"Charms Chest","Magical Menagerie"};
	}
  
	//Talk function
	public String Talk(String talk)
	{
		if(talk.equalsIgnoreCase(pname))
			return( pname+": Greetings student! This is the Charms Chamber. \nUse the Charm Chest to practice your spells\n"
					+ "and interact with the animals in the Magical Menagerie to learn more about Charms.\n");

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
		return ("You see Professor Flitwick and a Charm Chest. There is also a Magical Menagerie filled with animals"
				+ " used in spells.\n");
	}
	
	//Use function
	public String Use(String Item) 
	{
		if(Item.equals(itemslist[0]))
		{
			return "The Charms Chest contains spell ingredients such as wands, incantations, and spell books.\n"; 
		}
		
		else if (Item.equals(itemslist[1]))
		{
			return "The Magical Menagerie is filled with animals you can use to learn about Charms spells.\n";
		}
		else
			return "The item you have entered was not found in the Charms Chamber. Please enter 'use Charms Chest'"
			+ " or 'use Magical Menagerie'.\n";
	}
}

