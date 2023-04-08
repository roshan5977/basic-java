package com.sp.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Notes {
	public static void main(String[] args) {

		/**
		 * filter() method
		 */

		/**
		 * distinct() method
		 */
		List<Student> list = List.of(new Student("Roshni", 34324, "python"), new Student("Prabhu", 8547, "java"),
				new Student("Ruchi", 83527, "c++"), new Student("anuj", 2234, "c++"),
				new Student("Parakash", 2234, "python"));
		list.forEach(System.out::println);
//List<Student> u=list.stream().distinct().collect(Collectors.toList());

//	distinct()-its method of stream which returns stream 
//	Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream. 
//
//For ordered streams, the selection of distinct elements is stable
//(for duplicated elements, the element appearing first in the encounter order is preserved.) 
//For unordered streams, no stability guarantee are made. 
	int n=	Arrays.asList(2, 4, 1, 9, 4, 3, 6, 9, 0).stream()
			.sorted().filter(t -> t % 2 != 0).map(e -> e * 2)
			.min((i1,i2)->i1.compareTo(i2)).get();
//	.forEach(System.out::println);
//	.forEach(System.out::fnction);
//	Function<Integer,Void> f=i->{
//		
//	};inside foreach consumer function...
	Consumer<Integer> c=i->{
		System.out.println(i*i);
	};
	
//	toArray ()// for stream to array---returns array of elements in stream
	ArrayList<Integer> i=new ArrayList<Integer>();
	i.add(43);
	i.add(65);
	i.add(35);
	i.add(86);
	i.add(30);
	i.add(95);
	
	Integer[] k=i.stream().toArray(Integer[]::new);
	Stream.of(k).forEach(System.out::println);//converted integer array to stream and printed integer element.
	
	//Sample::new -return sample object integer[] returns.
	//sorted()
	//sorted(comparator)
	//min(comparator)
	//max(comparator)
	//Stream.of()
	
	//just revise and practice u will remember all these..
	
	
//	reduce(0, (c,e)->c+e)
	}
};
