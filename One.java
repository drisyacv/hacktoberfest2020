public class Exm{
	public static void main(String[] args){
		
		int v1=100,v2=201;
		
		Example ex = new Example(12,22);//actual parameters
		
		ex.display();

		System.out.println("The result is"+" "+ex.CalSum(v1,v2));

	}
}
