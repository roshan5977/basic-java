package com.feuji.feb15th;

public class GenericType<T> {

	
	public static  <T> T  callMe( T t) {
		return t;
		
	}
//	public <? extends T> void isSameSubject(T t, T t1) {
//		
//	}
//	public void drawAll(List<? extends Shape> shapes) { use in listr with map too
//	interface Collection<E> {
//	    public boolean containsAll(Collection<?> c);
//	    public boolean addAll(Collection<? extends E> c);
//	}
//	    ...
//	}
}
