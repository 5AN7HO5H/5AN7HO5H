class program8
{
	public static void main(String[] args)
	{
		int a=10;
		int b=a++ + ++a;
		System.out.println(b);//22
		
		int x=14;
		int y= ++x + x++;
		System.out.println(y);//30
		
		int p=19;
		int q=p-- + --p;
		System.out.println(q);//36
	}
}