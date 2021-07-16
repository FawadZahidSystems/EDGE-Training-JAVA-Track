package StringCompare;

/*
 * 
 * Constraints : 
 * Time complexity for this code O(m+n).
 * The space complexity should be O(1), and try within 40 bits
 * The character array can only hold the lowercase letters a through z. 
 * No existing comparison functions are allowed.
 * 
 *  HINT: use bit vector (int for this task)
 */

public class StringCompare
{
    public static char firstCommonCharacter(char str1[], char str2[])
    {
        int checker = 0;
        
        for (char chr : str1)
            checker |= (1 << chr - 'a');

        for (char chr : str2)
        {
            if ((checker & (1 << chr - 'a')) > 0)
            {
                return chr;
            }
        }
        return 0;
    }
}