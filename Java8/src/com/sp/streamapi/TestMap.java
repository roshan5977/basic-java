package com.sp.streamapi;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		List<Integer> ilist = List.of(2, 3, 4, 5, 6, 7, 8);
//   List<String> l=	ilist.stream().map((e)->e*e+"").collect(Collectors.toList());
		Function<Integer, String> s = new Function<>() {

			@Override
			public String apply(Integer t) {
				return t * t + "";
			}

		};
		List<String> l = ilist.stream().map(s).collect(Collectors.toList());

	}

}
