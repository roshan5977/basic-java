package com.jsp.streamapi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serialization in java isa machanism to write state of an object into a byte
 * stream Deserialisation means byteStream to Object. In ObjectOuputStream class
 * -writeObject() method for serializing the object In ObjectInputStream class-
 * readObject() method for deserialization the object Serializable is a marker
 * interface String class and wraper class implements its and the class whose
 * obj we want to make serializable nd to implement. transient or static will
 * not be serialized becoz transient will not and give default value and static
 * cant be obj.
 * 
 * @author HP
 *
 */

//Now its object can be converted to Stream as employee implements the interface and  Student extends it...

public class SerialisableDemo1 {

	public static void main(String[] args) {
		try {
			Student s = new Student(4, "Binod");
			FileOutputStream fos = new FileOutputStream("p.txt");
			ObjectOutputStream ois = new ObjectOutputStream(fos);
			ois.writeObject(s);
			fos.flush();
			ois.close();
			fos.close();
			System.out.println("success");
		} catch (Exception e) {
		}
		try {
			ObjectInputStream oos = new ObjectInputStream(new FileInputStream("p.txt"));
			Student read = (Student) oos.readObject();
			System.out.println(read.id + "  " + read.name);
			oos.close();
		} catch (Exception e) {

		}

		
		
		
		
		
		// Employee

		Employee emp = new Employee(90000, "biay");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
			oos.writeObject(emp);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println("exception");
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
			Employee e = (Employee) ois.readObject();
			System.out.println(e.Name + " " + e.sal + " " + e.id);
			ois.close();
		} catch (Exception e) {
			System.out.println("exception");
		}
	}
}
