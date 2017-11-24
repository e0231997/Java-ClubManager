
public class ClubApplication
{
	public static void main(String[] args)
	{

		Member member1 = new Member("Beng", "Tan", "Ah");
//		p.Show();
//		System.out.println(p);

		Member member2 = new Member("Laurel", "Stan",null);
//		p1.Show();
//		System.out.println(p1);

		Facility f = new Facility("F1");
		f.Show();

		Facility f2 = new Facility("F2", "Swimming pool");
		f2.Show();
		System.out.println(f2);
		
		
		Club c  = new Club();
		c.addMember(member1);
		c.addMember(member2);
	}

}
