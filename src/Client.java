
public class Client {
	public static void main(String[] ages) {
		iUser iuser = new EmployeeUser();
		UserManager user = new UserManager(iuser);
		System.out.println(" "+user.getName());
	}
}