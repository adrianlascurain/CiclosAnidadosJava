
public class TrianguloInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dot = 7;
		for(int i = 0; i < 6; i++) {
			dot--;
			for(int j = dot; j > 0; j--) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

}
