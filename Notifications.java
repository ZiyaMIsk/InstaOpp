package InstaOpp;

public class Notifications {
	private String userName;
	private String profileImage;
	private String notificationSentence;
	private int time;
	
	public Notifications() {
		super();
	}

	public Notifications(String userName, String profileImage, String notificationSentence, int time) {
		super();
		this.userName = userName;
		this.profileImage = profileImage;
		this.notificationSentence = notificationSentence;
		this.time = time;
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

	public String getNotificationSentence() {
		return notificationSentence;
	}

	public void setNotificationSentence(String notificationSentence) {
		this.notificationSentence = notificationSentence;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
}
