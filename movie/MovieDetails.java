package movie;

public class MovieDetails 
{
	private String id;
	private String title;
	private String imdbId;
	private String spanishTitle;
	private String imdbPictureURL;
	private String year;
	private String rtId;
	private String rtAllCriticsRating;
	private String rtAllCriticsNumReviews;
	private String rtAllCriticsNumFresh;
	private String rtAllCriticsNumRotten;
	private String rtAllCriticsScore;
	private String rtTopCriticsRating;
	private String rtTopCriticsNumReviews;
	private String rtTopCriticsNumFresh;
	private String rtTopCriticsNumRotten;	
	private String rtTopCriticsScore;
	private String rtAudienceRating;
	private String rtAudienceNumRatings;
	private String rtAudienceScore;	
	private String rtPictureURL;
	
	public MovieDetails()
	{
		this.id = null;
		this.title = null;
		this.imdbId = null;
		this.spanishTitle = null;
		this.imdbPictureURL = null;
		this.year = null;
		this.rtId = null;
		this.rtAllCriticsRating = null;
		this.rtAllCriticsNumReviews = null;
		this.rtAllCriticsNumFresh = null;
		this.rtAllCriticsNumRotten = null;
		this.rtAllCriticsScore = null;
		this.rtTopCriticsRating	= null;
		this.rtTopCriticsNumReviews = null;
		this.rtTopCriticsNumFresh = null;
		this.rtTopCriticsNumRotten = null;
		this.rtTopCriticsScore = null;
		this.rtAudienceRating = null;
		this.rtAudienceNumRatings = null;
		this.rtAudienceScore = null;
		this.rtPictureURL = null;
	}
	
