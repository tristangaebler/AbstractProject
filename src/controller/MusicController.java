package controller;

import java.util.ArrayList;

import view.AbstractFrame;
import model.IronMan;
import model.MilesDavis;
import model.TheBeatles;

public class MusicController
{
	private ArrayList<IronMan> ironMan;
	private AbstractFrame baseFrame;
	
	public MusicController()
	{
		ironMan = new ArrayList<IronMan>();
		makeIronManList();
		baseFrame = new AbstractFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public String showIronMan()
	{
		String ironManLevels = "";
		for(IronMan iron : ironMan)
		{
			ironManLevels = "This is a " + iron.toString() + " and has a silliness level if" + iron.ironManLevels() + "\b";
		}
		
		return ironManLevels;
	}
	

	public void swap(int firstLocation, int secondLocation)
	{
		IronMan temp = ironMan.get(firstLocation);
		ironMan.set(firstLocation, ironMan.get(secondLocation));
		ironMan.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < ironMan.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (ironMan.get(innerLoop - 1).comapreTo(ironMan.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop - 1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint - 1);
			quicksort(midPoint + 1, high);
		}
	}
	
	
	private int partition(int low, int high)
	{
		int partitionPoint = 0;
		
		IronMan pivot = ironMan.get(high);
		int position = low;
		for(int index = low; index < high - 1; index++)
		{
			if(ironMan.get(index).comapreTo(pivot) <= 0)
			{
				swap(position, index);
				position++;
			}
		}
		
		swap(position, high);
		
		return position;
	}
	
	private void makeIronManList()
	{
		ironMan.add(new TheBeatles());
		ironMan.add(new MilesDavis());
	}

	public ArrayList<IronMan> getIronMan()
	{
		return ironMan;
	}

	public void setIronMan(ArrayList<IronMan> ironMan)
	{
		this.ironMan = ironMan;
	}

}

