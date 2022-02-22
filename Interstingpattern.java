import java.util.Scanner;
public class Interestingpattern {
	public static void main(String[] args) {
		//Your code goes here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=i; j<=n; j++){
                System.out.print((char)('A' + j-1));
            }
            System.out.println();
        }
	}
}