package com.demo.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ProcessingNestedJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			Student s = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(s.getId());
			System.out.println(s.getFirstName());
			System.out.println(s.getLastName());
			System.out.println(s.isActive());
			System.out.println(s.getAddress());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
