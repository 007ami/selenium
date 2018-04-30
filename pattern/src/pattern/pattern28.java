package pattern;

public class pattern28 {
	public static void main(String[] args) {
		char ch='A';
		int k=10;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i>=j)
				{
					System.out.print(" "+k +ch);
					k+=10;
					ch++;
				}
			}
			System.out.println();
		}

	}

}
