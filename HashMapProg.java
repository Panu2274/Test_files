package setA_Prog1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMapProg {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		HashMap<String, String> dept=new HashMap<>();
		dept.put("Mr.Patil", "Manager");
		dept.put("Mrs.Sonar", "Accountant");
		dept.put("Ms.Aarya", "Employee");
		System.out.println("Name : Department");
		System.out.println(dept);
		
		
		
	}

}
