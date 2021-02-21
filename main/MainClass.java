package main;

import dataLoader.FullDataLoader;
import movieLibrary.MovieLibrary;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.DocumentException;

public class MainClass 
{
	public static void main(String args[]) throws IOException, DocumentException
	{
		System.out.println("Welcome to SERmovies!");
		System.out.println("Do you want to load the data? Type 'yes' or 'no'.");
		Scanner reader = new Scanner(System.in);
		String inputString = reader.next();
		Scanner namer = new Scanner(System.in);
	
		while(!inputString.equals("yes"))
		{
			if(inputString.equals("no"))
			{
				System.out.println("Do you want to exit? Type 'yes' or 'no'.");
				inputString = reader.next();
				if(inputString.equals("yes"))
				{
					System.out.println("bye!");
					System.exit(0);
				}
				else if(inputString.equals("no"))
				{
					System.out.println("Do you want to load the data?");
					inputString = reader.next();
				}
				else
				{
					System.out.println("Not acceptable answer!");
					System.out.println("Do you want to load the data?");
					inputString = reader.next();
				}
			}
			else if(inputString.equals("no") == false)
			{
				System.out.println("Not acceptable answer!");
				System.out.println("Do you want to load the data?");
				inputString = reader.next();
			}
		}
		System.out.println("Please wait...");		
		FullDataLoader loader = new FullDataLoader();
		MovieLibrary movielibrary = new MovieLibrary();
		movielibrary.setMovieLibrary(loader.createMovieLibrary());	
		movielibrary.setPositionId(loader.createPositionId(movielibrary.getMovieLibrary()));
		movielibrary.setIdByTitle( loader.createIdByTitle(movielibrary.getMovieLibrary()));
		System.out.println("The data have been loaded.");
		System.out.println("You can exit SERmovies whenever you want by typing 'exit'.");
		System.out.println("Do you want to load the data for ratings and tags? Type 'yes' or 'no'.");
		String a = reader.next();
		while(!a.equals("no") && !a.equals("yes") && !a.equals("exit"))
		{
			System.out.println("Not acceptable answer!");
			System.out.println("Do you want to load the data for ratings and tags? Type 'yes' or 'no'.");
			a = reader.next();
		}
		if(a.equals("yes"))
		{
			System.out.println("Please wait...");
			loader.loadRT(movielibrary);
			System.out.println("Tags and ratings have been loaded.");
		}
		else if(a.equals("exit"))
		{
			System.out.println("Bye!");
			reader.close();
			System.exit(0);
		}
		int x = 10;
		while(x == 10)
		{
			System.out.println("Search by: (1) Title or Id , (2) Genre, (3) Country , (4) Actor , (5) Director. Type the corresponding number.");
			String answer = reader.next();
			while (!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("4") && !answer.equals("5") && !answer.equals("exit"))
			{
				System.out.println("Not acceptable answer.");
				System.out.println("Search by: (1) Title or Id , (2) Genre, (3) Country , (4) Actor , (5) Director. Type the corresponding number.");
				answer = reader.next();
			}
			if(answer.equals("exit"))
			{
				System.out.println("Bye!");
				reader.close();
				System.exit(0);
			}
			System.out.println("Have the informations about the movie in (1) .html file, (2) .markdown file, (3) .txt file or (4) .pdf file. Type the corresponding number.");
			String fileType = reader.next();
			while (!fileType.equals("exit") && !fileType.equals("1") && !fileType.equals("2") && !fileType.equals("3") && !fileType.equals("4"))
			{
				System.out.println("Not acceptable answer.");
				System.out.println("Have the informations about the movie in (1) .html file, (2) .markdown file, (3) .txt file or (4) .pdf file. Type the corresponding number.");
				fileType = reader.next();
			}
			if(fileType.equals("exit"))
			{
				System.out.println("Bye!");
				reader.close();
				System.exit(0);
			}
			System.out.println("Good... now please type the name of the file");
			String fileName = reader.next();
			if(fileName.equals("exit"))
			{
				System.out.println("Bye!");
				reader.close();
				System.exit(0);
			}
			System.out.println("Also, please type the requested info.");
			String input = namer.nextLine();
			if(input.equals("exit"))
			{
				System.out.println("Bye!");
				reader.close();
				System.exit(0);
			}
			if(answer.equals("1"))
			{
				System.out.println("Do you want the info about the tags? Type 'yes or 'no'.");
				String answerTags = reader.next();
				while(!answerTags.equals("exit") && !answerTags.equals("yes") && !answerTags.equals("no"))
				{
					System.out.println("Not acceptable answer!");
					System.out.println("Do you want the info about the tags? Type 'yes or 'no'.");
					answerTags = reader.next();
				}
				if(answerTags.equals("exit"))
				{
					System.out.println("Bye!");
					reader.close();
					System.exit(0);
				}
				else if(a.equals("no") && answerTags.equals("yes"))
				{
					System.out.println("Tags have not been loaded. No info available.");
					System.out.println("Do you want to load the data for tags and ratings? Type 'yes' or 'no'.");
					answerTags = reader.next();
					while(!answerTags.equals("exit") && !answerTags.equals("yes") &&  !answerTags.equals("no"))
					{
						System.out.println("Not acceptable answer!");
						System.out.println("Do you to load the data for tags and ratings? Type 'yes or 'no'.");
						answerTags = reader.next();
					}
					if(answerTags.equals("exit"))
					{
						System.out.println("Bye!");
						reader.close();
						System.exit(0);
					}
					else if(answerTags.equals("yes"))
					{
						System.out.println("Please wait...");
						loader.loadRT(movielibrary);
						a = "yes";
						System.out.println("Info have been loaded.");
					}
					else
					{
						System.out.println("You can't have info for the tags without loading the data.");
					}
				}
				System.out.println("Do you want the info about the ratings? Type 'yes or 'no'.");
				String answerRatings = reader.next();
				while(!answerRatings.equals("exit") && !answerRatings.equals("yes") && !answerRatings.equals("no"))
				{
					System.out.println("Not acceptable answer!");
					System.out.println("Do you want the info about the ratings? Type 'yes or 'no'.");
					answerRatings = reader.next();
				}
				if(answerRatings.equals("exit"))
				{
					System.out.println("Bye!");
					reader.close();
					System.exit(0);
				}
				else if(a.equals("no") && answerRatings.equals("yes"))
				{
					System.out.println("Ratings have not been loaded. No info available.");
					System.out.println("Do you want to load the data for tags and ratings? Type 'yes' or 'no'.");
					answerRatings = reader.next();
					while(!answerRatings.equals("exit") && !answerRatings.equals("yes") && !answerRatings.equals("no"))
					{
						System.out.println("Not acceptable answer!");
						System.out.println("Do you to load the data for tags and ratings? Type 'yes or 'no'.");
						answerTags = reader.next();
					}
					if(answerRatings.equals("exit"))
					{
						System.out.println("Bye!");
						reader.close();
						System.exit(0);
					}
					else if(answerRatings.equals("yes"))
					{
						System.out.println("Please wait...");
						loader.loadRT(movielibrary);
						a = "yes";
						System.out.println("Info have been loaded.");
					}
					else
					{
						System.out.println("You can't have info for the ratings without loading the data.");
					}
				}
				movielibrary.searchMovieByTitleId(fileType, input, fileName, answerTags, answerRatings);
			}
			else if (answer.equals("2"))
			{
				movielibrary.searchByGenre(fileType, input, fileName);
			}
			else if (answer.equals("3"))
			{
				movielibrary.searchByCountry(fileType, input, fileName);
			}
			else if (answer.equals("4"))
			{
				movielibrary.searchByActor(fileType, input, fileName);
			}
			else if (answer.equals("5"))
			{
				movielibrary.searchByDirector(fileType, input, fileName);
			}
		}
	}	
}