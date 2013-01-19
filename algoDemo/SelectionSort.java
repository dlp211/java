class SelectionSort {

	public static void main(String[] args)
	{
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		sort(arr);
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void sort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; ++i) {
			int index = i;
			for(int j = i + 1; j < arr.length; ++j)
				if(arr[j] < arr[index])
					index = j;
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
}