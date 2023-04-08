package com.sp.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Demo {

	public static void main(String[] args) {
		/**
		 * takeWhile()-stops when dont match predicate inside it
		 * dropWhile()-rest of elements after droping from takeWhile()
		 * ofNullable()
		 * iterate()
		 * 
		 */
		
		//takeWhile()
		List<Integer> list= List.of(5,10,15,7,3,5,8,43,3,2);
		//list.stream().takeWhile(e->e%5==0).collect(Collectors.toList()).forEach(System.out::println);
		//list.stream().dropWhile(e->e%5==0).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> l=List.of(2,3,4,5,0,6,7,8,9,9);
//		List <Integer> u=l.stream().takeWhile(e->e%2==0).collect(Collectors.toList());
//		System.out.println(u);
		
//		List<Integer> l=List.of(2,3,4,5,4,6,78,3);
//		List<Integer>u=Stream.of(2,4,3,4,5,7,3,8).dropWhile(e->e%2==0).collect(Collectors.toList());
//		System.out.println(u);
		
//		Stream s=Stream.ofNullable(3);
//		s.forEach(System.out::println);//conumer input
		
//		Stream.iterate(3,i-> i<7,i->i*2).forEach(System.out::println);

	}
}
