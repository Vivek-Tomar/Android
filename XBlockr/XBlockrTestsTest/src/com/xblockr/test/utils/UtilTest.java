package com.xblockr.test.utils;

import com.xblockr.utils.Util;

import android.util.Log;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class UtilTest extends TestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#countTestCases()
	 */
	@Override
	public int countTestCases() {
		Log.v("TestCase", "countTestCases");
		return super.countTestCases();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#createResult()
	 */
	@Override
	protected TestResult createResult() {
		Log.v("TestCase", "createResult");
		return super.createResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run()
	 */
	@Override
	public TestResult run() {
		Log.v("TestCase", "run");
		return super.run();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#run(junit.framework.TestResult)
	 */
	@Override
	public void run(TestResult result) {
		Log.v("TestCase", "run");
		super.run(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		Log.v("TestCase", "setName");
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
		Log.v("TestCase", "runTest");
		super.runTest();
	}

	public void testAdd() {
		Log.v("TestCase", "testAdd");
		int actual = Util.add(10, 2);
		assertEquals(12, actual);
	}

	public void testAdd2() {
		Log.v("TestCase", "testAdd2");
		int actual = Util.add(30, 12);
		assertNotSame(12, actual);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		Log.v("TestCase", "tearDown");
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
