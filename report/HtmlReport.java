package report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import dataLoader.FullDataLoader;
import movie.Movie;
import movieLibrary.MovieLibrary;

public class HtmlReport implements IReport
{
	private String name;
	private Movie movie1;
	private String answer;
	
	public HtmlReport(String name,String answer)
	{
		this.name = name;
		this.answer = answer;
	}
	
	public void report(Movie movie1) 
	{
		String genres = "";
		for(int x = 0; x < movie1.getGenre().size(); x++)
		{
			if(x == 0)
			{
				genres += movie1.getGenre().get(x).getGenre();
			}
			if(x > 0)
			{
				genres +="," + movie1.getGenre().get(x).getGenre();
			}
		}
		String actors = "";
		for(int x = 0; x < movie1.getActor().size(); x++)
		{
			if(x == 0)
			{
				actors += movie1.getActor().get(x).getActorName();
			}
			else
			{
				actors += "," + movie1.getActor().get(x).getActorName();
			}
		}
		String locations = "";
		if(movie1.getLocation() != null)
		{
			for(int x = 0; x < movie1.getLocation().size(); x++)
			{
				if(x == 0)
				{ 
					locations += movie1.getLocation().get(x).getLocation1();
					locations += movie1.getLocation().get(x).getLocation2();
					locations += movie1.getLocation().get(x).getLocation3();
					locations += movie1.getLocation().get(x).getLocation4();
				}
				else
				{
					locations += "," + movie1.getLocation().get(x).getLocation1();
					locations += "," + movie1.getLocation().get(x).getLocation2();
					locations += "," + movie1.getLocation().get(x).getLocation3();
					locations += "," + movie1.getLocation().get(x).getLocation4();
				}
			}
		}
		else
		{
			locations += "Locations are not available for this movie.";
		}
		String filename1 = new String (name + ".html");
		try {
			PrintWriter htmlfile = new PrintWriter(new FileOutputStream(filename1,true));
			htmlfile.println("<!DOCTYPE html >");
			htmlfile.println("<html>");
			htmlfile.println("<head>");
			htmlfile.println("<style>");
			htmlfile.println("div.container {");
			htmlfile.println("width: 100%;");
			htmlfile.println("border: 5px solid gray;}");
			htmlfile.println("header,footer{");
			htmlfile.println("padding: 0.5em;");
			htmlfile.println("color: white;");
			htmlfile.println("background-color: #787878;");
			htmlfile.println("text-align: left;}");
			htmlfile.println("article{");
			htmlfile.println("margin-left: 450px;");		
			htmlfile.println("border-left: 1px solid gray;");
			htmlfile.println("padding: 0.5em;");
			htmlfile.println("overflow: hidden}");
			htmlfile.println("</style>");
			htmlfile.println("</head>");
			htmlfile.println("<body bgcolor = \"#f0f0f0\">");
			htmlfile.println("<div class = \"container\">");
			htmlfile.println("<header>");
			htmlfile.println("<h1>SERmovies</h1>");
			htmlfile.println("</header>");
			htmlfile.println("<nav>");
			htmlfile.println("<ul>");
			htmlfile.println("<h1> " + movie1.getMovieDetails().getTitle() + "(" + movie1.getMovieDetails().getSpanishTitle() + "-" + movie1.getMovieDetails().getYear() + ")" + "</h1>");
			htmlfile.println("<img src=" + "\"" +  movie1.getMovieDetails().getImdbPictureURL() + "\"" + "width=\"350\"" + "height=\"400\">");
			htmlfile.println("<br> <br>");
			htmlfile.println("<br> <br>");
			htmlfile.println("<article>");
			htmlfile.println("<B>" + "Genres:" + genres + "</B>");
			htmlfile.println("<B>" + "Actors:" + actors + "</B>");
			htmlfile.println("<br> </br>");
			htmlfile.println("<br> <B>" + "Director:" + movie1.getDirector().getDirectorName() + "</B> </br>");
			htmlfile.println("<br> <B>" + "Country:" + movie1.getCountry().getCountry() + "</B>");
			htmlfile.println("<br> <B>" + "Filming Locations:" + locations + "</B>");
			htmlfile.println("</article>");
			htmlfile.println("<p> <U> <B> <I> <Big> Movie Details </U> </B> </I> </Big>");
			htmlfile.println("<br> </br>");
			htmlfile.println("<br>" + "All critics ratings:" + movie1.getMovieDetails().getRtAllCriticsRating() + "</br>");
			htmlfile.println("<br>" + "All critics reviews:" + movie1.getMovieDetails().getRtAllCriticsNumReviews() + "</br>");
			htmlfile.println("<br>" + "All critics fresh:" + movie1.getMovieDetails().getRtAllCriticsNumFresh() + "</br>");
			htmlfile.println("<br>" + "All critics rotten:" + movie1.getMovieDetails().getRtAllCriticsNumRotten() + "</br>");
			htmlfile.println("<br>" + "All critics score:" + movie1.getMovieDetails().getRtAllCriticsScore() + "</br>");
			htmlfile.println("<br>" + "Top critics ratings:" + movie1.getMovieDetails().getRtTopCriticsRating() + "</br>");
			htmlfile.println("<br>" + "Top critics reviews:" + movie1.getMovieDetails().getRtTopCriticsNumReviews()+ "</br>");
			htmlfile.println("<br>"+ "Top critics fresh:" + movie1.getMovieDetails().getRtTopCriticsNumFresh() + "</br>");
			htmlfile.println("<br>"+ "Top critics rotten:" + movie1.getMovieDetails().getRtTopCriticsNumRotten() + "</br>");
			htmlfile.println("<br>" + "Top critics score:" + movie1.getMovieDetails().getRtTopCriticsScore() + "</br>");
			htmlfile.println("<br>" + "Audience ratings:" + movie1.getMovieDetails().getRtAudienceRating() + "</br>");
			htmlfile.println("<br>" + "Number of audience ratings:" + movie1.getMovieDetails().getRtAudienceNumRatings() + "</br>");
			htmlfile.println("<br>" + "Audience score:" + movie1.getMovieDetails().getRtAudienceScore() + "</br> </p>");
			htmlfile.println("</ul>");
			htmlfile.println("</nav>");
			htmlfile.println("<footer> </footer>");
			htmlfile.println("</body>");
			htmlfile.println("</html>");
			htmlfile.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}
	}

