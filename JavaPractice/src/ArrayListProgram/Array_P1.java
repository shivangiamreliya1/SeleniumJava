package ArrayListProgram;

public class Array_P1 {

	public static void main(String[] args) {
		
		int [][] arr = new int [][] {{1,2,3,4},{5,6,7,8}};
		
		int row =2 ;
		int col = 4;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				System.out.print(arr[i][j] + "  ");
				
			}
			
			System.out.print("\n");
			
		}
		
	}

}
