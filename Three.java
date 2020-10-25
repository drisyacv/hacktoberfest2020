public class Example{
	
	int var1 = 100,var2 = 200;

	
	Example(int arg1, int arg2)//formal parameter
	{
	
		var1=arg1;
		var2=arg2;
	
	}

	void display()	
	{

		System.out.println("variable one is"+" "+var1);
		System.out.println("variable two is"+" "+var2);
	}

	int CalSum(int arg1, int arg2)
	{
	
		int res = arg1+arg2;
	
		return res;

	}

}
