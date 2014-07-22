package com.xblockr.database;

import android.util.Log;

public class DatabaseServices {
	static long time = 0;
	static final String TAG = DatabaseServices.class.getSimpleName() + " - ";

	public static String getTag() {
	try{
		Log.v(TAG + Thread.currentThread().getStackTrace()[1].getMethodName(),
				"Started at " + (time = System.currentTimeMillis()));
		Log.v(TAG, "Time Taken " + (System.currentTimeMillis() - time));
		}catch(Exception ex){
		}
		return TAG;
	}
	public static String getValue(){
		String rValue=null;
		try{
			rValue="Done";
		}catch(Exception ex){
			rValue="Exception";
		}
		return rValue;
	}
}
