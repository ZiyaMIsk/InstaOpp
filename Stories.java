package InstaOpp;

public class Stories {
	private String userName;
	private String profileImage;
	private int time;
	private String location;
	private String mention;

	
	public Stories() {
		super();
	}


	public Stories(String userName, String profileImage, int time, String location, String mention) {
		super();
		this.userName = userName;
		this.profileImage = profileImage;
		this.time = time;
		this.location = location;
		this.mention = mention;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
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
