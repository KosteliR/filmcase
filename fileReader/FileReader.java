package fileReader;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader
{
	private String path;
	private Scanner inputReader = null;
		
	public FileReader(String path)
	{
		this.path = path;
	}
	
	public boolean initReader()
	{
		try
		{
			FileInputStream inputStream = new FileInputStream(path);
			inputReader = new Scanner(inputStream);
		}
		catch(FileNotFoundException e)
		{
			return false;
		}
		return true;
	}
	
	public ArrayList<String> readFile()
	{
		ArrayList<String> info = new ArrayList<String>();
		inputReader.nextLine();
		while (inputReader.hasNextLine())
		{
			info.add(inputReader.nextLine());
		}
		closeReader();
		return info;
	}
	
	public void closeReader()
	{
		inputReader.close();
	}
}