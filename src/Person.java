
public class Person
{
	private String surname;
	private String firstname;
	private String secondname;

	// constructor
	public Person(String surname, String firstname, String secondname)
	{
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = secondname;

	}

	// getters setters
	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getSecondname()
	{
		return secondname;
	}

	public void setSecondname(String secondname)
	{
		this.secondname = secondname;
	}

	// methods
	public void Show()
	{

		if (this.getSecondname() == null || this.getSecondname().isEmpty())
		{
			System.out.println(this.getFirstname() + " " + this.getSurname());
		} else
		{
			System.out.println(this.getFirstname() + " " + this.getSecondname() + " " + this.getSurname());

		}

	}

	public  String toString()
	{
		if (this.getSecondname() == null || this.getSecondname().isEmpty())
		{
			return (this.getFirstname() + " " + this.getSurname());
		} else
		{
			return (this.getFirstname() + " " + this.getSecondname() + " " + this.getSurname());
		}

	}

}
