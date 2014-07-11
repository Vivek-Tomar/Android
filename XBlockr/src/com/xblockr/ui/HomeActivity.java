package com.xblockr.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.xblockr.R;
import com.xblockr.utils.Util;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		System.out.println(Util.add(10, 2));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		// TO-DO initialize options menu
		return true;
	}

}
