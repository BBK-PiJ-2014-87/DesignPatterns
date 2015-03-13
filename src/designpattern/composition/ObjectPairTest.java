package designpattern.composition;
/**
 * This class shows how ObjectPair class works.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ObjectPairTest {

	public static void main(String[] args) {
		//create an object pair with String and int values
		ObjectPair firstPair = new ObjectPair("Mike", 34);
		
		//to get values out we need to explicitly do narrowing casting
		//from an Object
		String name = (String)firstPair.getFirst();
		System.out.println(name);
		
		int age = (Integer)firstPair.getSecond();
		System.out.println(age);

	}

}
