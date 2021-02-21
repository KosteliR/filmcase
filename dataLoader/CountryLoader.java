package dataLoader;

import java.util.ArrayList;
import java.util.StringTokenizer;

import fileReader.FileReader;
import movie.Country;

public class CountryLoader implements DataLoader <ArrayList<Country>>
{
	private String path = "movie_countries.dat";
	private ArrayList<Country> countries;
	
	public CountryLoader()
	{
		this.countries = new ArrayList<Country>();
	}
	
	@Override
	public ArrayList<Country> loadData() 
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
					Country country = new Country(token.nextToken(), token.nextToken());
					countries.add(country);
				}
			}
		}
		else
		{
			System.out.println("Error opening file");
		}
		return countries;
	}
}