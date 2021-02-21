package report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import dataLoader.FullDataLoader;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import movie.Movie;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;


public class PdfReport implements IReport
{
	private String name;
	private Movie movie1;
	private String answer;
	
	public PdfReport(String name,String answer)
	{
		this.name = name;
		this.answer = answer;
	}

	@Override
	public void report(Movie movie1) 
	{
		String genres = "";
		for(int x = 0; x < movie1.getGenre().size(); x++)
		{
			if(x == 0)
			{
				genres += " " + movie1.getGenre().get(x).getGenre();
			}
			if(x > 0)
			{
				genres +="," + movie1.getGenre().get(x).getGenre();
			}
		}
		String actors = "";
		for(int x = 0; x < movie1.getActor().size(); x++)
		{
			if(x == 0)
			{
				actors += " " + movie1.getActor().get(x).getActorName();
			}
			else
			{
				actors += "," + movie1.getActor().get(x).getActorName();
			}
		}
		String locations = "";
		if(movie1.getLocation() != null)
		{
			for(int x = 0; x < movie1.getLocation().size(); x++)
			{
				if(x == 0)
				{ 
					locations += " " + movie1.getLocation().get(x).getLocation1();
					locations += " " + movie1.getLocation().get(x).getLocation2();
					locations += " " + movie1.getLocation().get(x).getLocation3();
					locations += " " + movie1.getLocation().get(x).getLocation4();
				}
				else
				{
					locations += "," + movie1.getLocation().get(x).getLocation1();
					locations += "," + movie1.getLocation().get(x).getLocation2();
					locations += "," + movie1.getLocation().get(x).getLocation3();
					locations += "," + movie1.getLocation().get(x).getLocation4();
				}
			}
		}
		else
		{
			locations += "Locations are not available for this movie.";
		}
		try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(name + ".pdf"));
            document.open();
            Paragraph preface = new Paragraph();
            preface.add("");
            document.add(preface);
            // Lets write a big header
            document.add(new Paragraph(movie1.getMovieDetails().getTitle()  + "(" + movie1.getMovieDetails().getSpanishTitle() + "-" + movie1.getMovieDetails().getYear() + ")", new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD)));
            Image img = Image.getInstance(movie1.getMovieDetails().getImdbPictureURL());
            document.add(img);
            document.add(preface);
            Paragraph g = new Paragraph();
            g.add("Genres:" + genres);
            document.add(g);
            g.add("");
            Paragraph a = new Paragraph();
            a.add("Actors:" + actors);
            document.add(a);
            a.add("");
            Paragraph d = new Paragraph();
            d.add("Director:" + movie1.getDirector().getDirectorName());
            document.add(d);
            d.add("");
            Paragraph c = new Paragraph();
            c.add("Country:" + movie1.getCountry().getCountry());
            c.add("");
            document.add(c);
            Paragraph l = new Paragraph();
            l.add("Filming Locations:" + locations);
            l.add("");
            document.add(l);
            document.add(new Paragraph("Movie Details:"));
            Paragraph acra = new Paragraph();
            acra.add("All critics ratings:" + movie1.getMovieDetails().getRtAllCriticsRating());
            acra.add("");
            document.add(acra);
            Paragraph acre = new Paragraph();
            acre.add("All critics reviews:" + movie1.getMovieDetails().getRtAllCriticsNumReviews());
            acre.add("");
            document.add(acre);
            Paragraph acf = new Paragraph();
            acf.add("All critics fresh:" + movie1.getMovieDetails().getRtAllCriticsNumFresh());
            acf.add("");
            document.add(acf);
            Paragraph acro = new Paragraph();
            acro.add("All critics rotten:" + movie1.getMovieDetails().getRtAllCriticsNumRotten());
            acro.add("");
            document.add(acro);
            Paragraph acs = new Paragraph();
            acs.add("All critics score:" + movie1.getMovieDetails().getRtAllCriticsScore());
            acs.add("");
            document.add(acs);
            Paragraph tcra = new Paragraph();
            tcra.add("Top critics ratings:" + movie1.getMovieDetails().getRtTopCriticsRating());
            tcra.add("");
            document.add(tcra);
            Paragraph tcre = new Paragraph();
            tcre.add("Top critics reviews:" + movie1.getMovieDetails().getRtTopCriticsNumReviews());
            tcre.add("");
            document.add(tcre);
            Paragraph tcf = new Paragraph();
            tcf.add("Top critics fresh:" + movie1.getMovieDetails().getRtTopCriticsNumFresh());
            tcf.add("");
            document.add(tcf);
            Paragraph tcro = new Paragraph();
            tcro.add("Top critics rotten:" + movie1.getMovieDetails().getRtTopCriticsNumRotten());
            tcro.add("");
            document.add(tcro);
            Paragraph tcs = new Paragraph();
            tcs.add("Top critics score:" + movie1.getMovieDetails().getRtTopCriticsScore());
            tcs.add("");
            document.add(tcs);
            Paragraph audr = new Paragraph();
            audr.add("Audience ratings:" + movie1.getMovieDetails().getRtAudienceRating());
            audr.add("");
            document.add(audr);
            Paragraph numaudr = new Paragraph();
            numaudr.add("Number of audience ratings:" + movie1.getMovieDetails().getRtAudienceNumRatings());
            numaudr.add("");
            document.add(numaudr);
            Paragraph auds = new Paragraph();
            auds.add("Audience score:" + movie1.getMovieDetails().getRtAudienceScore());
            auds.add("");
            document.add(auds);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	@Override
	public void reportTags(Movie movie, String name) 
	{
		String tags = "";
		if(movie.getTags() != null)
		{
			for(int x = 0; x < movie.getTags().size(); x++)
			{
				if(x == 0)
				{
					tags += " " + movie.getTags().get(x).getValue();
				}
				if(x > 0)
				{
					tags += "," + " " + movie.getTags().get(x).getValue();
				}
			}
		}
		else
		{
			tags += "Tags are not available for this movie.";
		}
		Document document = new Document();
        try 
        {
			PdfWriter.getInstance(document, new FileOutputStream(name + ".pdf"));
			document.open();
	        Paragraph t = new Paragraph();
	        t.add("TagLines:" + tags);
	        document.add(t);
	        document.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}

	@Override
	public void reportRatings(Movie movie, String name) {
		String ratings = "";
		if(movie.getRatings() != null)
		{
			for(int x = 0; x < movie.getRatings().size(); x++)
			{
				if(x == 0)
				{
					ratings += " " + movie.getRatings().get(x).getRating();
				}
				if(x > 0)
				{
					ratings += "," + " " + movie.getRatings().get(x).getRating();
				}
			}
		}
		else
		{
			ratings += "Ratings are not available for this movie.";
		}
		Document document = new Document();
        try 
        {
			PdfWriter.getInstance(document, new FileOutputStream(name + ".pdf"));
			document.open();
	        Paragraph t = new Paragraph();
	        t.add("RatingLines:" + ratings);
	        document.add(t);
	        document.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
		
	}

	@Override
	public void generalReport(ArrayList<Movie> movies,HashMap<String,Integer> pos,ArrayList<String> info, String name, String answer) 
	{
		String moviedetails = "";
		for(int j = 0; j < info.size(); j ++)
		{
			int position = pos.get(info.get(j));
			moviedetails += movies.get(position).getMovieDetails().getTitle();
			moviedetails += ", "  + movies.get(position).getMovieDetails().getYear();
			if(movies.get(position).getDirector() != null)
			{
				moviedetails += ", "  + movies.get(position).getDirector().getDirectorName();
			}
			else
			{
				moviedetails += "-";
			}
			moviedetails += '\n';
		}
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(name + ".pdf"));
			document.open();
			Paragraph p1 = new Paragraph();
			p1.add("Number of movies found:" + " " + info.size());
			document.add(p1);
			Paragraph p2 = new Paragraph();
			p2.add(answer + "Movies.");
			document.add(p2);
			Paragraph p3 = new Paragraph();
			p3.add(moviedetails);
			document.add(p3);
			document.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Problem opening files.");
		}		
	}
}
