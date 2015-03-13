package designpattern.composition;
/**
 * This class shows difference between a classical approach and when using generics
 * in Composition Design Pattern.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ObjectPairTest {

	public static void main(String[] args) {
		//create an object with a classical approach
		ObjectPair firstPair = new ObjectPair("Mike", 34);
		
		//to get values out we need to explicitly do narrowing casting
		//from an Object
		String name = (String)firstPair.getFirst();
		System.out.println(name);
		
		int age = (Integer)firstPair.getSecond();
		System.out.println(age);
		
		//declare a variable a parameterized type
		Pair<String, Integer> secondPair;
		//instantiate a Pair class using "diamond" operator
		//types are created based on a variable declaration (type inference)
		secondPair = new Pair<>("Dave", 30);
		
		String name2 = secondPair.getFirst();
		System.out.println(name2);
		
		int age2 = secondPair.getSecond();
		System.out.println(age2);
		
		//or we can do it explicitly 
		Pair<String, Double> thirdPair;
		thirdPair = new Pair<String,Double>("Tree", 15.56);
		String tree = thirdPair.getFirst();
		double height = thirdPair.getSecond();
		System.out.println("Tree: " + tree+" Height: "+height);
		

	}

}
