//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     
	 
	// Your code here
		long floorSqrt(long x)

  {

 // Your code here

 long ans=0;
 for(int i=1;i*i<=x;i++){
     ans=i;
 }
  
 return ans;

  }

}
		
	 