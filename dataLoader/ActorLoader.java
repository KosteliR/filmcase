package dataLoader;

import movie.Actor;
import fileReader.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ActorLoader implements DataLoader <ArrayList<Actor>>
{
	private String path = "C:\\Users\\Rodoula\\eclipse-workspace\\bloodyrose\\src\\dataLoader\\movie_actors.dat";
	private ArrayList<Actor> actors =  new ArrayList<Actor>(231737);
	
	@Override
	public ArrayList<Actor> loadData() 
	{
		ArrayList<String> text = new ArrayList<String>(231742);
		FileReader file = new  FileReader(path);
		if(file.initReader())
		{
			String s = null;
			text = file.readFile();
			for(int line = 0; line < text.size(); line++)
			{
				StringTokenizer token = new StringTokenizer(text.get(line), "\t");
				if(token.countTokens() == 4)
				{
					s = token.nextToken();
					Actor actor = new Actor(s, token.nextToken(), token.nextToken(), token.nextToken());
					actors.add(actor);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return actors;
	}
}