	public MovieDetails(String id, String title, String imdbId, String spanishTitle, String imdbPictureURL, String year, String rtId, String rtAllCriticsRating, String rtAllCriticsNumReviews, String rtAllCriticsNumFresh, String rtAllCriticsNumRotten, String rtAllCriticsScore, String rtTopCriticsRating, String rtTopCriticsNumReviews, String rtTopCriticsNumFresh, String rtTopCriticsNumRotten, String rtTopCriticsScore, String rtAudienceRating, String rtAudienceNumRatings, String rtAudienceScore, String rtPictureURL)
	{
		this.id = id;
		this.title = title;
		this.imdbId = imdbId;
		this.spanishTitle = spanishTitle;
		this.imdbPictureURL = imdbPictureURL;
		this.year = year;
		this.rtId = rtId;
		this.rtAllCriticsRating = rtAllCriticsRating;
		this.rtAllCriticsNumReviews = rtAllCriticsNumReviews;
		this.rtAllCriticsNumFresh = rtAllCriticsNumFresh;
		this.rtAllCriticsNumRotten = rtAllCriticsNumRotten;
		this.rtAllCriticsScore = rtAllCriticsScore;
		this.rtTopCriticsRating	= rtTopCriticsRating;
		this.rtTopCriticsNumReviews = rtTopCriticsNumReviews;
		this.rtTopCriticsNumFresh = rtTopCriticsNumFresh;
		this.rtTopCriticsNumRotten = rtTopCriticsNumRotten;
		this.rtTopCriticsScore = rtTopCriticsScore;
		this.rtAudienceRating = rtAudienceRating;
		this.rtAudienceNumRatings = rtAudienceNumRatings;
		this.rtAudienceScore = rtAudienceScore;
		this.rtPictureURL = rtPictureURL;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getImdbId()
	{
		return imdbId;
	}
	
	public String getSpanishTitle()
	{
		return spanishTitle;
	}
	
	public String getImdbPictureURL()
	{
		return imdbPictureURL;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public String getRtId()
	{
		return rtId;
	}
	public String getRtAllCriticsRating()
	{
		return rtAllCriticsRating;
	}
	
	public String getRtAllCriticsNumReviews()
	{
		return rtAllCriticsNumReviews;
	}
	
	public String getRtAllCriticsNumFresh()
	{
		return rtAllCriticsNumFresh;
	}
	
	public String getRtAllCriticsNumRotten()
	{
		return rtAllCriticsNumRotten;
	}
	
	public String getRtAllCriticsScore()
	{
		return rtAllCriticsScore;
	}
	
	public String getRtTopCriticsRating()
	{
		return rtTopCriticsRating;
	}
	
	public String getRtTopCriticsNumReviews()
	{
		return rtTopCriticsNumReviews;
	}
	
	public String getRtTopCriticsNumFresh()
	{
		return rtTopCriticsNumFresh;
	}
	
	public String getRtTopCriticsNumRotten()
	{
	return rtTopCriticsNumRotten;
	}
	
	public String getRtTopCriticsScore()
	{
		return rtTopCriticsScore;
	}
	
	public String getRtAudienceRating()
	{
		return rtAudienceRating;
	}
	
	public String getRtAudienceNumRatings()
	{
		return rtAudienceNumRatings;
	}
	
	public String getRtAudienceScore()
	{
		return rtAudienceScore;
	}
	
	public String getRtPictureURL()
	{
		return rtPictureURL;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setImdbId(String imdbId)
	{
		this.imdbId = imdbId;
	}
	public void setSpanishTitle(String spanishTitle)
	{
		this.spanishTitle = spanishTitle;
	}
	public void setImdbPictureURL(String imdbPictureURL)
	{
		this.imdbPictureURL = imdbPictureURL;
	}
	public void setYear(String year)
	{
		this.year = year;
	}
	public void setRtId(String rtId)
	{
		this.rtId = rtId;
	}
	public void setRtAllCriticsRating(String rtAllCriticsRating)
	{
		this.rtAllCriticsRating = rtAllCriticsRating;
	}
	public void setRtAllCriticsNumReviews(String rtAllCriticsNumReviews)
	{
		this.rtAllCriticsNumReviews = rtAllCriticsNumReviews;
	}
	public void setRtAllCriticsNumFresh(String rtAllCriticsNumFresh)
	{
		this.rtAllCriticsNumFresh = rtAllCriticsNumFresh;
	}
	public void setRtAllCriticsNumRotten(String rtAllCriticsNumRotten)
	{
		this.rtAllCriticsNumRotten = rtAllCriticsNumRotten;
	}
	public void setRtAllCriticsScore(String rtAllCriticsScore)
	{
		this.rtAllCriticsScore = rtAllCriticsScore;
	}
	public void setRtTopCriticsRating(String rtTopCriticsRating)
	{
		this.rtTopCriticsRating = rtTopCriticsRating;
	}
	public void setRtTopCriticsNumReviews(String rtTopCriticsNumReviews)
	{
		this.rtTopCriticsNumReviews = rtTopCriticsNumReviews;
	}
	public void setRtTopCriticsNumFresh(String rtTopCriticsNumFresh)
	{
		this.rtTopCriticsNumFresh = rtTopCriticsNumFresh;
	}
	public void setRtTopCriticsNumRotten(String rtTopCriticsNumRotten)
	{
		this.rtTopCriticsNumRotten = rtTopCriticsNumRotten;
	}
	public void setRtTopCriticsScore(String rtTopCriticsScore)
	{
		this.rtTopCriticsScore = rtTopCriticsScore;
	}
	public void setRtAudienceRating(String rtAudienceRating)
	{
		this.rtAudienceRating = rtAudienceRating;
	}
	public void setRtAudienceNumRatings(String rtAudienceNumRatings)
	{
		this.rtAudienceNumRatings = rtAudienceNumRatings;
	}
	public void setRtAudienceScore(String rtAudienceScore)
	{
		this.rtAudienceScore = rtAudienceScore;
	}
	public void setRtPictureURL(String rtPictureURL)
	{
		this.rtPictureURL = rtPictureURL;
	}
	

	
	
	
}
