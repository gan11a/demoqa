package studentguru.qa.docs;

import org.junit.jupiter.api.*;

public class JUnitExamples {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all worlds!");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After All Worlds!");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before World!");
    }
    @AfterEach
    void afterEach(){
        System.out.println("After World!");
    }
    @Test
    void firstTest() {
        System.out.println("Hello World");
    }
    @Test
    void secondTest() {System.out.println("Hello World (second)");}
}
