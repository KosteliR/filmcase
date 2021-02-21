package dataLoader;

import java.util.ArrayList;
import java.util.StringTokenizer;

import fileReader.FileReader;
import movie.Director;

public class DirectorLoader implements DataLoader <ArrayList<Director>>
{
	private String path = "movie_directors.dat" ;
	private ArrayList<Director> directors = new ArrayList<Director>();
	
	@Override
	public ArrayList<Director> loadData() 
	{
		ArrayList<String> text = new ArrayList<String>();
		FileReader file = new  FileReader(path);
		if(file.initReader())
		{
			text = file.readFile();
			for(int line = 0; line < text.size(); line++)
			{
				StringTokenizer token = new StringTokenizer(text.get(line), "\t");
				if(token.countTokens() == 3)
				{
					Director director = new Director(token.nextToken(), token.nextToken(), token.nextToken());
					directors.add(director);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return directors;
	}
}