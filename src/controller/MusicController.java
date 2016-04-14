package controller;

import java.util.ArrayList;

import model.IronMan;
import model.MonstersAndMen;
import model.TheBeatles;

public class MusicController
{
	private ArrayList<IronMan> ironMan;
	
	public void start()
	{
		ironMan.add(new TheBeatles());
		ironMan.add(new MonstersAndMen());
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

}

