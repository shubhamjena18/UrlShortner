/*
 * This Java class will be called when to create a new ShortUrl or for Searching 
 * the ShortUrl if it was previously created*/

package com.shorturl;

import java.util.HashMap;
import java.util.Scanner;

public class callUrlShortner {
	public static void main(String[] args)
	{
		// urlMap will contain the longUrl and its computed ShortUrl in Map
		HashMap<String,String> urlMap= new HashMap<>();
		createUrlShortner create=new createUrlShortner();
		Scanner sc = new Scanner(System.in);
		String longUrl= sc.nextLine();
		String shortUrl=create.registerUrl(urlMap,longUrl);	
		
		// Searching for the LongUrl
		String shortUrlSearch=sc.nextLine();
		String matchingLongUrl=create.searchLongUrl(urlMap,shortUrlSearch);
		sc.close();
		
	}

}
