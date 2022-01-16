package InstaOpp;

public class ExplorePage extends Page {
	private String[] images;
	private String[] videos;
	private String[] reels;
	
	
	public ExplorePage() {
		super();
	}


	public ExplorePage(String pageName, String[] images, String[] videos, String[] reels) {
		super(pageName);
		this.images = images;
		this.videos = videos;
		this.reels = reels;
	}


	public String[] getImages() {
		return images;
	}


	public void setImages(String[] images) {
		this.images = images;
	}


	public String[] getVideos() {
		return videos;
	}


	public void setVideos(String[] videos) {
		this.videos = videos;
	}


	public String[] getReels() {
		return reels;
	}


	public void setReels(String[] reels) {
		this.reels = reels;
	}

	
	
}
