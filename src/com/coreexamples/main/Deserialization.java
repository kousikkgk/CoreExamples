package com.coreexamples.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.coreexamples.model.Employee;

public class Deserialization {
	public static void main(String[] args) {
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Employee e1 = (Employee) in.readObject();
			// printing the data of the serialized object
			System.out.println(e1.getName() + " " + e1.getAge());
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
