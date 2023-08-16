import java.util.*;

class FractionCollection
{
	public static final int MAX =10;

	public static void main(String[] args)
	{
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		
		Random r = new Random();
		
		Fraction f;
		
		for(int i = 0; i < MAX; i++)
			fractions.add(new Fraction(r.nextInt(MAX), r.nextInt(MAX)));
		
		printFractions(fractions);
		f = add.Fraction(fractions);
		
		System.out.println("___________________________");
		System.out.println(f);
	}

	public static void printFractions(ArrayList<Fraction> list)
	{
		for(Fraction f : list)
			System.out.println(f);
	}
	public static Fraction addFractions(ArrayList<Fraction> list)
	{
		Fraction result = new Fraction();
		
		for(Fraction f : list)
				result = result.add(f);
			
			return result;
	}
}
	