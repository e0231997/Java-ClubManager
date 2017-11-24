
public class Facility
{
	private String name;
	private String description;

	//constructor
	public Facility(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	public Facility(String name)
	{

		this(name, "");

	}

	//getter setter
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	//methods
	public void Show()
	{
		
		
		if (this.getDescription().isEmpty())
		{
			System.out.println(this.getName());
		} else
		{
			System.out.println(String.format("%1$s(%2$s)", this.getName(), this.getDescription()));
		}

	}

}
