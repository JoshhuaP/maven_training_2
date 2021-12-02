package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestClassDiscoverer {
    private final String packageName;

    public TestClassDiscoverer(String packageName) {
        this.packageName = packageName;
    }

    public List<TestClassDescription> listTestClasses() {
        List<TestClassDescription> testClassDescription = new ArrayList<TestClassDescription>();
        for (int i = 0; i<testClassDescription.size(); i++) {
            /*if (testClassDescription.get(i).isAnnotationPresent(TestMethod.class) && testClassDescription.get(i).getName().endsWith("LernejoTests")) {
                packageName.add(testClassDescription.get(i));
            }*/

        }
        return testClassDescription;
    }
}
