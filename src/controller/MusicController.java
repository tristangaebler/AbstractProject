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
			}
		}
	}

}

