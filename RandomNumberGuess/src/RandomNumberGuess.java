import java.util.*;
public class RandomNumberGuess {
	public static class Random {
		public int generate(int max,int min) {
			return (int)(Math.random()*(max-min+1)+min);
		}
	}
   public static void main(String args[]) {
	   Scanner sc =new Scanner(System.in);
	   Random rd=new Random();
	   int totalAttempts=0;
	   int win=0;
	   while(true) {
		   System.out.println("Enter the maximum number");
		   int max=sc.nextInt();
		   System.out.println("Enter the minimum number");
		   int min=sc.nextInt();
		   sc.nextLine();
		   
		   int num=rd.generate(max, min);
		   int attempts=0;
		   while(true) {
			   System.out.println("Guess a number between "+max+"and" + min);
			   int user_num=sc.nextInt();
			   attempts++;
			   if(user_num>num) {
				   System.out.println("It's Greater");
			   }
			   else if(user_num<num){
				   System.out.println("It's Smaller ");
			   }
			   else {
				   System.out.println("Correct Guess");
				   win++;
				   break;
			   }
		   }
		   totalAttempts+=attempts;
		   System.out.println("Attempts = "+attempts);
		   System.out.println("Wins = " + win);
		   
		   double winrate =((double)win /totalAttempts) *100;
		   System.out.printf("Your winrate is %.2f%%\n",winrate);
		   System.out.println("Do you want to play again(yes/no)");
		   
		   String playAgain=sc.next();
		   if(!playAgain.equalsIgnoreCase("yes")) {
			   sc.close();
			   System.exit(0);
		   }
		   sc.nextLine();
	   }
   }
}
