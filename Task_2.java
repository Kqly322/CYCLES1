class Task_2
{
	public static void main(String[]args)
	{
		int x=(int)(Math.random()*10),y=0;
		for (int i=0;i<=10;i++)
		{
			y=i+y*x;
		}
		y+=11;
		System.out.println(y);
	}
}