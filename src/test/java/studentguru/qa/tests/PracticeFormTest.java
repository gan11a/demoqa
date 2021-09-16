package studentguru.qa.tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import jdk.nashorn.internal.runtime.RewriteException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import studentguru.qa.pages.RegPage;

import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class PracticeFormTest extends TestBase{
    RegPage regPage = new RegPage();
    @Test
    void practiceFromTest(){
        regPage.openPage();
        regPage.typeFirstName();
        regPage.typeLastName();
        regPage.typeUserEmail();
        regPage.clickGender();
        regPage.typeUserNumber();
        regPage.clickBD();
        regPage.selectMonth();
        regPage.selectYear();
        regPage.selectDate();
        regPage.containerValue();
        regPage.checkHobbies();
        regPage.uploadPic();
        regPage.typeAddress();
        regPage.chooseState();
        regPage.chooseCity();
        regPage.clickSubmit();
        regPage.checkModal();
        regPage.checkNames();
        regPage.checkEmail();
        regPage.checkGender();
        regPage.checkMobile();
        regPage.checkDOB();
        regPage.checkSubj();
        regPage.checkHobbie();
        regPage.checkPic();
        regPage.checkAddress();
        regPage.checkState();
    }
}