	public void reportTags(Movie movie1 , String filename)
	{
		String filename2 = new String (name + ".html");
		String tags = "";
		if(movie1.getTags() != null)
		{
			for(int x = 0; x < movie1.getTags().size(); x++)
			{
				if(x == 0)
				{
					tags += movie1.getTags().get(x).getValue();
				}
				else
				{
					tags += ", " + movie1.getTags().get(x).getValue();
				}
			}
		}
		else
		{
			tags += "Tags are not available for this movie.";
		}
		try {
			PrintWriter htmlfileTags = new PrintWriter(new FileOutputStream(filename2,true));
			htmlfileTags.println("<!DOCTYPE html>");
			htmlfileTags.println("<html>");
			htmlfileTags.println("<body bgcolor = \"#f0f0f0\"");
			htmlfileTags.println("<nav>");
			htmlfileTags.println("<ul>");
			htmlfileTags.println("<br> </br>");
			htmlfileTags.println("<br> <B>" + "Taglines:" + tags + "</B>");
			htmlfileTags.println("</ul>");
			htmlfileTags.println("</nav>");
			htmlfileTags.println("</body>");
			htmlfileTags.println("</html>");
			htmlfileTags.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}

	}
	
	public void reportRatings(Movie movie1 , String filename)
	{
		String filename3 = new String (name + ".html");
		String ratings = "";
		if(movie1.getRatings() != null)
		{
			for(int x = 0; x < movie1.getRatings().size(); x++)
			{
				if(x == 0)
				{
					ratings += movie1.getRatings().get(x).getRating();
				}
				else
				{
					ratings += ", " + movie1.getRatings().get(x).getRating();
				}
			}
		}
		else
		{
			ratings += "Ratings are not available for this movie.";

		}
		try {
			PrintWriter htmlfileRatings = new PrintWriter(new FileOutputStream(filename3,true));
			htmlfileRatings.println("<!DOCTYPE html>");
			htmlfileRatings.println("<html>");
			htmlfileRatings.println("<body bgcolor = \"#f0f0f0\"");
			htmlfileRatings.println("<nav>");
			htmlfileRatings.println("<ul>");
			htmlfileRatings.println("<br> </br>");
			htmlfileRatings.println("<br> <B>" + "Ratinglines:" + ratings + "</B>");
			htmlfileRatings.println("</ul>");
			htmlfileRatings.println("</nav>");
			htmlfileRatings.println("</body>");
			htmlfileRatings.println("</html>");
			htmlfileRatings.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}
	}

	public void generalReport(ArrayList<Movie> movies,HashMap<String,Integer> pos,ArrayList<String> info,String name, String answer) 
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
		String filename = new String (name + ".html");
		try {
			PrintWriter htmlfile = new PrintWriter(new FileOutputStream(filename,true));
			htmlfile.println("<!DOCTYPE html>");
			htmlfile.println("<html>");
			htmlfile.println("<body bgcolor = \"#f0f0f0\"");
			htmlfile.println("<nav>");
			htmlfile.println("<ul>");
			htmlfile.println("<br> </br>");
			htmlfile.println("<br> <B> Number of movies found:" + " " + info.size() + "</B>");
			htmlfile.println("<br> <B>" + answer + " Movies. </B>");
			htmlfile.println("<br> <B>" + moviedetails + "</B>");
			htmlfile.println("</ul>");
			htmlfile.println("</nav>");
			htmlfile.println("<footer> </footer>");
			htmlfile.println("</body>");
			htmlfile.println("</html>");
			htmlfile.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Problem opening files.");
		}		
	}

}
