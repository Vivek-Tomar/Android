package com.xblockr.test.database;

import android.util.Log;

import com.xblockr.database.DatabaseServices;
import com.xblockr.utils.Util;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class DatabaseServicesTest extends TestCase {
	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#countTestCases()
	 */
	@Override
	public int countTestCases() {
		Log.v("DatabaseServicesTest", "countTestCases");
		return super.countTestCases();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#createResult()
	 */
	@Override
	protected TestResult createResult() {
		Log.v("DatabaseServicesTest", "createResult");
		return super.createResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run()
	 */
	@Override
	public TestResult run() {
		Log.v("DatabaseServicesTest", "run");
		return super.run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run(junit.framework.TestResult)
	 */
	@Override
	public void run(TestResult result) {
		Log.v("DatabaseServicesTest", "run");
		super.run(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		Log.v("DatabaseServicesTest", "setName");
		super.setName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#getName()
	 */
	@Override
	public String getName() {
		Log.v("TestCase", "getName");
		return super.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#runBare()
	 */
	@Override
	public void runBare() throws Throwable {
		Log.v("TestCase", "runBare");
		super.runBare();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		Log.v("TestCase", "setUp");
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#runTest()
	 */
	@Override
	protected void runTest() throws Throwable {
		Log.v("DatabaseServicesTest", "runTest");
		super.runTest();
	}

	public void testGetTag() {
		Log.v("DatabaseServicesTest", "getTag");
		String expected = "DatabaseServices" + " : ";
		assertEquals(expected, DatabaseServices.getTag());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		Log.v("DatabaseServicesTest", "tearDown");
		super.tearDown();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
