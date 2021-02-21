package report;

import movie.Movie;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class TxtReport implements IReport
{
	private String name;
	private Movie movie;
	private String answer;
	
	public TxtReport(String name,String answer)
	{
		this.name = name;
		this.answer = answer;
	}
	
	@Override
	public void report(Movie movie3) 
	{
		String genres = "";
		for(int x = 0; x < movie3.getGenre().size(); x++)
		{
			if(x == 0)
			{
				genres += movie3.getGenre().get(x).getGenre();
			}
			if(x > 0)
			{
				genres +="," + movie3.getGenre().get(x).getGenre();
			}
		}
		String actors = "";
		for(int x = 0; x < movie3.getActor().size(); x++)
		{
			if(x == 0)
			{
				actors += movie3.getActor().get(x).getActorName();
			}
			else
			{
				actors += "," + movie3.getActor().get(x).getActorName();
			}
		}
		String locations = "";
		if(movie3.getLocation() != null)
		{
			for(int x = 0; x < movie3.getLocation().size(); x++)
			{
				if(x == 0)
				{ 
					locations += movie3.getLocation().get(x).getLocation1();
					locations += movie3.getLocation().get(x).getLocation2();
					locations += movie3.getLocation().get(x).getLocation3();
					locations += movie3.getLocation().get(x).getLocation4();
				}
				else
				{
					locations += "," + movie3.getLocation().get(x).getLocation1();
					locations += "," + movie3.getLocation().get(x).getLocation2();
					locations += "," + movie3.getLocation().get(x).getLocation3();
					locations += "," + movie3.getLocation().get(x).getLocation4();
				}
			}
		}
		else
		{
			locations += "Locations are not available for this movie.";
		}
		String filename = new String (name + ".txt");
		try {
			PrintWriter txtfile = new PrintWriter(new FileOutputStream(filename,true));
			txtfile.println("SERmovies");
			txtfile.println();
			txtfile.println('"' + movie3.getMovieDetails().getTitle() + '"' +  "," + "(" + movie3.getMovieDetails().getSpanishTitle() + "," + movie3.getMovieDetails().getYear() + ")");
			txtfile.println();
			txtfile.println(movie3.getMovieDetails().getImdbPictureURL());
			txtfile.println();
			txtfile.println("..................................");
			txtfile.println();
			txtfile.println();
			txtfile.println("Genre:" + genres);
			txtfile.println("Actors:" + actors);
			txtfile.println("Director:" + movie3.getDirector().getDirectorName());
			txtfile.println("Country:" + movie3.getCountry().getCountry());
			txtfile.println("Filming Locations:" + locations);
			txtfile.println();
			txtfile.println();
			txtfile.println("Movie Details:");
			txtfile.println();
			txtfile.println("All critics ratings:" + movie3.getMovieDetails().getRtAllCriticsRating());
			txtfile.println("All critics reviews:" + movie3.getMovieDetails().getRtAllCriticsNumReviews());
			txtfile.println("All critics fresh:" + movie3.getMovieDetails().getRtAllCriticsNumFresh());
			txtfile.println("All critics rotten:" + movie3.getMovieDetails().getRtAllCriticsNumRotten());
			txtfile.println("All critics score:" + movie3.getMovieDetails().getRtAllCriticsScore());
			txtfile.println("Top critics ratings:" + movie3.getMovieDetails().getRtTopCriticsRating());
			txtfile.println("Top critics reviews:" + movie3.getMovieDetails().getRtTopCriticsNumReviews());
			txtfile.println("Top critics fresh:" + movie3.getMovieDetails().getRtTopCriticsNumFresh());
			txtfile.println("Top critics rotten:" + movie3.getMovieDetails().getRtTopCriticsNumRotten());
			txtfile.println("Top critics score:" + movie3.getMovieDetails().getRtTopCriticsScore());
			txtfile.println("Audience ratings:" + movie3.getMovieDetails().getRtAudienceRating());
			txtfile.println("Number of audience ratings:" + movie3.getMovieDetails().getRtAudienceNumRatings());
			txtfile.println("Audience score:" +  movie3.getMovieDetails().getRtAudienceScore());
			txtfile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
		}
	}

	@Override
	public void reportTags(Movie movie3, String name) 
	{
		String filename2 = new String (name + ".html");
		String tags = "";
		if(movie3.getTags() != null)
		{
			for(int x = 0; x < movie3.getTags().size(); x++)
			{
				if(x == 0)
				{
					tags += movie3.getTags().get(x).getValue();
				}
				else
				{
					tags += ", " + movie3.getTags().get(x).getValue();
				}
			}
		}
		else
		{
			tags += "Tags are not available for this movie.";
		}
		String filename = new String (name + ".txt");
		try {
			PrintWriter txtfile = new PrintWriter(new FileOutputStream(filename,true));
			txtfile.println();
			txtfile.println();
			txtfile.println("..................................");
			txtfile.println();
			txtfile.println("Movie's tags...");
			txtfile.println();
			txtfile.println(tags);
			txtfile.println();
			txtfile.println();
			txtfile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
		}
		
	}

	@Override
	public void reportRatings(Movie movie3, String name) 
	{
		String filename = new String (name + ".txt");
		String ratings = "";
		if(movie3.getRatings() != null)
		{
			for(int x = 0; x < movie3.getRatings().size(); x++)
			{
				if(x == 0)
				{
					ratings += movie3.getRatings().get(x).getRating();
				}
				else
				{
					ratings += ", " + movie3.getRatings().get(x).getRating();
				}
			}
		}
		else
		{
			ratings += "Ratings are not available for this movie.";

		}
		try {
			PrintWriter txtfile = new PrintWriter(new FileOutputStream(filename,true));
			txtfile.println();
			txtfile.println();
			txtfile.println("..................................");
			txtfile.println();
			txtfile.println("Movie's ratings...");
			txtfile.println();
			txtfile.println(ratings);
			txtfile.println();
			txtfile.println();
			txtfile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
		}
		
		
	}

	@Override
	public void generalReport(ArrayList<Movie> movies,HashMap<String,Integer> pos,ArrayList<String> info, String name, String answer)
	{
		String moviedetails = "";
		for(int j = 0; j < info.size(); j ++)
		{
			int position = pos.get(info.get(j));
			moviedetails += movies.get(position).getMovieDetails().getTitle();
			moviedetails += ", "  + movies.get(position).getMovieDetails().getYear();
			if(movies.get(position).getDirector() != null)
			{
				moviedetails += ", "  + movies.get(position).getDirector().getDirectorName()+"\n";
			}
			else
			{
				moviedetails += "-";
			}
		}
		String filename = new String (name + ".txt");
		try {
			PrintWriter txtfile = new PrintWriter(new FileOutputStream(filename,true));
			txtfile.println("Number of movies found:" + " " + info.size());
			txtfile.println(answer + " Movies.");
			txtfile.println(moviedetails);
			txtfile.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}		
	}
}
