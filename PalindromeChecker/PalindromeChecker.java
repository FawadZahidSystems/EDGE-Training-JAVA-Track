package PalindromeChecker;

public class PalindromeChecker
{
	public static boolean isPalindrome(StringBuffer str)
	{
		// Checks if the string is same as its reverse
		return str.toString().equals(str.reverse().toString());
	}
}
