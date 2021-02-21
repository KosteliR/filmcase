package dataLoader;

import java.util.ArrayList;
import java.util.StringTokenizer;
import fileReader.FileReader;
import movie.Genre;

public class GenreLoader implements DataLoader <ArrayList<Genre>>
{
	private String path ="movie_genres.dat";
	private ArrayList<Genre> genres = new  ArrayList<Genre>();
		
	@Override
	public ArrayList<Genre> loadData() 
	{
		ArrayList<String> text = new ArrayList<String>();
		FileReader file = new  FileReader(path);
		if(file.initReader())
		{
			text = file.readFile();
			for(int line = 0; line < text.size(); line++)
			{
				StringTokenizer token = new StringTokenizer(text.get(line), "\t");
				if(token.countTokens() == 2)
				{
					Genre genre = new Genre(token.nextToken(), token.nextToken());
					genres.add(genre);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return genres;
	}
}