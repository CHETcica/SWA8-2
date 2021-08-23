
public class UserManager {
	private iUser user;
	public UserManager(iUser user) {
		this.user = user;
	}
	public String getName() {
		return this.user.getName();
	}
}
