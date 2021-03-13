// Java implementation of the approach
import java.util.*;
class CountSubstring 
{ 
	
// Function to return the number 
// of sub-strings that do not contain 
// the given character c 
static int countSubstrings(String s, char c) 
{ 

	// Length of the string 
	int n = s.length(); 

	int cnt = 0; 
	int sum = 0; 

	// Traverse in the string 
	for (int i = 0; i < n; i++) 
	{ 

		// If current character is different 
		// from the given character 
		if (s.charAt(i) != c) 
			cnt++; 
		else
		{ 

			// Update the number of sub-strings 
			sum += (cnt * (cnt + 1)) / 2; 

			// Reset count to 0 
			cnt = 0; 
		} 
	} 

	// For the characters appearing 
	// after the last occurrence of c 
	sum += (cnt * (cnt + 1)) / 2; 
	return sum; 
} 

// Driver code 
public static void main(String[] args) 
{
  Scanner s = new Scanner(System.in);
	String str = s.next();
	char c = s.next().charAt(0);
	System.out.println(countSubstrings(str, c)); 
} 
} 

// This code is contributed by Code_Mech. 
