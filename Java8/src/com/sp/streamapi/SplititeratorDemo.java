package com.sp.streamapi;

import java.util.*;

public class SplititeratorDemo {

	public static void main(String[] args) {
     List<Integer> l=new ArrayList<>();
     l.add(1);
     l.add(2);
     l.add(5);
     l.add(7);
     l.add(9);
   //  l.spliterator().forEachRemaining(null);
  System.out.println( l.spliterator().characteristics());
 System.out.println( l.spliterator().estimateSize());//says how many elements are present.
 System.out.println(l.spliterator().getClass());//returns runtime classes
//System.out.println(l.spliterator().getComparator());
//If this Spliterator's source is SORTED by a Comparator,returns that Comparator. 
//If the source is SORTED in natural order, returns null.
//Otherwise,if the source is not SORTED, throws IllegalStateException.
System.out.println(l.spliterator().getExactSizeIfKnown());
//Convenience method that returns estimateSize() if thisSpliterator is SIZED, else -1.
//Returns:the exact size, if known, else -1.Impl
// default implementation returns the result of estimateSize()if the Spliterator reports a characteristic of SIZED,-1 otherwise.
     l.spliterator().tryAdvance(null)
	}

}
