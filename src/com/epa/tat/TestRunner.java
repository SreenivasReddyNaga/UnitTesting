package com.epa.tat;


import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String args[])
    {
        TestListenerAdapter tstlistnerAdapter = new TestListenerAdapter();
        TestNG tstNg= new TestNG();
        XmlSuite tstSuite = new XmlSuite();

        tstNg.addListener(tstlistnerAdapter);
        tstNg.addListener(new MyTestListener());
        tstSuite.setName("CustomSuite");

        List<String> files = new ArrayList<String>();
        files.add("src/resources/Testng.xml");

        tstSuite.setSuiteFiles(files);

        List<XmlSuite> tstSuites = new ArrayList<XmlSuite>();
        tstSuites.add(tstSuite);

        tstNg.setXmlSuites(tstSuites);
        tstNg.run();
    }
}
