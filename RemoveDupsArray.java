//Remove duplicates from Arrays (without hashset)

import java.util.HashSet;
public class removeDupsArray {
	
	 public static void removeDuplicate(int[] arr, int n)
	{
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("There is a duplicate");
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int [] arr = {4, 5, 4, 9, 3, 5, 7};
		int n = arr.length;
		removeDuplicate(arr, n);

	}

}
