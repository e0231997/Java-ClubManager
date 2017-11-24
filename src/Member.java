
public class Member extends Person
{
	private int memberNumber;
	
	public int getMemberNumber()
	{
		return memberNumber;
	}

	public Member(String surname, String firstname, String secondname)
	{
		super(surname, firstname, secondname);
	}
	
	public void Show()
	{
		System.out.println(memberNumber+":"+ super.getSurname()+" "+super.getFirstname()+" "+super.getSecondname());

	}

}
