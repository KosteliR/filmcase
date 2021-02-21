package movie;

public class Ratings 
{
	private String movieId;
	private String rating;

	public Ratings(String movieId, String rating)
	{
		
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public Ratings()
	{
		this.movieId = null;
		this.rating = null;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getRating()
	{
		return rating;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setRating(String rating)
	{
		this.rating = rating;
	}
}
