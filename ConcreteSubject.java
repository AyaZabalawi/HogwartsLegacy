package version2;

import java.util.ArrayList;

public class ConcreteSubject implements Subject
{
    private ArrayList<Observer> observers;

    public ConcreteSubject()
    {
    	observers = new ArrayList <Observer>();
    }

	@Override
	public void removeObsever(Observer o) 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void registerObserver(Observer o) 
	{
		observers.add(o);
	}

	@Override
	public void notifyObservers(int time) 
	{
		 for (int i =0; i<observers.size(); i++)
	        {
	            Observer observer = observers.get(i);
	            
				observer.update(time);
	        }
	}

}