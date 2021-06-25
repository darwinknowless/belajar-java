package latihan01;

public class TestArray01 {

	public static void main(String[] args) {

		// Matrix Size 9 x 9
		// i (Column = Kolom)
		// j (Rows = Baris)
		int n = 9;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
