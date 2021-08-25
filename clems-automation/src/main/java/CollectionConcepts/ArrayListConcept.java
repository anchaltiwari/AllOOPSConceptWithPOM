package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.qa.clems.pages.Employee;

public class ArrayListConcept {
	public static void main(String[] args) {
// ArrayList Implements List Interface 

	//	int a[] = new int[3];// Static Array, fixed in size, will give 'arrayOutOfBound Exception if try to
								// access any more than three elements'
		// ArrayList, dynamic array.
		// Duplicate values are allowed
		// index based (maintains insertion order.)
		// not thread safe (not sync)
		// slow as compare to other collection
		// To insert new data method is : 'add()'
		// Allows the random access to fetch any element by method : get(index);
		// to print all the values we use for loop as it store the values on the basis
		// of indexes.
		ArrayList ar = new ArrayList();// non generic
		List<String> list = new ArrayList<String>();// generic
		// Adding
		ar.add(45);
		ar.add(50);
		ar.add(10);
		ar.add(20);
		ar.add(45);
		ar.add(50);
		ar.add(45);
		ar.add(50);
		ar.add("test");
		ar.add('a');
		ar.add(true);
//		System.out.println(ar.size());
//		// fetching the value:
//		System.out.println(ar.get(1));
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// Adding
		list.add("Anchal");
		list.add("Nikky");
		list.add("Anav");
		list.add("Dobby");
		System.out.println("*****************************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// fetching the data
//		System.out.println(list.get(3));
//		// Employee class objects:
		Employee emp1 = new Employee("Anchal", 32, "Qa");
		Employee emp2 = new Employee("Anav", 1, "King");
		Employee emp3 = new Employee("Nikky", 32, "ScrumMaster");
		Employee emp4 = new Employee("Dobby", 7, "Security");
		Employee emp5 = new Employee("Dobby", 9, "Security");
		Employee emp6 = new Employee("Dobby", 7, "Security");
		Employee emp7 = new Employee("Dobby", 700, "Security");
		ArrayList<Employee> ArrayListEmp = new ArrayList<Employee>();

		ArrayListEmp.add(emp1);
		ArrayListEmp.add(emp2);
		ArrayListEmp.add(emp3);
		ArrayListEmp.add(emp4);
		ArrayListEmp.add(emp5);
		ArrayListEmp.add(emp6);
		ArrayListEmp.add(emp7);
		// System.out.println(ar.get(1));
//		for (int i = 0; i < ArrayListEmp.size(); i++) {
//			System.out.println(ArrayListEmp.get(i));
//		}
//
		System.out.println("*********************************");

		// iterator to traverse
		Iterator<Employee> itr = ArrayListEmp.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println(employee.name);
			System.out.println(employee.age);
			System.out.println(employee.dept);
		}
//		
		System.out.println("*********************************");
//
//		// Add all: to add/merge two lists
		ArrayList <String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		arr1.add("test1");
		arr1.add("test2");
		arr1.add("test3");
		
		arr2.add("test3");
		arr2.add("test3");
		arr2.add("test3");
		
		arr1.addAll(arr2);
		for(int i = 0; i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}

	}
}