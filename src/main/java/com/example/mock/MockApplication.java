package com.example.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Base64Utils;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class MockApplication {

	public static void main(String[] args) {

		SpringApplication.run(MockApplication.class, args);
		//System.out.println(getBasicAuthentication());;


	}

	private static String getBasicAuthentication(){

		String usernameAndPassword = "nsoadmin" + ":" + "nsoadmin";
		byte[] bytes = new byte[0];
		try {
			bytes = usernameAndPassword.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			//logger.error("Error while generating basic authentication.",e);
		}
		String encoded= new String(Base64Utils.encode(bytes));

		return "Basic " +encoded;
	}
}
