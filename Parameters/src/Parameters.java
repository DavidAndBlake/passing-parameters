import javax.swing.JOptionPane;

public class Parameters
{

	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What's your name?");
		jack(name);
	}

	static void jack(String no)
	{
		System.out.println(no);
		jane(no);
	}

	static void jane(String janesMouth)
	{
		System.out.println("I got the name " + janesMouth + " from Jack.");
		william(janesMouth);
	}

	static void william(String williamsMouth)
	{
		System.out
				.println("This is the name I got from jane: " + williamsMouth);
		helen(williamsMouth);
	}

	static void helen(String helensMouth)
	{
		System.out.println("I am helen. This is what I got from William: "
				+ helensMouth);
		javier(helensMouth);
	}

	static void javier(String javiersMouth)
	{
		System.out.println("My name is Javier. This is what I got from Helen: " + javiersMouth);
		bobby(javiersMouth);
	}
	static void bobby(String bobbysMouth)
	{
		System.out.println("My name is Bobby, and this is waht I got from Javier: " + bobbysMouth);
	}
}
