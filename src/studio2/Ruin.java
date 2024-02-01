package studio2;
import java.util.Scanner;

public class Ruin {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner startAmountIn = new Scanner(System.in);
		System.out.println("What is your starting amount");
		int startAmount = startAmountIn.nextInt();
		int savedStartAmount = startAmount;

		Scanner winChanceIn = new Scanner(System.in);
		System.out.println("What is your win chance (between 0-1)");
		double winChance = winChanceIn.nextDouble();

		Scanner winLimitIn = new Scanner(System.in);
		System.out.println("What is your win Limit");
		int winLimit = winLimitIn.nextInt();

		Scanner totalSimulationsIn = new Scanner(System.in);
		System.out.println("How many days are you gambling");
		int totalSimulations = totalSimulationsIn.nextInt();

		while (totalSimulations >0)
		{
			startAmount=savedStartAmount;
			totalSimulations--;
			while (startAmount<winLimit && startAmount>0)
			{
				double randomGenerator = Math.random();
				if (winChance>=randomGenerator)

				{
					startAmount++;	
				}
				else
				{
					startAmount--;
				}
			}
			if (startAmount==0)
			{
				System.out.println("Ruin");

			}
			else
			{
				System.out.println("Success");
			}
		}
	}
}
