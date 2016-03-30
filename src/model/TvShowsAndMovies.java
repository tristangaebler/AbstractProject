package model;

public abstract class TvShowsAndMovies implements IronMan
{
	private String showName;
	private String genre;
	private int seasons;
	
	public String getShowName() 
	{
		return showName;
	}

	public String getGenre() 
	{
		return genre;
	}

	public int getSeasons() 	
	{
		return seasons;
	}

	public void setShowName(String showName) 
	{
		this.showName = showName;
	}


	public void setGenre(String genre) 
	{
		this.genre = genre;
	}

	public void setSeasons(int seasons) 
	{
		this.seasons = seasons;
	}

}

