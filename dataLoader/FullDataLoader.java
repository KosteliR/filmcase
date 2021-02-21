package dataLoader;

import java.util.ArrayList;
import movie.Actor;
import movie.Director;
import movie.Country;
import movie.Genre;
import movie.Location;
import movie.MovieDetails;
import movie.Tags;
import movie.Ratings;
import movie.Movie;
import movieLibrary.MovieLibrary;
import java.util.HashMap;


public class FullDataLoader 
{
	private ArrayList<Actor> actorsList = new ArrayList<Actor>();
	private ArrayList<Director> directorsList = new ArrayList<Director>();
	private ArrayList<Country> countriesList = new ArrayList<Country>();
	private ArrayList<Location> locationsList = new ArrayList<Location>();
	private ArrayList<MovieDetails> moviedetailsList = new ArrayList<MovieDetails>();
	private ArrayList<Genre> genresList = new ArrayList<Genre>();
	private ArrayList<Tags> tagsList = new ArrayList<Tags>();
	private ArrayList<Ratings> ratingsList = new ArrayList<Ratings>();
	private HashMap<String,Integer> positionid = new HashMap<String,Integer>();
	private HashMap<String,String> idbytitle = new HashMap<String,String>();
	
	public FullDataLoader()
	{
	    ActorLoader actors = new ActorLoader();
		DirectorLoader directors = new DirectorLoader();
		CountryLoader countries = new CountryLoader();
	    LocationLoader locations = new LocationLoader();
		MovieDetailsLoader moviedetails = new MovieDetailsLoader();
		GenreLoader genres = new GenreLoader();
		actorsList = actors.loadData();
		directorsList = directors.loadData();
		countriesList = countries.loadData();
		locationsList = locations.loadData();
	    moviedetailsList = moviedetails.loadData();
		genresList = genres.loadData();
	}
	
	public ArrayList<Genre> genreFormatting(String id)
	{
		ArrayList<Genre> g = new ArrayList<Genre>();
		for(int i=0; i<genresList.size(); i++)
		{
			if(genresList.get(i).getMovieId().equals(id))
			{
				g.add(genresList.get(i));
			}
		}
		if(g.size() == 0)
		{
			return null;
		}
		return g;
	}
	
	public Country countryFormatting(String id)
	{
		for(int i = 0; i < countriesList.size(); i++)
		{
		    if (countriesList.get(i).getMovieId().equals(id))
			{
				return countriesList.get(i);
			}
		}
		return null;
	}
	
	public Director directorFormatting(String id)
	{
		for(int i = 0; i < directorsList.size(); i++)
		{
		    if (directorsList.get(i).getMovieId().equals(id))
			{
				return directorsList.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Actor> actorFormatting(String id)
	{
		ArrayList<Actor> a = new ArrayList<Actor>();
		for(int i=0; i<actorsList.size(); i++)
		{
			if(actorsList.get(i).getMovieId().equals(id))
			{
				a.add(actorsList.get(i));
			}
		}
		if(a.size() == 0)
		{
			return null;
		}
		return a;
	}
	
	public ArrayList<Location> locationFormatting(String id)
	{
		ArrayList<Location> l = new ArrayList<Location>();
		for(int i=0; i<locationsList.size(); i++)
		{
			if(locationsList.get(i).getMovieId().equals(id))
			{
				l.add(locationsList.get(i));
			}
		}
		if(l.size() == 0)
		{
			return null;
		}
		return l;
	}
	public ArrayList<Ratings> ratingsFormatting(String id)
	{
		ArrayList<Ratings> r = new ArrayList<Ratings>();
		for(int  i=0; i<ratingsList.size(); i++)
		{
			if(ratingsList.get(i).getMovieId().equals(id))
			{
				r.add(ratingsList.get(i));
			}
		}
		if(r.size() == 0)
		{
			return null;
		}
		return r;
	}
	
	public ArrayList<Tags> tagsFormatting(String id)
	{
		ArrayList<Tags> t = new ArrayList<Tags>();
		for(int i=0; i<tagsList.size();  i++)
		{
			if(tagsList.get(i).getMovieId().equals(id))
			{
				t.add(tagsList.get(i));
			}
		}
		if(t.size() == 0)
		{
			return null;
		}
		return t;
	}
	public ArrayList<Movie> createMovieLibrary()
	{
		MovieLibrary movielibrary = new MovieLibrary();
		for (int i = 0; i < moviedetailsList.size(); i++)
		{	
			ArrayList<Genre> g = genreFormatting(moviedetailsList.get(i).getId());
			ArrayList<Actor> a = actorFormatting(moviedetailsList.get(i).getId());
			ArrayList<Location> l = locationFormatting(moviedetailsList.get(i).getId());
			Country c = countryFormatting(moviedetailsList.get(i).getId());
			Director d = directorFormatting(moviedetailsList.get(i).getId());
			if(g!=null && a!=null && c!=null && d!=null)
			{
				Movie movie = new Movie(moviedetailsList.get(i) , a , g , d , c , l);
				movielibrary.getMovieLibrary().add(movie);
			}
		}
		return movielibrary.getMovieLibrary();
	}
	
	public HashMap<String,Integer> createPositionId(ArrayList<Movie> movielibrary)
	{
		for (int i = 0; i < movielibrary.size(); i++)
		{
			positionid.put(movielibrary.get(i).getMovieDetails().getId(), i);
		}
		return positionid;
	}
	
	public HashMap<String,String> createIdByTitle(ArrayList<Movie> movielibrary)
	{
		for (int i = 0; i < movielibrary.size(); i++)
		{
			idbytitle.put(moviedetailsList.get(i).getTitle(), moviedetailsList.get(i).getId());
		}
		return idbytitle;
	}
	

	public void loadRT(MovieLibrary movielibrary)
	{
		RatingsLoader ratings = new RatingsLoader();
	    TagsLoader tags = new TagsLoader();
		ratingsList = ratings.loadData();
		tagsList = tags.loadData();
		for(int i=0; i<movielibrary.getMovieLibrary().size(); i++)
		{
			ArrayList<Tags> t = tagsFormatting(movielibrary.getMovieLibrary().get(i).getMovieDetails().getId());
			movielibrary.getMovieLibrary().get(i).setTags(t);
			ArrayList<Ratings> r = ratingsFormatting(movielibrary.getMovieLibrary().get(i).getMovieDetails().getId());
			movielibrary.getMovieLibrary().get(i).setRatings(r);
		}
	}

	public HashMap<String,String> getIdByTitle() 
	{
		return idbytitle;
	}
	
	public void setIdByTitle(HashMap<String,String> idbytitle)
	{
		this.idbytitle = idbytitle;
	}
	
	public HashMap<String,Integer> getPositionId()
	{
		return positionid;
	}
	
}
