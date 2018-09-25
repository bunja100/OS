import java.util.Random;

public class Question2 {
	private static int[] myArray;
	
	public Question2(int size) {
		myArray = new int[size];
	}
	
	public  int[] fillArray() {
		Random random = new Random();
		int min = 1;
		int max = 10;
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = random.nextInt(max - min + 1) + min;
		}
		return myArray;
	}
	
	public  void sortArray()
    {
        int n = myArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (myArray[j] > myArray[j+1])
                {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
    }
	
	public  void displayResult() {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(fillArray()[i] + " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		Question2 question2 = new Question2(10);
		question2.sortArray();
		question2.displayResult();
	}
}
