package dataLoader;

import movie.Location;
import fileReader.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LocationLoader implements DataLoader <ArrayList<Location>>
{
	private String path = "movie_locations.dat";
	private ArrayList<Location> locations = new ArrayList<Location>();
		
	@Override
	public ArrayList<Location> loadData() 
	{
		ArrayList<String> text = new ArrayList<String>();
		FileReader file = new  FileReader(path);
		if(file.initReader())
		{
			text = file.readFile();
			for(int line = 0; line < text.size(); line++)
			{
				StringTokenizer token = new StringTokenizer(text.get(line), "\t");
				if(token.countTokens() == 5)
				{
					Location location = new Location(token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken());
					locations.add(location);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return locations;
	}
}