package dataLoader;

	import java.util.ArrayList;
	import java.util.StringTokenizer;

	import fileReader.FileReader;
import movie.Ratings;

	public class RatingsLoader implements DataLoader <ArrayList<Ratings>>
	{
		private String path = "user_ratedmovies.dat";
		private ArrayList<Ratings> ratings = new ArrayList<Ratings>();
				
		@Override
		public ArrayList<Ratings> loadData() 
		{
			ArrayList<String> text = new ArrayList<String>();
			FileReader file = new  FileReader(path);
			if(file.initReader())
			{
				text = file.readFile();
				for(int line = 0; line < text.size(); line++)
				{
					StringTokenizer token = new StringTokenizer(text.get(line), "\t");
					if(token.countTokens() == 9)
					{
						token.nextToken();
						Ratings rating = new Ratings(token.nextToken(), token.nextToken());
						ratings.add(rating);
					}
				}
			}
			else
			{
				System.out.println("Cannot open file");
			}
			return ratings;
		}
	}
