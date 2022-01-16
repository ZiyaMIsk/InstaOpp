package InstaOpp;

public class HomePage extends Page {
	private Direct direct; 
	private Create create;
	private Notifications notifications; 
	private UsersShipment usersShipment;
	private RecommendedsPage recommendedspage;
	private ProfilePage profilepage;
	
	public HomePage() {
		super();
	}
	
	
	
	public HomePage(String pageName, Direct direct, Create create, Notifications notifications, UsersShipment usersShipment,
			RecommendedsPage recommendedspage, ProfilePage profilepage) {
		super(pageName);
		this.direct = direct;
		this.create = create;
		this.notifications = notifications;
		this.usersShipment = usersShipment;
		this.recommendedspage = recommendedspage;
		this.profilepage = profilepage;
	}



	public Direct getDirect() {
		return direct;
	}



	public void setDirect(Direct direct) {
		this.direct = direct;
	}



	public Create getCreate() {
		return create;
	}



	public void setCreate(Create create) {
		this.create = create;
	}



	public Notifications getNotifications() {
		return notifications;
	}



	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}



	public UsersShipment getUsersShipment() {
		return usersShipment;
	}



	public void setUsersShipment(UsersShipment usersShipment) {
		this.usersShipment = usersShipment;
	}



	public RecommendedsPage getRecommendedspage() {
		return recommendedspage;
	}



	public void setRecommendedspage(RecommendedsPage recommendedspage) {
		this.recommendedspage = recommendedspage;
	}



	public ProfilePage getProfilepage() {
		return profilepage;
	}



	public void setProfilepage(ProfilePage profilepage) {
		this.profilepage = profilepage;
	}




}
