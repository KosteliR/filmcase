package movie;

public class Actor 
{
	private String movieId;
	private String actorId;
	private String actorName;
	private String ranking;

	public Actor()
	{
		this.movieId = null;
		this.actorId = null;
		this.actorName = null;
		this.ranking = null;
	}
	
	public Actor(String movieId, String actorId, String actorName, String ranking)
	{
		this.movieId = movieId;
		this.actorId = actorId;
		this.actorName = actorName;
		this.ranking = ranking;
	}
	
	public String getMovieId()
	{
		return movieId;
	}
	
	public String getActorId()
	{
		return actorId;
	}
	
	public String getActorName()
	{
		return actorName;
	}
	
	public String getRanking()
	{
		return ranking;
	}
	
	public void setMovieId(String movieId)
	{
		this.movieId = movieId;
	}
	
	public void setActorId(String actorId)
	{
		this.actorId = actorId;
	}
	
	public void setActorName(String actorName)
	{
		this.actorName = actorName;
	}
	
	public void setRanking(String ranking)
	{
		this.ranking = ranking;
	}
}
