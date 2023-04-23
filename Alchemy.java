package version2;


public class Alchemy extends LegacyChamber implements Use, Talk, Location
	{
		private static UI ui;
		
		//Default constructor
		public Alchemy()
		{
			super();
		}
		
		//Non-default constructor
		public Alchemy(String pname, String[] itemslist)
		{
			super(pname, itemslist);
			pname = "Professor Snape";
			itemslist = new String [] {"Cauldron","Bookshelf"};
		}
		
		//Talk function
		
		public String Talk(String talk)
		{
			if(talk.equalsIgnoreCase(pname))
				return(pname+": Greetings student! This is the Alchemy Chamber. Use the Cauldron to practice your brewing skills, "
						+ "or read some texts from the Alchemy bookshelf.\n");
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
			return( "You see Professor Snape and a Cauldron. There is also an Alchemy Bookshelf you can read various texts from.\n");
		}

		
	//Use function
		public String Use(String Item) {
			if(Item==itemslist[0])
			{
				return "You can use this Cauldron to whip up a special Polyjuice potion!\n"; 
			}
			else if (Item==itemslist[1])
			{
				return "The Alchemy Bookshelf contains various texts and recipes that you can use to make "
						+ "any potion you might need.\n";
			}
			else
				return "The item you have entered was not found in the Alchemy Chamber. Please enter 'use Cauldron'"
						+ " or 'use Bookshelf'.\n";
		}

		
	}
