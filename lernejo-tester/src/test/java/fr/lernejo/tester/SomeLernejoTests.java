package fr.lernejo.tester;
import fr.lernejo.tester.api.TestMethod;

import java.lang.IllegalStateException;
public class SomeLernejoTests {
    @TestMethod
    public void ok() {

    }
    @TestMethod
    public void ko() throws IllegalStateException {
        throw new IllegalStateException("C'est K.O");
    }
    public void none() {

    }
}
