package fr.lernejo.tester.internal;
import fr.lernejo.tester.api.TestMethod;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class TestClassDescription {
    private final Class<?> lernejoTests;
    private Annotation annotation;

    public TestClassDescription(Class<?> lernejoTests) {
         this.lernejoTests = lernejoTests;
    }
    public List<Method> listTestMethods() throws InvocationTargetException, IllegalAccessException {
        List<Method> methods = new ArrayList<Method>();
        Method[] methodTests = lernejoTests.getDeclaredMethods();
        for (int i=0; i<methodTests.length; i++) {
            if (Modifier.isPublic(methodTests[i].getModifiers())) {
                if (methodTests[i].isAnnotationPresent(TestMethod.class)) {
                    if (String.valueOf(methodTests[i].getReturnType()).equals("void")) {
                        methods.add(methodTests[i]);
                    }
                }
            }
        }
        return methods;
    }
}
