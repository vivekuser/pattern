import java.util.Scanner;
public class Reversenopattern {


	public static void main(String[] args) {
		
		
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
		
	}

}
