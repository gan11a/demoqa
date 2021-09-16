package studentguru.qa.pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class RegPage {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    String userAddress = faker.address().streetAddress();
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameIn = $("#firstName"),
            lastNameIn = $("#lastName"),
            userEmailIn = $("#userEmail"),
            clGender = $("[for=gender-radio-1]"),
            userNumberIn = $("#userNumber"),
            clBD = $("#dateOfBirthInput"),
            slctMonth = $(".react-datepicker__month-select"),
            slctYear = $(".react-datepicker__year-select"),
            slctDate = $x("//*[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend']"),
            ctnrValue = $("#subjectsContainer"),
            chckHobbies = $("[for=hobbies-checkbox-2]"),
            upldPic = $("#uploadPicture"),
            addressIn = $("#currentAddress"),
            chsState = $("#state"),
            chsCity = $("#city"),
            clSubmit = $("#submit"),
            chckModal = $(".modal-content"),
            chckNames = $x("//td[text()='Student Name']/following-sibling::td"),
            chckEmail = $x("//td[text()='Student Email']/following-sibling::td"),
            chckGender = $x("//td[text()='Gender']/following-sibling::td"),
            chckMobile = $x("//td[text()='Mobile']/following-sibling::td"),
            chckDOB = $x("//td[text()='Date of Birth']/following-sibling::td"),
            chckSubj = $x("//td[text()='Subjects']/following-sibling::td"),
            chckHobbie = $x("//td[text()='Hobbies']/following-sibling::td"),
            chckPic = $x("//td[text()='Picture']/following-sibling::td"),
            chckAddress = $x("//td[text()='Address']/following-sibling::td"),
            chckState = $x("//td[text()='State and City']/following-sibling::td");

    private String FORM_TITLE = "Student Registration Form";
    public void openPage(){
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }
    public void typeFirstName(){firstNameIn.setValue(firstName);}
    public void typeLastName(){lastNameIn.setValue(lastName);}
    public void typeUserEmail(){userEmailIn.setValue(userEmail);}
    public void clickGender(){
        clGender.click();
    }
    public void typeUserNumber(){
        userNumberIn.setValue(phoneNumber);
    }
    public void clickBD (){
        clBD.click();
    }
    public void selectMonth(){
        slctMonth.selectOption("August");
    }
    public void selectYear(){slctYear.selectOption("1900");}
    public void selectDate(){
        slctDate.click();
    }
    public void containerValue() {
        ctnrValue.find("input").setValue("Math").pressEnter();
    }
    public void checkHobbies() {chckHobbies.click();}
    public void uploadPic() {
        upldPic.uploadFile(new File("myfilePackage" + File.separator + "test.jpg"));
    }
    public void typeAddress() {
        addressIn.setValue(userAddress);
    }
    public void chooseState() {
        chsState.find("input").setValue("NCR").pressEnter();
    }
    public void chooseCity() {
        chsCity.find("input").setValue("Gurgaon").pressEnter();
    }
    public void clickSubmit() {
        clSubmit.scrollTo().click();
    }
    public void checkModal() {
        chckModal.shouldBe(Condition.visible);
    }
    public void checkNames() {chckNames.shouldHave(text(firstName + " " + lastName));}
    public void checkEmail() {chckEmail.shouldHave(text(userEmail));}
    public void checkGender() {chckGender.shouldHave(text("Male"));}
    public void checkMobile() {chckMobile.shouldHave(text(phoneNumber));}
    public void checkDOB() {chckDOB.shouldHave(text("05 August,1900"));}
    public void checkSubj() {chckSubj.shouldHave(text("Maths"));}
    public void checkHobbie() {chckHobbie.shouldHave(text("Reading"));}
    public void checkPic() {chckPic.shouldHave(text("test.jpg"));}
    public void checkAddress() {chckAddress.shouldHave(text(userAddress));}
    public void checkState() {chckState.shouldHave(text("NCR Gurgaon"));}
}
