package com.tofek.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.tofek.reflection.model.Person;

public class MainClass {
	public static void main(String[] args) {
		try {
			
			/*
			 * Class person = Class.forName("com.tofek.reflection.model.Person");
			 * Field[] a = person.getDeclaredFields(); List<String> list = new
			 * ArrayList<String>(); for(Field ab : a) { list.add(ab.getName()); }
			 * System.out.println("List of fields ="+list);
			 */
			new MainClass().numberOfHighestTarget();
			/*Class main = Class.forName("com.tofek.reflection.model.Person");
			Constructor[] methods = main.getDeclaredConstructors();
			for(int i=0; i<methods.length; i++)
				System.out.println(methods[i].toString());*/
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public int numberOfEmployeesWhoMetTarget() {
		int met = 0;
		int[] hours = new int[]{0,1,2,3,4};
		int target = 2;
		IntPredicate predicate = e->e>= target;
		long a = Arrays.stream(hours).sorted()
				.filter(predicate)
				.count();
		return (int)a;
	}

	public void numberOfHighestTarget() {
		int met = 0;
		int[] hours = new int[]{0,1,5,3,4};
		int target = 2;
		IntPredicate predicate = e->e>= target;
		int max = Arrays.stream(hours).sorted().max().getAsInt();
		Arrays.stream(hours)
						.filter(h->h+target>=max);
	}

}
