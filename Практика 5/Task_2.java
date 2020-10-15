class Task_2
{
	public static void main(String[]args)
	{
		int n=(int)(Math.random()*20);
		int kol=0;
		System.out.println(n+" -our number");
		for(int i=0;i<=n;i++)
		{
		if(i%2==1)
		{
			if((i%3==1)||(i%3==2))
			{
				if((i%5==1)||(i%5==2)||(i%5==3)||(i%5==4))
				{
					System.out.println(i);
					kol++;
				}
			}
		}		
		}
		System.out.println(kol+"-all numbers");
	}
}