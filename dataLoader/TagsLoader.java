package dataLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import fileReader.FileReader;
import movie.Tags;

public class TagsLoader implements DataLoader <ArrayList<Tags>>
{
	private String path1 = "tags.dat";
	private String path2 = "movie_tags.dat";
	private HashMap<String, String> tagDictionary = new HashMap<String, String>();
	private ArrayList<Tags> tags = new ArrayList<Tags>();
	
	public ArrayList<Tags> loadData() 
	{
		ArrayList<String> text1 = new ArrayList<String>();
		FileReader file1 = new  FileReader(path1);			
		if(file1.initReader())
			{
				text1 = file1.readFile();
				for(int line = 0; line < text1.size(); line++)
				{
					StringTokenizer token = new StringTokenizer(text1.get(line), "\t");
					if(token.countTokens() == 2)
					{
						String key =  token.nextToken();
						String value = token.nextToken();
						//System.out.println(key);
						tagDictionary.put(key, value);
					}	
				}
			}
			else
			{
				System.out.println("Cannot open file");
			}
			ArrayList<String> text2 = new ArrayList<String>();
			FileReader file2 = new  FileReader(path2);
			if(file2.initReader())
			{
				text2 = file2.readFile();
				for(int line = 0; line < text2.size(); line++)
				{
					StringTokenizer token = new StringTokenizer(text2.get(line), "\t");
					if(token.countTokens() == 3)
					{
						String movieId = token.nextToken();
						String tagId = token.nextToken();
						Tags tag = new Tags(movieId, tagId, tagDictionary.get(tagId), token.nextToken());
						tags.add(tag);
					}
				}
			}
			else
			{
				System.out.println("Cannot open file");
			}
			return tags;
		}
	}