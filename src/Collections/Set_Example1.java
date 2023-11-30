package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example1 {

	public static void main(String[] args) {
		int count[] = {34,22,10,60,30,22};   // Integer Array - Count 
		Set<Integer>set = new HashSet<Integer>();
		for(int i =0;i<count.length;i++) {
        set.add(count[i]);
	}
 System.out.println(set);
 TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
 System.out.println("The sorted list is: ");
 System.out.println(sortedSet);
 System.out.println("The First element of the set is: "+ sortedSet.first());
 
 System.out.println("The last element of the set is: "+(Integer)sortedSet.last());
	}
}
