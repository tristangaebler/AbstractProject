package model;

public abstract class Music implements IronMan
{
	//Three data memebers 
	private String title;
	private String genre;
	private int songLength;
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public int getSongLength()
	{
		return songLength;
	}
	public void setSongLength(int songLength)
	{
		this.songLength = songLength;
	}
}
