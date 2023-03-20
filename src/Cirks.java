import java.util.Random;
import java.util.Scanner;

public class Cirks {
	public static  void mestKaulinu(int reizes){
		
		int skaitlis=0;
		Random rand = new Random();
		for(int i=1; i<=reizes;i++){
		 skaitlis= rand.nextInt(6)+1;
		 System.out.println("tavs cipars: "+skaitlis);
		}
		 
		
	}
	public static void main(String[] args) {
	int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reize matis kaulin? ");
		reizes = scan.nextInt();
		mestKaulinu(reizes);
	}
	
		
	}
	


