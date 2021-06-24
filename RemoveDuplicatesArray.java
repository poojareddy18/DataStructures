// Remove duplicates from array (HashSet)

import java.util.HashSet;
public class removeDuplicatesArray {
	
	 public static void removeDuplicate(int[] arr, int n)
	{
		HashSet hs = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
			if(hs.contains(arr[i]))
			{
				
				//System.out.println(arr[i] + " ");
				System.out.println("checking duplicates");
				 //hs.arr[i];
			} 
			else
			{
				hs.add(arr[i]);
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
