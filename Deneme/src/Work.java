import java.util.ArrayList;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		int i=5;
		System.out.println("The value of i before block is "+i);
		{
			 i=7;
			 System.out.println("The value of i inside block is "+i);
		}
		System.out.println("The value of i after block is "+i);
	}


public int[] arrayCreator(int n) {
	return new int[n];
}
}
