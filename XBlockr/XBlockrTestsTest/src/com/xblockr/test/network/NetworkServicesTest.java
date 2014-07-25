package com.xblockr.test.network;

import junit.framework.TestCase;
import junit.framework.TestResult;
import android.util.Log;

import com.xblockr.database.DatabaseServices;
import com.xblockr.networks.NetworkServices;

public class NetworkServicesTest extends TestCase {
	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#countTestCases()
	 */
	@Override
	public int countTestCases() {
		Log.v("NetworkServicesTest", "countTestCases");
		return super.countTestCases();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#createResult()
	 */
	@Override
	protected TestResult createResult() {
		Log.v("NetworkServicesTest", "createResult");
		return super.createResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run()
	 */
	@Override
	public TestResult run() {
		Log.v("NetworkServicesTest", "run");
		return super.run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run(junit.framework.TestResult)
	 */
	@Override
	public void run(TestResult result) {
		Log.v("NetworkServicesTest", "run");
		super.run(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		Log.v("NetworkServicesTest", "setName");
		super.setName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#getName()
	 */
	@Override
	public String getName() {
		Log.v("NetworkServicesTest", "getName");
		return super.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#runBare()
	 */
	@Override
	public void runBare() throws Throwable {
		Log.v("NetworkServicesTest", "runBare");
		super.runBare();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		Log.v("NetworkServicesTest", "setUp");
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#runTest()
	 */
	@Override
	protected void runTest() throws Throwable {
		Log.v("NetworkServicesTest", "runTest");
		super.runTest();
	}

	public void testGetTag() {
		Log.v("NetworkServicesTest", "getTag");
		String expected = "DatabaseServices" + " - ";
		assertEquals(expected, NetworkServices.getTag());
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