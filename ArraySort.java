package java8;

public class ArraySort {
	
	public static void main(String[] args) {

		try {

			int[] arr = new int[] {0,1,2,1,2,0,2,0,1};  

			for (int i = 0; i < arr.length; i++)   
			{  
				for (int j = i + 1; j < arr.length; j++)   
				{  
					int tmp = 0;  
					if (arr[i] > arr[j])   
					{  
						tmp = arr[i];  
						arr[i] = arr[j];  
						arr[j] = tmp;  
					}  
				}  

				System.out.print(arr[i]);  
			}  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
