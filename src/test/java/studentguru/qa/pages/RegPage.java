package studentguru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegPage {
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

    public void typeFirstName(String value){
        firstNameIn.setValue(value);
    }
    public void typeLastName(String value){
        lastNameIn.setValue(value);
    }
    public void typeUserEmail(String value){
        userEmailIn.setValue(value);
    }
    public void clickGender(){
        clGender.click();
    }
    public void typeUserNumber(String value){
        userNumberIn.setValue(value);
    }
    public void clickBD (){
        clBD.click();
    }
    public void selectMonth(){
        slctMonth.selectOption("August");
    }
    public void selectYear(){
        slctYear.selectOption("1900");
    }
    public void selectDate(){
        slctDate.click();
    }
    public void containerValue() {
        ctnrValue.find("input").setValue("Math").pressEnter();
    }
    public void checkHobbies() {
        chckHobbies.click();
    }
    public void uploadPic() {
        upldPic.uploadFile(new File("myfilePackage" + File.separator + "test.jpg"));
    }
    public void typeAddress(String value) {
        addressIn.setValue(value);
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
    public void checkNames() {chckNames.shouldHave(text("gan1a1 gan1a2"));}
    public void checkEmail() {chckEmail.shouldHave(text("gan1a@test.com"));}
    public void checkGender() {chckGender.shouldHave(text("Male"));}
    public void checkMobile() {chckMobile.shouldHave(text("7925000000"));}
    public void checkDOB() {chckDOB.shouldHave(text("05 August,1900"));}
    public void checkSubj() {chckSubj.shouldHave(text("Maths"));}
    public void checkHobbie() {chckHobbie.shouldHave(text("Reading"));}
    public void checkPic() {chckPic.shouldHave(text("test.jpg"));}
    public void checkAddress() {chckAddress.shouldHave(text("Pushkina|Kolotushkina"));}
    public void checkState() {chckAddress.shouldHave(text("NCR Gurgaon"));}

    //$x("//td[text()='State and City']/following-sibling::td").shouldHave(text("NCR Gurgaon"));
    //$x("//td[text()='Address']/following-sibling::td").shouldHave(text("Pushkina|Kolotushkina"));
    //$x("//td[text()='Picture']/following-sibling::td").shouldHave(text("test.jpg"));
    //$x("//td[text()='Hobbies']/following-sibling::td").shouldHave(text("Reading"));
    //$x("//td[text()='Subjects']/following-sibling::td").shouldHave(text("Maths"));
    //$x("//td[text()='Date of Birth']/following-sibling::td").shouldHave(text("05 August,1900"));
    //$x("//td[text()='Mobile']/following-sibling::td").shouldHave(text("7925000000"));
    //$x("//td[text()='Gender']/following-sibling::td").shouldHave(text("Male"));
    //$x("//td[text()='Student Email']/following-sibling::td").shouldHave(text("gan1a@test.com"));
    //$x("//td[text()='Student Name']/following-sibling::td").shouldHave(text("gan1a1 gan1a2"));
    //$(".modal-content").shouldBe(Condition.visible);
    //$("#submit").scrollTo().click();
    //$("#city").find("input").setValue("Gurgaon").pressEnter();
    //$("#state").find("input").setValue("NCR").pressEnter();
    //$("#currentAddress").setValue("Pushkina|Kolotushkina");
    //$("#uploadPicture").uploadFile(new File("myfilePackage" + File.separator + "test.jpg"));
    //$("[for=hobbies-checkbox-2]").click();
    //$("#subjectsContainer").find("input").setValue("Math").pressEnter();
    //$x("//*[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend']").click();
    //$(".react-datepicker__year-select").selectOption("1900");
    //$(".react-datepicker__month-select").selectOption("August");
    //$("#dateOfBirthInput").click();
    //$("#userNumber").setValue("7925000000");
    //$("#userEmail").setValue("gan1a@test.com");
    //$("[for=gender-radio-1]").click();
}
