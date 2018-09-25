import java.util.Arrays;
import java.util.Random;

public class Question2 {
	private static int[] myArray;

	public Question2(int size) {
		myArray = new int[size];
	}

	public void fillArrayAndSort() {
		Random random = new Random();
		int min = 1;
		int max = 13;

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = random.nextInt(max - min + 1) + min;
		}
		for (int i = 0; i < myArray.length - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(myArray));

	}

	public static void main(String[] args) {
		Question2 question2 = new Question2(10);
		question2.fillArrayAndSort();
	}
}
