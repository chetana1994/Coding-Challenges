public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    
	    
	    
	    int i=a.size()-2;
	    int j=a.size()-1;
	    //Finding the pointer for the first smallest element than the previous one
	    while(i>=0 && a.get(i+1)<=a.get(i) )
	    
	    {
	        i--;
	    }
	    //Finding the pointer for first bigger element than the element at i
	    if(i>=0)
	    {
	        while(j>=0 && a.get(j)<=a.get(i))
	        {
	            j--;
	        }
	        
              swap(a,i,j); //swapping them
	    }
	   ascending(a,i+1);   //Rearranging the remaining part of the array in ascending order
	   System.out.println(a);
	    
	
	}
	
	void swap(ArrayList<Integer> a,int i,int j)
	{
	    int temp=a.get(i);
	    a.get(i)=a.get(j);
	    a.get(j)=temp;
	}
	
	void ascending(ArrayList<Integer> a,int i)
	{
	    int j=a.size()-1;
	    while(i<j)
	    {
	        swap(a,i,j);
	        i++;
	        j--;
	    }
	}
	
	
}
