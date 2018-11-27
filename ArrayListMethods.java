import java.util.ArrayList;
public class ArrayListMethods{
	public static void main(String[]args){
	}
	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){
		for(int i = 0; i<b.size(); i++)
			a.add(b.get(i));
		return a;
	}
}