package InstaOpp;

public class ProfilePage extends Page {
	private int shipment;
	private int follower;
	private int following;
	private String[] shipmentImages;
	private String userName;
	private String profileImage;
	private String description;
	
	public ProfilePage() {
		super();
	}

	public ProfilePage(String pageName, int shipment, int follower, int following, String[] shipmentImages, String userName,
			String profileImage, String description) {
		super(pageName);
		this.shipment = shipment;
		this.follower = follower;
		this.following = following;
		this.shipmentImages = shipmentImages;
		this.userName = userName;
		this.profileImage = profileImage;
		this.description = description;
	}

	public int getShipment() {
		return shipment;
	}

	public void setShipment(int shipment) {
		this.shipment = shipment;
	}

	public int getFollower() {
		return follower;
	}

	public void setFollower(int follower) {
		this.follower = follower;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public String[] getShipmentImages() {
		return shipmentImages;
	}

	public void setShipmentImages(String[] shipmentImages) {
		this.shipmentImages = shipmentImages;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
