package report;

import java.util.ArrayList;
import java.util.HashMap;

import movie.Movie;

public interface IReport
{
	public void report(Movie movie);
	
	public void generalReport(ArrayList<Movie> movies, HashMap <String,Integer> pos, ArrayList<String>info, String name, String answer);
	
	public void reportTags(Movie movie, String name);
	
	public void reportRatings(Movie movie, String name);
}
