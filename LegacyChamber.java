package version2;

public abstract class LegacyChamber implements Use, Talk, Location
{
  String pname;
  String[] itemslist;
  
  public LegacyChamber(String pname, String[] itemslist)
  {
    this.pname = pname;
    this.itemslist = itemslist;
  }
  
  public LegacyChamber()
  {
    this.pname=null;
    this.itemslist=null;
  }
}
