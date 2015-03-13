package designpattern.composition;
/**
 * Composition Design Pattern using Generics.
 * 
 * @author Vladimirs Ivanovs
 *
 */
public class Pair <A,B>{
	A first;
	B second;
	
	public Pair(A first, B second){
		this.first = first;
		this.second = second;
	}
	
	public A getFirst(){
		return this.first;
	}
	
	public B getSecond(){
		return this.second;
	}

}
