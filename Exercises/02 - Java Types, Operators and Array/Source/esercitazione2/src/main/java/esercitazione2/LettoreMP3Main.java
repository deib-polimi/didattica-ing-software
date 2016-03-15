package esercitazione2;

public class LettoreMP3Main {
	public static void main(String[] args) {
		LettoreMP3 c1 = new LettoreMP3(10);
		LettoreMP3 c2 = new LettoreMP3(20);
		System.out.println(c1);
		System.out.println(c2);
		c1.ascolta();
	}
}
