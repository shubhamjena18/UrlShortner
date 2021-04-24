package com.shorturl;

import java.util.HashMap;
import java.util.Random;


public class createUrlShortner {
	// generating the shortUrl for the given LongUrl and storing it in Map
	
	public String registerUrl(HashMap<String,String> urlMap,String longUrl)
	{
		 Random rand = new Random();
	        int urlLength=9;
	        char[] shortUrl = new char[urlLength];
	        String randChars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        for(int i=0;i<urlLength;i++) {
	            shortUrl[i]=randChars.charAt(rand.nextInt(randChars.length()));
	         }
	        StringBuilder sb = new StringBuilder("http://");
	        sb.append(shortUrl);
	        urlMap.put(sb.toString(),longUrl);
		return sb.toString();
	}

	//searching for the LongUrl for corresponding shortUrl
	public String searchLongUrl(HashMap<String, String> urlMap, String shortUrlSearch) {
		if(urlMap.containsKey(shortUrlSearch))
		{
			return urlMap.get(shortUrlSearch);
		}
		return null;
	}
	

}
