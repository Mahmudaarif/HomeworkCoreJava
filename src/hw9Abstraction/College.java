package hw9Abstraction;
/*
 * Create a project --- "GithubDemo". Create a package name -- "githubDemo". Create a class --- "HelloGitHub". Inside the class, type main method and under it print "I know how to create a separate remote repository in Github and can push my project GithubDemo, without help of anyone". Organize code, avoid white space and push the project to Github. Paste the link below without the help of anyone else
 */
public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {

	}

	public static void studyRoom() {

	}

}
