package movieLibrary;

import java.util.ArrayList;
import java.util.HashMap;

import movie.Movie;
import report.HtmlReport;
import report.MarkDownReport;
import report.PdfReport;
import report.TxtReport;

public class MovieLibrary 
{
	private ArrayList<Movie> movieLibrary;
	private HashMap<String,String> idbytitle = new HashMap<String,String>();
	private HashMap<String,Integer> positionid = new HashMap<String,Integer>();
 
	public MovieLibrary()
	{
		this.movieLibrary = new ArrayList<Movie>();
	}
	
	public ArrayList<Movie> getMovieLibrary()
	{
		return movieLibrary;
	}
	
	public void setMovieLibrary(ArrayList<Movie> movieLibrary)
	{
		this.movieLibrary = movieLibrary;
	}
	
	public void setIdByTitle(HashMap<String,String> idbytitle)
	{
		this.idbytitle = idbytitle;
	}
	
	public void setPositionId(HashMap<String,Integer> positionid)
	{
		this.positionid = positionid;
	}
	
	public HashMap<String,String> getIdbyTitle()
	{
		return idbytitle;
	}
	
	public HashMap<String,Integer> getPositionId()
	{
		return positionid;
	}
	
	public void searchMovieByTitleId (String fileType,String titleorid,String fileName, String answerTags, String answerRatings)
	{
		if(fileType.equals("1"))
		{
			if(idbytitle.containsKey(titleorid))
			{
				HtmlReport report = new HtmlReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(idbytitle.get(titleorid))));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else if(idbytitle.containsValue(titleorid))
			{
				HtmlReport report = new HtmlReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(titleorid)));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else
			{
				System.out.println("Movie not found.");
			}
		}
		if (fileType.equals("2"))
		{
			if(idbytitle.containsKey(titleorid))
			{
				MarkDownReport report = new MarkDownReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(idbytitle.get(titleorid))));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else if(idbytitle.containsValue(titleorid))
			{
				MarkDownReport report = new MarkDownReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(titleorid)));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else
			{
				System.out.println("Movie not found.");
			}
		}
		if (fileType.equals("3"))
		{
			if(idbytitle.containsKey(titleorid))
			{
				TxtReport report = new TxtReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(idbytitle.get(titleorid))));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else if(idbytitle.containsValue(titleorid))
			{
				TxtReport report = new TxtReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(titleorid)));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else
			{
				System.out.println("Movie not found.");
			}
		}
		if (fileType.equals("4"))
		{
			if(idbytitle.containsKey(titleorid))
			{
				PdfReport report = new PdfReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(idbytitle.get(titleorid))));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(idbytitle.get(titleorid))), fileName);
				}
				System.out.println("Your report is ready!");
			}
			else if(idbytitle.containsValue(titleorid))
			{
				PdfReport report = new PdfReport(fileName, fileType);
				report.report(movieLibrary.get(positionid.get(titleorid)));
				if(answerTags.equals("yes"))
				{
					report.reportTags(movieLibrary.get(positionid.get(titleorid)), fileName);
				}
				if(answerRatings.equals("yes"))
				{
					report.reportRatings(movieLibrary.get(positionid.get(titleorid)), fileName);
				}		
				System.out.println("Your report is ready!");
				
			}
			else
			{
				System.out.println("Movie not found.");
			}
		}
	}
	
	public ArrayList<String> getIdByGenre(String genre)
	{
		ArrayList<String> idbygenre = new ArrayList<String>();
		for(int i = 0; i < movieLibrary.size(); i++)
		{
			for(int j = 0; j < movieLibrary.get(i).getGenre().size(); j++)
			{
				if(genre.equals(movieLibrary.get(i).getGenre().get(j).getGenre()))
				{
					idbygenre.add(movieLibrary.get(i).getGenre().get(j).getMovieId());
				}
			}
		}
		return idbygenre;
	}
	
	public void searchByGenre (String fileType,String genre,String fileName)
	{
		if(fileType.equals("1"))
		{
			HtmlReport report = new HtmlReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByGenre(genre), fileName, genre);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("2"))
		{
			MarkDownReport report = new MarkDownReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByGenre(genre), fileName,genre);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("3"))
		{
			TxtReport report = new TxtReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByGenre(genre), fileName,genre);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("4"))
		{
			PdfReport report = new PdfReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByGenre(genre), fileName,genre);
			System.out.println("Your report is ready!");
		}
		else
		{
			System.out.println("Genre not found.");
		}
	}

	public ArrayList<String> getIdByCountry(String country)
	{
		ArrayList<String> idbycountry = new ArrayList<String>();
		for(int i = 0; i < movieLibrary.size(); i++)
		{
			if(country.equals(movieLibrary.get(i).getCountry().getCountry()) && movieLibrary.get(i).getCountry().getCountry() != null)
			{
				idbycountry.add(movieLibrary.get(i).getCountry().getMovieId());
			}
		}
		return idbycountry;
	}
	
	public void searchByCountry (String fileType,String country,String fileName)
	{
		if(fileType.equals("1"))
		{
			HtmlReport report = new HtmlReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByCountry(country), fileName,country);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("2"))
		{
			MarkDownReport report = new MarkDownReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByCountry(country), fileName,country);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("3"))
		{
			TxtReport report = new TxtReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByCountry(country), fileName,country);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("4"))
		{
			PdfReport report = new PdfReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByCountry(country), fileName,country);
			System.out.println("Your report is ready!");
		}
		else
		{
			System.out.println("Country not found.");
		}
	}
	
	public ArrayList<String> getIdByActor(String actor)
	{
		ArrayList<String> idbyactor = new ArrayList<String>();
		for(int i = 0; i < movieLibrary.size(); i++)
		{
			for(int j = 0; j < movieLibrary.get(i).getActor().size(); j++)
			{
				if(actor.equals(movieLibrary.get(i).getActor().get(j).getActorName()))
				{
					idbyactor.add(movieLibrary.get(i).getActor().get(j).getMovieId());
				}
			}
		}
		return idbyactor;
	}
	
	public void searchByActor (String fileType,String actor,String fileName)
	{
		if(fileType.equals("1"))
		{
			HtmlReport report = new HtmlReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByActor(actor), fileName,actor);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("2"))
		{
			MarkDownReport report = new MarkDownReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByActor(actor), fileName,actor);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("3"))
		{
			TxtReport report = new TxtReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByActor(actor), fileName,actor);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("4"))
		{
			PdfReport report = new PdfReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdByActor(actor), fileName,actor);
			System.out.println("Your report is ready!");
		}
		else
		{
			System.out.println("Actor not found");
		}
	}
	
	public ArrayList<String> getIdDirector(String director)
	{
		ArrayList<String> idbydirector = new ArrayList<String>();
		for(int i = 0; i < movieLibrary.size(); i++)
		{
			if(director.equals(movieLibrary.get(i).getDirector().getDirectorName()))
			{
				idbydirector.add(movieLibrary.get(i).getDirector().getMovieId());
			}
		}
		return idbydirector;
	}
	
	public void searchByDirector(String fileType,String director,String fileName)
	{
		if(fileType.equals("1"))
		{
			HtmlReport report = new HtmlReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdDirector(director), fileName,director);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("2"))
		{
			MarkDownReport report = new MarkDownReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdDirector(director), fileName,director);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("3"))
		{
			TxtReport report = new TxtReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdDirector(director), fileName,director);
			System.out.println("Your report is ready!");
		}
		else if (fileType.equals("4"))
		{
			PdfReport report = new PdfReport(fileName, fileType);
			report.generalReport(movieLibrary,positionid,getIdDirector(director), fileName,director);
			System.out.println("Your report is ready!");
		}
		else 
		{
			System.out.println("Director not found.");
		}
	}
}
