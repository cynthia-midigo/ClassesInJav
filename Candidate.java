public class Candidate
{
	//instance variable
	private String candName;
	private int voteTally;
	//constructor with parameter
	public Candidate(){}
	public Candidate(String candName,int voteTally)
	 {
		this.candName=candName;
		
		this.voteTally=voteTally;
		
	}
	

	//method to set candidate name and vote tally	
	public void setName(String candName)
	{
		this.candName=candName;
		
	
	}
	public String getName()
	{
		return  candName;
	
	}
	public void setTally(int voteTally)
	{
		
		this.voteTally=voteTally;
	
	}
	
	
	
	public int getTally()
	{
		
		return voteTally;
	
	}
	
	
	
}

