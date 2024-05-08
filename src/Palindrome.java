
public class Palindrome {

	public static boolean isPali(String ans)
	{
		int size=ans.length();
		int p1=0;
		int p2=size-1;

		while(p1<=p2)
		{
			if(ans.charAt(p1)==ans.charAt(p2))
			{
				p1++;
				p2--;
			}
			else
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String res="NAMN";
		boolean checkPali=isPali(res);
		if(checkPali==true)
		{
			System.out.print("It is a Palindrome");
		}
		else
		{
			System.out.print("It is not a Palindrome");
		}

	}

}
