import java.math.BigInteger;
import java.nio.ByteBuffer;

class BinaryGap
{

	public static void main(String[] args)
	{

		int largestGap = 0;
		int gapStart = Integer.MIN_VALUE;
		//Other numbers to test out on
		// int num = 9;
		// int num = 362;
		// int num = 33;
		// int num = 257;
		// int num = 17;
		// int num = 21;
		// int num = 451;
		int num = 681;
		for (int i = Integer.SIZE - 1; i >= 0; i--)
		{
			System.out.print(getBit(num, i));
			if (getBit(num, i) == 1)
			{

				if (gapStart == Integer.MIN_VALUE)
				{
					gapStart = i;
				} else
				{
					if (largestGap < gapStart - i)
					{
						largestGap = gapStart - i - 1;

					}
					gapStart = i;
				}
			}

		}
		System.out.print("\nLargestGap = " + largestGap);

	}

	//Not my method
	static int getBit(int num, int pos)
	{
		return (num >> pos) & 1;
	}

}
