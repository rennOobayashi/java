package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child1 = new Child();
		
		child1.method1();
		
		//override method
		child1.method2();
		
		child1.method3();
		
		child1.field1 = "Nayutann";
		child1.field2 = "Seijin";
		
		System.out.println();
		
		Parent parent = child1;
		
		parent.method1();
		
		//override method
		parent.method2();
		
		System.out.println(parent.field1);
		
		//parent can use only Parent class method(and field)
		//parent.method3();
		//System.out.println(parent.field2);

		System.out.println();
		
		//casting
		Child child2 = (Child)parent;
		//casting variable can use child1's field2
		System.out.println(child2.field2);
		child2.method2();
		
//		parent2 must be initialized to Child.
//		Parent parent2 = new Parent();
//		Child child3 = (Child)parent2;
	}
}
