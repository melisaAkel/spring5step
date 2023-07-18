package com.spring.basics.spring5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5StepsApplication {


	public static void main(String[] args) {
		BinarySearch bin= new BinarySearch();
		int[] arr= {1,2,3};
		int k = bin.binsearch(arr,2);
		System.out.println(k);
;		SpringApplication.run(Spring5StepsApplication.class, args);
	}

}
