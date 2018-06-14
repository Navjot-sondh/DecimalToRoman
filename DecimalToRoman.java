import java.util.Scanner;
class DecimalToRoman
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int number,i;
		String[] romanNumerals={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M" };
		int[] decimalNumerals={1,4,5,9,10,40,50,90,100,400,500,900,1000};
		System.out.println("Enter a number");
		number=in.nextInt();
		while(number>0)
		{
			
			for(i=decimalNumerals.length-1;;i--)
			{
				if(decimalNumerals[i]<=number)
				{
					System.out.print(romanNumerals[i]);
					number=number-decimalNumerals[i];
					
					break;	
				}
				
			}
		}
	}
}