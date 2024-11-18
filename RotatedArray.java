
public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 2, 4, 6, 5, 6, 8 };

		mycode(a);

	}

	private static void mycode(int[] a) {

		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];

		}

		a[a.length - 1] = temp;
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
