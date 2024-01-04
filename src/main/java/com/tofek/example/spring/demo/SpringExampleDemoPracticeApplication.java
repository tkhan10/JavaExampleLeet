package com.tofek.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

@SpringBootApplication
public class SpringExampleDemoPracticeApplication {

	public static void main(String[] args) {
		System.out.println("This is tofek khan with all my passion to finish this coding");
		SpringApplication.run(SpringExampleDemoPracticeApplication.class, args);
		//findWordsContaining();
		//findArray();
		countPairs();
	}



	public  static List<Integer> findWordsContaining() {
		String[] words = new String[]{"leet", "saman","code", "arham"};
		char x = 'e';
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<words.length; i++) {
			int index = words[i].toString().indexOf(x);
			if (index >= 0) {
				result.add(i);
			}

		}
		return result;
	}

	public static boolean[] findArray(){
		int[] input  = new int[]{2,3,5,1,3};
		boolean[] output  = new boolean[input.length];
		int extraCandies = 3;

		OptionalInt max = Arrays.stream(input).sorted().max();
		System.out.println("Max - "+max);
		for(int i =0; i<input.length; i++){
			if((input[i]+extraCandies)>=max.getAsInt()){
				output[i] = true;
			}else{
				output[i] = false;
			}
		}
		//System.out.println(output);
		for(int i =0; i<output.length; i++){
			System.out.println(output[i]);
		}
		return output;
	}

	public static int countPairs() {
		int count = 0;
		List<Integer> nums = new ArrayList<>();
		//[-6,2,5,-2,-7,-1,3]
		nums.add(-6); nums.add(2); nums.add(5); nums.add(-2); nums.add(-7); nums.add(-1); nums.add(3);
		int target = -2;
		for(int i=0; i<nums.size();i++){
			for(int j=i+1; j<nums.size()-i-1; j++){
				if(nums.get(i)+nums.get(j) < target){
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}

}
