package studentguru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized=true;
}

    @AfterEach
    void afterEach(){
        System.out.println("Test Done; EasterEggConfirmation:");
    }
    @Test

    void practiceFromTest(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("gan1a1");
        $("#lastName").setValue("gan1a2");
        $("#userEmail").setValue("gan1a@test.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("7925000000");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1900");
        $x("//*[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend']").click();
        $("#subjectsContainer").find("input").setValue("Math").pressEnter();
        $("[for=hobbies-checkbox-2]").click();
        $("#uploadPicture").uploadFile(new File("myfilePackage" + File.separator + "test.jpg"));
        $("#currentAddress").setValue("Pushkina|Kolotushkina");
        $("#state").find("input").setValue("NCR").pressEnter();
        $("#city").find("input").setValue("Gurgaon").pressEnter();
        $("#submit").scrollTo().click();



        $(".modal-content").shouldBe(Condition.visible);



        $x("//td[text()='Student Name']/following-sibling::td").shouldHave(text("gan1a1 gan1a2"));
        $x("//td[text()='Student Email']/following-sibling::td").shouldHave(text("gan1a@test.com"));
        $x("//td[text()='Gender']/following-sibling::td").shouldHave(text("Male"));
        $x("//td[text()='Mobile']/following-sibling::td").shouldHave(text("7925000000"));
        $x("//td[text()='Date of Birth']/following-sibling::td").shouldHave(text("05 August,1900"));
        $x("//td[text()='Subjects']/following-sibling::td").shouldHave(text("Maths"));
        $x("//td[text()='Hobbies']/following-sibling::td").shouldHave(text("Reading"));
        $x("//td[text()='Picture']/following-sibling::td").shouldHave(text("test.jpg"));
        $x("//td[text()='Address']/following-sibling::td").shouldHave(text("Pushkina|Kolotushkina"));
        $x("//td[text()='State and City']/following-sibling::td").shouldHave(text("NCR Gurgaon"));





    }
}
