package version2;

public class ConcreteObserver implements Observer 
{

    private Subject subject;

    public ConcreteObserver(Subject subject)
    {
    	this.subject = subject;
    	subject.registerObserver(this);
    }


	@Override
	public void update(int time) 
	{
		// TODO Auto-generated method stub
		
	}

}
