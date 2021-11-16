package unit_tests;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(groups = "mult test")
    public void checkSomething() {
        System.out.println("Hello World");
    }

    @Test(description = "Проверить что-то")
    public void checkSome() {
        System.out.println("I am the test method");
    }
}
