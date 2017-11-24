
public class Club
{
	private int currentNumber;

	private Member[] member = new Member[5];

	public Club()
	{

	}

	public void addMember(Member m)
	{
	
		currentNumber++;
		if(currentNumber<=5) {
			member[currentNumber-1] = m;
		}else
		{
			System.out.println("Full");
		}

	}
	
	public void removeMember(int memberNumber)
	{
	
		if(memberNumber <1 || memberNumber>5) {
			System.out.println("not valid");
		}else
		{
			member[memberNumber-1] = null;
		}

	}

}
