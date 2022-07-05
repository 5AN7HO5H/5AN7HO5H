class program9
{
	public static void main(String[] args)
	{
		int i=15;
		int j=--i + i--;
		System.out.println(j);
		
		int a=13;
		int b=17;
		int c=a++ + --b + ++a + b--;
		System.out.println(c);
		
		int x=15;
		int y=12;
		int z=++x + --x + y++ + y--;
		System.out.println(z);
		
		int p=21;
		int q=25;
		int r=++p + --q + p++ +q--;
		System.out.println(r);
	}
}