package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister();
		sister.sister(1, 2, "G", 4);
		sister.sister(2, 3, "U", 2, 5);
		sister.sister(1, 3, 4, "L", 2, 9);
		sister.sister(1, 3, 12, "LA", 11, 23);
		Sister.sister(1, 2, 3, 4);

		System.out.println("\n------NieceClass-----");

		Niece niece = new Niece();
		niece.sister();
		niece.sister(4, 5, "K", 2, 4);
		niece.sister(6, 7, 8, "AL", 3, 5);
		niece.sister(4, 6, 7, "U", 5, 8);

	}

}
