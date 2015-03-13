package designpattern.composition;
/**
 * A Classical Approach to Composition Design Pattern.
 * A class represent a generic pair of Objects and shows composition design pattern.
 * Class can store a pair of different data type values (e.g. String and Float).
 * Values of int, flaot etc. are auto-boxed in a wrapper classes.
 * The drawback of this approach is that we need to explicitly narrow cast Objects
 * when using getters.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class ObjectPair {
	Object first;
	Object second;
	
	public ObjectPair(Object first, Object second){
		this.first = first;
		this.second = second;
	}
	
	public Object getFirst(){
		return this.first;
	}
	
	public Object getSecond(){
		return this.second;
	}

}
