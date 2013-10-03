package com.xblockr.test.ui;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

import com.xblockr.R;
import com.xblockr.ui.HomeActivity;

public class HomeActivityTest extends
		ActivityInstrumentationTestCase2<HomeActivity> {

	public HomeActivityTest() {
		super(HomeActivity.class);
		Log.v("HomeTest", "invoking constructor");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#getActivity()
	 */
	@Override
	public HomeActivity getActivity() {
		Log.v("HomeTest", "getActivity");
		return super.getActivity();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#runTest()
	 */
	@Override
	protected void runTest() throws Throwable {
		Log.v("HomeTest", "runTest");
		super.runTest();
	}

	public void testHomeMsg() {
		String expected = "Hello world!";
		TextView msgTextView = (TextView) getActivity().findViewById(
				R.id.homeMsg);
		String actual = msgTextView.getText().toString();
		assertEquals(expected, actual);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.test.ActivityInstrumentationTestCase2#setActivityInitialTouchMode
	 * (boolean)
	 */
	@Override
	public void setActivityInitialTouchMode(boolean initialTouchMode) {
		Log.v("HomeTest", "setActivityInitialTouchMode");
		super.setActivityInitialTouchMode(initialTouchMode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.test.ActivityInstrumentationTestCase2#setActivityIntent(android
	 * .content.Intent)
	 */
	@Override
	public void setActivityIntent(Intent i) {
		Log.v("HomeTest", "setActivityIntent");
		super.setActivityIntent(i);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		Log.v("HomeTest", "setUp");
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		Log.v("HomeTest", "tearDown");
		super.tearDown();
	}

}
