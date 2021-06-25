package latihan01;

public class TestArray02 {

	public static void main(String[] args) {

		// Matrix Size 9 x 9
		// i (Column = Kolom)
		// j (Rows = Baris)
		int n = 9;
		int angkaGanjil = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(angkaGanjil + "\t");
				}
			}
		}
	}
}
