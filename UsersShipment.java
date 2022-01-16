package InstaOpp;

public class UsersShipment {
	private String[] comments;
	private int numberOfLikes;
	private String location;
	private String mention;
	
	
	public UsersShipment() {
		super();
	}


	public UsersShipment(String[] comments, int numberOfLikes, String location, String mention) {
		super();
		this.comments = comments;
		this.numberOfLikes = numberOfLikes;
		this.location = location;
		this.mention = mention;
	}


	public String[] getComments() {
		return comments;
	}


	public void setComments(String[] comments) {
		this.comments = comments;
	}


	public int getNumberOfLikes() {
		return numberOfLikes;
	}


	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMention() {
		return mention;
	}


	public void setMention(String mention) {
		this.mention = mention;
	}
	
	

}
