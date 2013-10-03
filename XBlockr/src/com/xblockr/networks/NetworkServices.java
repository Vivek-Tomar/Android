package com.xblockr.networks;

import android.util.Log;

import com.xblockr.database.DatabaseServices;

public class NetworkServices {
	static long time = 0;
	static final String TAG = DatabaseServices.class.getSimpleName() + " - ";

	public static String getTag() {
		Log.v(TAG + Thread.currentThread().getStackTrace()[1].getMethodName(),
				"Started at " + (time = System.currentTimeMillis()));
		Log.v(TAG, "Time Taken " + (System.currentTimeMillis() - time));
		return TAG;
	}
}
