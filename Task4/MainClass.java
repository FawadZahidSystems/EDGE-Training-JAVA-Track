package StringCompare;

public class MainClass {

	public static void main(String[] args)
	{
		char chr = StringCompare.firstCommonCharacter("base".toCharArray(), "mess".toCharArray());
		
		if (chr == 0)
			System.out.print("No common character found");
		else
			System.out.print(chr);
	}
}
