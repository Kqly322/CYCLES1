class Task_1
{
	public static void main(String[]args)
	{
		int year=2000+(int)(Math.random()*20);
		int AD=0;
		int month=1+(int)(Math.random()*11);
		int day=1+(int)(Math.random()*30);
		int[] allmonth=new int[] {30,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0) && (year%100==0) && (year%400==0))
		{
			if(month==2 && day>29)
			{
				day=allmonth[1]+1;
			}
			System.out.println("our data - "+day+"."+month+"."+year+".");
			month-=1;
			for(int i=0;i<month;i++)
			{
				AD+=allmonth[i];
			}
			AD+=day;
			System.out.println(AD+"- number");
		}
		else
		{
			if(month==2 && day>28)
			{
				day=allmonth[1];
			}
			System.out.println("our data - "+day+"."+month+"."+year+".");
			month-=1;
			for(int i=0;i<month;i++)
			{
				AD+=allmonth[i];
			}
			AD+=day;
			System.out.println(AD+"- number");
		}
	}
}