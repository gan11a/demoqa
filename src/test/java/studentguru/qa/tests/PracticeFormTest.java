package studentguru.qa.tests;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import studentguru.qa.pages.RegPage;

public class PracticeFormTest extends TestBase{
    RegPage regPage = new RegPage();

    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    String userAddress = faker.address().streetAddress();

    @Test
    void practiceFromTest(){
        regPage.openPage();
        regPage.typeFirstName(firstName);
        regPage.typeLastName(lastName);
        regPage.typeUserEmail(userEmail);
        regPage.clickMaleGender();
        regPage.typeUserNumber(phoneNumber);
        regPage.clickBirthDay();
        regPage.selectMonth();
        regPage.selectYear();
        regPage.selectDate();
        regPage.containerValue();
        regPage.selectHobbies2();
        regPage.uploadPicture("images/test.jpg");
        regPage.typeAddress(userAddress);
        regPage.chooseState();
        regPage.chooseCity();
        regPage.clickSubmit();
        regPage.checkModal();
        regPage.checkNames(firstName + " " + lastName);
        regPage.checkEmail(userEmail);
        regPage.checkGender();
        regPage.checkMobile(phoneNumber);
        regPage.checkDateOfBirth();
        regPage.checkSubject();
        regPage.checkHobbie();
        regPage.checkPicture();
        regPage.checkAddress(userAddress);
        regPage.checkState();
    }
}
