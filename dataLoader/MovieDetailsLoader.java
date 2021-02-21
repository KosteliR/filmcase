package dataLoader;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.HashMap;
import fileReader.FileReader;
import movie.MovieDetails;

public class MovieDetailsLoader implements DataLoader <ArrayList<MovieDetails>>
{
	private String path ="movies.dat";
	private ArrayList<MovieDetails> movieDetails = new ArrayList<MovieDetails>();
	@Override
	public ArrayList<MovieDetails> loadData() 
	{
		ArrayList<String> text = new ArrayList<String>();
		FileReader file = new  FileReader(path);
		if(file.initReader())
		{
			text = file.readFile();
			for(int line = 0; line < text.size(); line++)
			{
				StringTokenizer token = new StringTokenizer(text.get(line), "\t");
				if(token.countTokens() == 21)
				{
					String value = token.nextToken();
					String key = token.nextToken();
					MovieDetails movied = new MovieDetails(value, key , token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken());
					movieDetails.add(movied);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return movieDetails;
	}
}