import java.util.Random;
import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("USER GUESS = ");
int ug=sc.nextInt();//user guess
int n=100;// upper limit (1 to 100)
int cg;//computer guess
int count=0;//user score= that will show that in how many attempts you guessed it correctly
int limit=2;// let the limit of the user to guess the number be 50
do {
	cg=(int)(Math.random()*n)+1;/*Math.random() always takes up number from 0 to 1 in
	                              double format, so by multiplying n(i.e.100) with it we 
	                              will get numbers till 100 and we add 1 because it starts 
	                              with 0 and multiplying 0 with 100 gives 0.... but in question
	                              its given from 1 so we add 1 to it.*/
	if(cg==ug) {
		System.out.println("USER GUESS= "+ ug);
		System.out.println("COMPUTER GUESS= "+cg);
		System.out.println("CORRECT GUESS");
		System.out.println("your score to win the game= "+ count);}
	else { 
		if(cg<ug) {
		System.out.println("USER GUESS= "+ ug);
		System.out.println("COMPUTER GUESS= "+cg);
		System.out.println("TOO HIGH");
        count++;}
	    else {
	    	if(cg>ug) {
		System.out.println("USER GUESS= "+ ug);
		System.out.println("COMPUTER GUESS= "+cg);
		System.out.println("TOO LOW");
        count++;}
	    }
	}
}while(cg!=ug && count<limit);
}
	}
