package movie;

public class Genre 
{
	private String movieId;
	private String genre;
	
	public Genre()
	{
		this.movieId = null;
		this.genre = null;
	}
	
	public Genre(String movieId, String genre)
	{
		this.movieId = movieId;
		this.genre = genre;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
}
