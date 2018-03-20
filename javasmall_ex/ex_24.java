import java.util.Scanner;

public class TestCount {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int end = in.nextInt(); int x = in.nextInt();
	int result ;
	int guess=0 ;
	int count = 0;
	for(int i =1;i<=end;i++) {
		result = i;
		while(result!=0) {
		guess = result%10;
		result = result/10;
		if(guess==x) {
			count++;
		}
		}
		}
	System.out.println(count);	
}
}