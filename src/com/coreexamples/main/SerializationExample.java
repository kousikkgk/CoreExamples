package com.coreexamples.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.coreexamples.model.Employee;

public class SerializationExample {

	public static void main(String[] args) {
		try {
			Employee e1 = new Employee("Kousik", 23);	
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
