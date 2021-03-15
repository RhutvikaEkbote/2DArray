
public class Demo {

	public void one() {
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];

		for (int firstd = 0, i = 1; firstd < arr.length; firstd++) {

			for (int secondd = 0; secondd < arr[firstd].length; secondd++) {

				arr[firstd][secondd] = i++;
			}
		}
		for (int firstd = 0; firstd < arr.length; firstd++) {

			for (int secondd = 0; secondd < arr[firstd].length; secondd++) {

				System.out.println(arr[firstd][secondd]);

			}
		}
	}

	public void two() {
		int arr[][] = new int[3][5];

		for (int firstd = 0, i = 2; firstd < arr.length; firstd++) {
			for (int secondd = 0, j = 1; secondd < arr[firstd].length; secondd++) {
				arr[firstd][secondd] = i * j++;

			}
		}

		for (int firstd = 0; firstd < arr.length; firstd++) {

			for (int secondd = 0; secondd < arr[firstd].length; secondd++) {

				System.out.println(arr[firstd][secondd]);

			}
		}
	}

	public void three() {
		char arr[][] = new char[4][];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new char[i + 1];

		}

		for (int firstd = 0; firstd < arr.length; firstd++) {

			for (int secondd = 0; secondd < arr[firstd].length; secondd++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void four() {
		int arr[][] = new int[4][4];
		for (int firstd = 0, i = 1; firstd < arr.length; firstd++) {
			for (int secondd = 0; secondd < arr[firstd].length; secondd++) {

				System.out.print(arr[firstd][secondd] = i++);
			}
			System.out.println();

		}

	}

	public void five() {
		int arr[] = { 1, 3, 5, 9, 2, 5, 7, 8 };
		int n = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++, n--) {
			arr[i] = arr[i] + arr[n];
			arr[n] = arr[i] - arr[n];
			arr[i] = arr[i] - arr[n];

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void six() {
		int arr[] = { 1, 6, 3, 4, 8, 7, 2 };		
		for (int i = 0; i < arr.length; i++) {
			for(int j=i+1;j>arr.length;j++)

			if (arr[i] > arr[j]) {
				
				System.out.println(arr[i]);
			}

		}

	}

}
