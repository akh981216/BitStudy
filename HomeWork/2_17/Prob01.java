public class Prob01 {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);

		char star='*';
		String csv = " ";

		for(int i=0; i<num; i++){
			for(int a =1; a<num-i; a++){
				System.out.print(csv);	
			}
			for(int j = 0; j<=i*2; j++){
				System.out.print(star);
			}
			System.out.println();
		}//end of for
	}//end of main
}//end of class