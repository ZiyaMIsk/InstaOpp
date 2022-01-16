package InstaOpp;

public class RecommendedsPage extends Page {
	private String[] userName;
	private String[] profileImage;
	private String description;
	private String mutualFollowers;
	
	
	public RecommendedsPage() {
		super();
	}


	public RecommendedsPage(String pageName, String[] userName, String[] profileImage, String description, String mutualFollowers) {
		super(pageName);
		this.userName = userName;
		this.profileImage = profileImage;
		this.description = description;
		this.mutualFollowers = mutualFollowers;
	}


	public String[] getUserName() {
		return userName;
	}


	public void setUserName(String[] userName) {
		this.userName = userName;
	}


	public String[] getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String[] profileImage) {
		this.profileImage = profileImage;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMutualFollowers() {
		return mutualFollowers;
	}


	public void setMutualFollowers(String mutualFollowers) {
		this.mutualFollowers = mutualFollowers;
	}
	
	
	

}
