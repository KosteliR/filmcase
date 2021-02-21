package movie;

public class Director 
{
	private String movieId;
	private String directorId;
	private String directorName;
	
	public Director()
	{
		this.movieId = null;
		this.directorId = null;
		this.directorName = null;
	}
	
	public Director(String movieId, String directorId, String directorName)
	{
		this.movieId = movieId;
		this.directorId = directorId;
		this.directorName = directorName;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getDirectorId()
	{
		return directorId;
	}
	
	public String getDirectorName()
	{
		return directorName;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setDirectorId(String directorId)
	{
		this.directorId = directorId;
	}
	
	public void setDirectorName(String directorName)
	{
		this.directorName = directorName;
	}
	
}
