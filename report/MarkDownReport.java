package report;

import movie.Movie;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import dataLoader.FullDataLoader;

public class MarkDownReport implements IReport
{
	private String name;
	private Movie movie2;
	private String answer;
	
	public MarkDownReport(String name,String answer)
	{
		this.name = name;
		this.answer=answer;
	}
	
	@Override
	public void report(Movie movie2) 
	{
		String genres = "";
		for(int x = 0; x < movie2.getGenre().size(); x++)
		{
			if(x == 0)
			{
				genres += movie2.getGenre().get(x).getGenre();
			}
			if(x > 0)
			{
				genres +="," + movie2.getGenre().get(x).getGenre();
			}
		}
		String actors = "";
		for(int x = 0; x < movie2.getActor().size(); x++)
		{
			if(x == 0)
			{
				actors += movie2.getActor().get(x).getActorName();
			}
			else
			{
				actors += "," + movie2.getActor().get(x).getActorName();
			}
		}
		String locations = "";
		if(movie2.getLocation() != null)
		{
			for(int x = 0; x < movie2.getLocation().size(); x++)
			{
				if(x == 0)
				{ 
					locations += movie2.getLocation().get(x).getLocation1();
					locations += movie2.getLocation().get(x).getLocation2();
					locations += movie2.getLocation().get(x).getLocation3();
					locations += movie2.getLocation().get(x).getLocation4();
				}
				else
				{
					locations += "," + movie2.getLocation().get(x).getLocation1();
					locations += "," + movie2.getLocation().get(x).getLocation2();
					locations += "," + movie2.getLocation().get(x).getLocation3();
					locations += "," + movie2.getLocation().get(x).getLocation4();
				}
			}
		}
		else
		{
			locations += "Locations are not available for this movie.";
		}
		String filename = new String (name + ".md");
		try 
		{
			PrintWriter markdownfile = new PrintWriter(new FileOutputStream(filename,true));
			markdownfile.println("## SERmovies");
			markdownfile.println(" ");
			markdownfile.println(">" + movie2.getMovieDetails().getTitle() + "," + "(Title:" + movie2.getMovieDetails().getSpanishTitle() + "," + "Title:" + movie2.getMovieDetails().getYear() + ")");
			markdownfile.println(" ");
			markdownfile.println("![image url](" + movie2.getMovieDetails().getImdbPictureURL() + ")");
			markdownfile.println(" ");
			markdownfile.println("..................................");
			markdownfile.println(" ");
			markdownfile.println("_" + answer + "_");
			markdownfile.println(" ");
			markdownfile.println("* **_Genre_**:" + genres);
			markdownfile.println("* **_Acotrs_**:" + actors);
			markdownfile.println("* **_Director_**:" + movie2.getDirector().getDirectorName());
			markdownfile.println("* **_Country_**:" + movie2.getCountry().getCountry());
			markdownfile.println("* **_Filming Locations_**:" + locations);
			markdownfile.println(" ");
			markdownfile.println("* **_All critics ratings_**:" + movie2.getMovieDetails().getRtAllCriticsRating());
			markdownfile.println("* **_All critics reviews_**:" + movie2.getMovieDetails().getRtAllCriticsNumReviews());
			markdownfile.println("* **_All critics fresh_**:" + movie2.getMovieDetails().getRtAllCriticsNumFresh());
			markdownfile.println("* **_All critics rotten_**:" + movie2.getMovieDetails().getRtAllCriticsNumRotten());
			markdownfile.println("* **_All critics score_**:" + movie2.getMovieDetails().getRtAllCriticsScore());
			markdownfile.println("* **_Top critics ratings_**:" + movie2.getMovieDetails().getRtTopCriticsRating());
			markdownfile.println("* **_Top critics reviews_**:" + movie2.getMovieDetails().getRtTopCriticsNumReviews());
			markdownfile.println("* **_Top critics fresh_**:" + movie2.getMovieDetails().getRtTopCriticsNumFresh());
			markdownfile.println("* **_Top critics rotten_**:" + movie2.getMovieDetails().getRtTopCriticsNumRotten());
			markdownfile.println("* **_Top critics score_**:" + movie2.getMovieDetails().getRtTopCriticsScore());
			markdownfile.println("* **_Audience ratings_**:" + movie2.getMovieDetails().getRtAudienceRating());
			markdownfile.println("* **_Number of audience ratings:_**:" + movie2.getMovieDetails().getRtAudienceNumRatings());
			markdownfile.println("* **_Audience score_**:" +  movie2.getMovieDetails().getRtAudienceScore());
			markdownfile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
		}
	}

	@Override
	public void reportTags(Movie movie3, String name) {
		String filename = new String (name + ".md");
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
		try {
			PrintWriter markdownfile = new PrintWriter(new FileOutputStream(filename,true));
			markdownfile.println("..................................");
			markdownfile.println("**_Movie's tags_**...");
			markdownfile.println(tags);
			markdownfile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Problem opening files.");
		}
	}

	@Override
	public void reportRatings(Movie movie, String name) {
		String filename = new String (name + ".md");
		String ratings = "";
		if(movie.getRatings() != null)
		{
			for(int x = 0; x < movie.getRatings().size(); x++)
			{
				if(x == 0)
				{
					ratings += movie.getRatings().get(x).getRating();
				}
				else
				{
					ratings += ", " + movie.getRatings().get(x).getRating();
				}
			}
			System.out.println(ratings);
		}
		else
		{
			ratings += "Ratings are not available for this movie.";
		}
		try {
			PrintWriter markdownfile = new PrintWriter(new FileOutputStream(filename,true));
			markdownfile.println("..................................");
			markdownfile.println("**_Movie's ratings_**...");
			markdownfile.println(ratings);
			markdownfile.close();
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
				moviedetails += ", "  + movies.get(position).getDirector().getDirectorName();
			}
			else
			{
				moviedetails += "-";
			}
			moviedetails += '\n';
		}
		String filename = new String (name + ".md");
		try {
			PrintWriter markdownfile = new PrintWriter(new FileOutputStream(filename,true));
			markdownfile.println("**Number of movies found:**" + " " + info.size());
			markdownfile.println("**" + answer + "Movies.**");
			markdownfile.println(moviedetails);
			markdownfile.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}	
	}
}
