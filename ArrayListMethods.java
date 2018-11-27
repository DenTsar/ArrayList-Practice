import java.util.ArrayList;
public class ArrayListMethods{
	public static void main(String[]args){
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		for(int i = 0; i<2; i++)
			for(int j = 0; j<10; j++)
				a.add(j);
		for(int i = 20; i>12; i--)
			b.add(i);
		System.out.println(combine(a,b));
		print(a);
		System.out.println(removeDuplicates(a));

	}
	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){
		for(int i = 0; i<b.size(); i++)
			a.add(b.get(i));
		return a;
	}
	public static void print(ArrayList<Integer> a){
		for(int i = 0; i<a.size()-1; i++)
			System.out.print(a.get(i)+", ");
		System.out.println(a.get(a.size()-1));
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){
		for(int i = a.size()-2; i>-1; i--)
			for(int j = i+1; j<a.size(); j++)
				if(a.get(i)==a.get(j))
					a.remove(i);
		return a;
	}
}