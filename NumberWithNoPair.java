// identify number without a pair

public class Solution {
     public static void main(String []args){
    
        int[] arr = new int[] {1,2,3,4,5,1,2,3,4};
        int i,j;
        int x=0; 
        for( i =0; i<arr.length; i++)
        {
            x=x ^ arr[i];
        }
        System.out.println(x);
        /*for( i = 0; i<arr.length-1; i++)
        {
            for( j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                  break;
                  
                }
            }
            if(j==arr.length)
            {
                System.out.println(arr[i]); 
                break;
            }
            
        } */
        
    }
}
