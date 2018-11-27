import java.util.ArrayList;
public class ArrayListMethods{
	public static void main(String[]args){
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
}