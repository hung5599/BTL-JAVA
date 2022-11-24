package com.sportingcomplex.utils;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {
	private String data;
	
	public HttpUtil(String data) {
		this.data = data;
	}
	
	// chuyển từ json sang String
	public static HttpUtil of(BufferedReader br) {
		try {
			StringBuilder json = new StringBuilder();
			String value;
			while((value = br.readLine()) != null) {
				json.append(value);
			}
			return new HttpUtil(json.toString());
		} catch(IOException e) {
			return null;
		}
	}
	
	// chuyển từ String map sang các model
	public <T> T toModel(Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(this.data, tClass);
		} catch(IOException e) {
			System.out.print(e.getMessage());
			return null;
		}
	}
}