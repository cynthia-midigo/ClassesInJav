import java.util.Scanner;
import java.util.*; 
public class Winner
{
  public static void main(String []args)
{	int largest=0;
	
	Scanner kb=new Scanner(System.in);
	Candidate[] candidate=new Candidate[5];
	Candidate cand1=new Candidate();
	Candidate cand2=new Candidate();
	Candidate cand3=new Candidate();
	Candidate cand4=new Candidate();
	Candidate cand5=new Candidate();
	candidate[0]=cand1;
	candidate[1]=cand2;
	candidate[2]=cand3;
	candidate[3]=cand4;
	candidate[4]=cand5;


	for(int i=0;i<candidate.length;i++)
	{
	System.out.print("Enter a Candidate's first  Name : ");
	String first=kb.next();
	System.out.print("Enter a Candidate's Second Name : ");
	String second=kb.next();
	candidate[i].setName(first + " " + second);
	candidate[i].setName(first +" " +second);
	System.out.println(candidate[i].getName());
	System.out.print("How many votes did this candidate get ? ");
	int tallyNo=kb.nextInt();
	candidate[i].setTally(tallyNo);
	System.out.println(candidate[i].getTally());
	//to find the winner
	
	if (tallyNo>largest){
	tallyNo=tallyNo;
	largest=tallyNo;
	
	
	}}
	
	System.out.println("The winner has " + largest + "votes");
	
	
}	

}

