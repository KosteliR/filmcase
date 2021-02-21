package movie;

public class Country 
{
	private String movieId;
	private String country;
	
	public Country()
	{
		this.movieId = null;
		this.country = null;
	}
	
	public Country(String movieId, String country)
	{
		this.movieId = movieId;
		this.country = country;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
}
