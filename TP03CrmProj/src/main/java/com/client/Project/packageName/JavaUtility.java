package com.client.Project.packageName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNum() {
		
		Random random =  new Random();
		int randomNum = random.nextInt(2000);
		return randomNum;
		
	}
	public String getSystemDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
		String dateObj = dateFormat.format(date);
		return dateObj;
	}

}
