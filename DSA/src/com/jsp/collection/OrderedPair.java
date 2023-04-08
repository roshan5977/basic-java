package com.jsp.collection;

/**
 * 
 * @author HP
 *
 * @param <K>
 * @param <V>
 */

 interface Pair<K ,V>
{
	public K getkey();
	public V getvalue();
}

public class OrderedPair<K,V> implements Pair<K,V>
{
   private K key;
   private V value;
    
   public OrderedPair(K key,V value)
   {
	   this.key=key;
	   this.value=value;
   }
   public K getkey()
   {
	   return key;
   }
   @Override
   public V getvalue()
   {
	   return value;
   }
   public static void main(String[] args) {
	Pair<String,Integer> op=new OrderedPair<>("hreu", 323);
}

}
