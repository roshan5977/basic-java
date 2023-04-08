package com.jsp.collection;
//List
import java.util.*;

public class Vegetables implements Comparable<Vegetables> {
  
	 int price;
	 String name;
	 int size;
	 public Vegetables (int price,String name,int size)
	 {
		 this.price=price;
		 this.name=name;
		 this.size=size;
	 }
	 public int compareTo(Vegetables v)
	 {
		return this.price- v.price;
	 }
	 @Override
	 public  String toString()
	 {
		 return "["+price+","+name+","+size+"]";
	 }
	 @Override
	 public boolean equals(Object o)
	 {
		 return ((Vegetables)this).name.equals(((Vegetables)o).name);
	 }
	 
	public static void main(String[] args) {
		List <Vegetables> list =new ArrayList<>();
		System.out.println(list.add(new Vegetables(60,"Brinjal",10)));
		list.add(new Vegetables(30,"Potato",5));
		list.add(new Vegetables(20,"Tomato",7));
		list.add(new Vegetables(100,"Papaya",12));
		list.add(new Vegetables(200,"Pumpkin",9));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new NameOfVegetables());
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
	list.add(0, new Vegetables(56,"Carrot",20));
	System.out.println(list.size());
   System.out.println(list.isEmpty());
    List<Vegetables> list1= new ArrayList<>();
    list1.add(new Vegetables(90,"Apple",19));
    list1.add(new Vegetables(99,"Ladis-Finger",8));
    list1.add(new Vegetables(88,"Orange",6));
    System.out.println(list1);
   System.out.println(list.addAll(list1));
   System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
		System.out.println(list.contains(new Vegetables(100,"Papaya",12)));
		System.out.println(list);
		list.addAll(list1);
		Object[]v=list.toArray();
		for(Object s:v)System.out.println(s);
		List<Vegetables> list2=new ArrayList<>();
	    list2.add(new Vegetables(90,"Apple",19));
	    list2.add(new Vegetables(88,"Orange",6));
	    list2.add(new Vegetables(99,"Ladis-Finger",8));
	    System.out.println(list);
	    list.retainAll(list2);
	    System.out.println(list);
//	    list.clear();
//	    System.out.println(list);

	}
		
}
class NameOfVegetables implements Comparator<Vegetables>
{
	@Override
	public int compare(Vegetables v1,Vegetables v2)
	{
		return v1.name.compareTo(v2.name);
	}
}