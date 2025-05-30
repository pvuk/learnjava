package com.java8.stream.array;
import java.util.HashMap;
import java.util.Map;

/**
 * Reference: https://www.digitalocean.com/community/tutorials/java-equals-hashcode
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sat 17-May-2025 07:07
 */
public class HashingTest {

	public static void main(String[] args) {
		Map<DataKey, Integer> hm = getAllData();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("Object hashCode: "+ dk.hashCode());

		Integer value = hm.get(dk);

		/*
		 * When we run above program, it will print null. It’s because Object hashCode() method is used to find the bucket to look for the key. Since we don’t have access to the HashMap keys and we are creating the key again to retrieve the data, you will notice that hash code values of both the objects are different and hence value is not found.
		 */
		System.out.println("mapValue: "+ value);

	}

	private static Map<DataKey, Integer> getAllData() {
		Map<DataKey, Integer> hm = new HashMap<>();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("Pankaj");
		System.out.println("getAllData: object hashCode: "+ dk.hashCode());

		hm.put(dk, 10);

		return hm;
	}

}

class DataKey {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DataKey [name=" + name + ", id=" + id + "]";
	}

	/*
	 * Output: 
	 * without overriding:
	 * getAllData: object hashCode: 366712642
	 * Object hashCode: 1829164700
	 * mapValue: null
	 * 
	 * With overriding: 
	 * getAllData: object hashCode: -1911669737
	 * Object hashCode: -1911669737
	 * mapValue: 10
	 */
	
	//START: Comment this and re run	
	//Implementing equals() and hashCode() method
	//We can define our own equals() and hashCode() method implementation but if we don’t implement them carefully, it can have weird issues at runtime. Luckily most of the IDE these days provide ways to implement them automatically and if needed we can change them according to our requirement. We can use Eclipse to auto generate equals() and hashCode() methods.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataKey other = (DataKey) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	//END: Comment this and re run
	
	/*
	 * What is Hash Collision
In very simple terms, Java Hash table implementations uses following logic for get and put operations.

First identify the “Bucket” to use using the “key” hash code.
If there are no objects present in the bucket with same hash code, then add the object for put operation and return null for get operation.
If there are other objects in the bucket with same hash code, then “key” equals method comes into play.
If equals() return true and it’s a put operation, then object value is overridden.
If equals() return false and it’s a put operation, then new entry is added to the bucket.
If equals() return true and it’s a get operation, then object value is returned.
If equals() return false and it’s a get operation, then null is returned.
	 */
}