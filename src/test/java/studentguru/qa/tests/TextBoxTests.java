package studentguru.qa.tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized=true;
    }
    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");
        $("#userName").setValue("gan1a");
        $("#userEmail").setValue("gan1a@test.com");
        $("#currentAddress").setValue("Pushkina/Kolotushkina");
        $("#permanentAddress").setValue("Kolotushkina/Pushkina");
        $("#submit").click();
        $("#output #name").shouldHave(text("gan1a"));
        $("#output #email").shouldHave(text("gan1a@test.com"));
        $("#output #currentAddress").shouldHave(text("Pushkina/Kolotushkina"));
        $("#output #permanentAddress").shouldHave(text("Kolotushkina/Pushkina"));


    }
}
