package task12;

public class test {
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			  { 10, 19, 3, 8, 2},
			  { 5, 2, 0, 6, 7},
			  { 4, 5, 17, 22, 13},
			  { 2, 9, 3, 13, 12},
			  { 3, 7, 0, 6, 4},
			  { 29, 13, 5, 8, 2}
			};
	    MatrFun evenThread=new MatrFun(matrix,"Even Thread",0,1);
	    MatrFun oddThread=new MatrFun(matrix,"Odd Thread",1,1);
	}

}
