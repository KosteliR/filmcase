package movie;

public class Tags 
{
	private String movieId;
	private String tagId;
	private String value;
	private String tagWeight;
	
	public Tags(String movieId, String tagId, String value, String tagWeight)
	{
		this.movieId = movieId;
		this.tagId = tagId;
		this.value = value;
		this.tagWeight = tagWeight;
	}
	
	public Tags()
	{
		this.movieId = null;
		this.tagId = null;
		this.value = null;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getTagId()
	{
		return tagId;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public String getTagWeight()
	{
		return tagWeight;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setTagId(String tagId)
	{
		this.tagId = tagId;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public void setTagWeight(String tagWeight)
	{
		this.tagWeight = tagWeight;
	}
}