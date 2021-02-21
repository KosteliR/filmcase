package movie;

public class Location 
{
	private String movieId;
	private String location1;
	private String location2;
	private String location3;
	private String location4;
	
	public Location()
	{
		this.movieId = null;
		this.location1 = null;
		this.location2 = null;
		this.location3 = null;
		this.location4 = null;
	}
	
	public Location(String movieId, String location1, String location2, String location3, String location4)
	{
		this.movieId = movieId;
		this.location1 = location1;
		this.location2 = location2;
		this.location3 = location3;
		this.location4 = location4;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getLocation1()
	{
		return location1;
	}
	
	public String getLocation2()
	{
		return location2;
	}
	
	public String getLocation3()
	{
		return location3;
	}
	
	public String getLocation4()
	{
		return location4;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setLocation1(String location1)
	{
		this.location1 = location1;
	}
	
	public void setLocation2(String location2)
	{
		this.location2 = location2;
	}
	
	public void setLocation3(String location3)
	{
		this.location3 = location3;
	}
	
	public void setLocation4(String location4)
	{
		this.location4 = location4;
	}
}
