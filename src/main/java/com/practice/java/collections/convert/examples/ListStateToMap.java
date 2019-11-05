package com.practice.java.collections.convert.examples;

import java.util.ArrayList;
import java.util.List;

public class ListStateToMap {

	public static void main(String[] args) {
		List<State> states = new ArrayList<State>();
		states.add(new State(1L, "AP", 1L, "Andhra Pradesh"));
		states.add(new State(2L, "TS", 2L, "Telangana"));
		states.add(new State(3L, "MP", 3L, "Madhya Pradesh"));
		states.add(new State(1L, "AP", 1L, "Andhra Pradesh"));

		/**
		 * 1. Prints below lines of data as a list. If State object toString() method
		 * not override, below lines of data going to print.
		 * 
		 * Output: [com.java.collections.convert.examples.State@15db9742,
		 * com.java.collections.convert.examples.State@6d06d69c,
		 * com.java.collections.convert.examples.State@7852e922,
		 * com.java.collections.convert.examples.State@4e25154f]
		 * 
		 * 2. Prints below lines of data as a list, if State object toString() method
		 * is @override like below
		 * 
		 * <code>
			  &#64;Override
				public String toString() {
					return "State [stateId=" + stateId + ", code=" + code + ", posotion=" + posotion + ", description="
							+ description + "]";
				}
			</code>
		 * 
		 * Output: [State [stateId=1, code=AP, posotion=1, description=Andhra Pradesh],
		 * State [stateId=2, code=TS, posotion=2, description=Telangana], State
		 * [stateId=3, code=MP, posotion=2, description=Madhya Pradesh], State
		 * [stateId=1, code=AP, posotion=1, description=Andhra Pradesh]]
		 * 
		 * 
		 */
		System.out.println(states);

		// or to print list of objects individually
		System.out.println("Print List of data using Lambda Stream: ");
		states.stream().forEach(state -> System.out.println(state.toString()));
		
		
	}
}
