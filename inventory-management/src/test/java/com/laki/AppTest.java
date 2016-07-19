package com.laki;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.junit.After;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    private static Tomcat t;
    private static final int TOMCAT_PORT = 9999;

    @Before
    public void setup() throws Throwable {
        t = new Tomcat();
        t.setBaseDir(".");
        t.setPort(TOMCAT_PORT);
    /* There needs to be a symlink to the current dir named 'webapps' */
        t.addWebapp("/service", "distribution/src/main/webapp");
        t.init();
        t.start();

//        String contextPath = "/" + getApplicationId();
//        File webApp = new File(mWorkingDir, getApplicationId());
//        File oldWebApp = new File(webApp.getAbsolutePath());
//        FileUtils.deleteDirectory(oldWebApp);
//        new ZipExporterImpl(createWebArchive()).exportTo(new File(mWorkingDir + "/" + getApplicationId() + ".war"),
//                true);
//        mTomcat.addWebapp(mTomcat.getHost(), contextPath, webApp.getAbsolutePath());

    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    @After
    public void shutDownTomcat() throws LifecycleException{
        t.stop();
    }
}
