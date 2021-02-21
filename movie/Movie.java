package movie;

import java.util.ArrayList;

public class Movie 
{
	private MovieDetails moviedetails;
	private ArrayList<Actor> actor;
	private ArrayList<Genre> genre;
	private Director director;
	private Country country;
	private ArrayList<Location> location;
	private ArrayList<Ratings> ratings;
	private ArrayList<Tags> tags;
	
	public Movie()
	{
		moviedetails = null;
		actor = null;
		genre = new ArrayList<Genre>();
		director = null;
		country = null;
		location = null;
		ratings = null;
		tags = null;
	}
	
	public Movie(MovieDetails moviedetails,ArrayList<Actor> actor,ArrayList<Genre> genre,Director director,Country country,ArrayList<Location> location)
	{
		this.moviedetails = moviedetails;
		this.actor = actor;
		this.genre = genre;
		this.director = director;
		this.country = country;
		this.location = location;
	}
	
	public MovieDetails getMovieDetails()
	{
		return moviedetails;
	}
	
	public ArrayList<Actor> getActor()
	{
		return actor;
	}
	
	public ArrayList<Genre> getGenre()
	{
		return genre;
	}
	
	public Director getDirector()
	{
		return director;
	}
	
	public Country getCountry()
	{
		return country;
	}
	
	public ArrayList<Location> getLocation()
	{
		return location;
	}
	
	public ArrayList<Tags> getTags()
	{
		return tags;
	}
	
	public ArrayList<Ratings> getRatings()
	{
		return ratings;
	}
	
	public void setTags(ArrayList<Tags> tags)
	{
		this.tags = tags;
	}
	
	public void setRatings(ArrayList<Ratings> ratings) 
	{
		this.ratings = ratings;
	}
	
	public void setMovieDetails(MovieDetails movieDetails)
	{
		this.moviedetails = movieDetails;
	}
	
	public void setActor(ArrayList<Actor> actor)
	{
		this.actor = actor;
	}
	
	public void setGenre(ArrayList<Genre> genre)
	{
		this.genre = genre; 
	}
	
	public void setDirector(Director director)
	{
		this.director = director;
	}
	
	public void setCountry(Country country)
	{
		this.country = country;
	}
	
	public void setLocation(ArrayList<Location> location)
	{
		this.location = location;
	}

	
}
