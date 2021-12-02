package fr.lernejo.internal;
import fr.lernejo.tester.SomeLernejoTests;
import fr.lernejo.tester.internal.TestClassDescription;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class TestClassDescriptionLernejoTests {
    private final SomeLernejoTests lernejoTests;
    public TestClassDescriptionLernejoTests(SomeLernejoTests lernejoTest) {
        this.lernejoTests = lernejoTest;
    }
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClassDescription test = new TestClassDescription(SomeLernejoTests.class);
        test.listTestMethods();
    }
}
