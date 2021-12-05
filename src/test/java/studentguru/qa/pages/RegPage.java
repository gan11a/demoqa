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
            GenderMale = $("[for=gender-radio-1]"),
            userNumberIn = $("#userNumber"),
            dayOfBirth = $("#dateOfBirthInput"),
            selectMonth = $(".react-datepicker__month-select"),
            selectYear = $(".react-datepicker__year-select"),
            selectDate = $x("//*[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend']"),
            Container = $("#subjectsContainer"),
            Hobbie2 = $("[for=hobbies-checkbox-2]"),
            uploadPicture = $("#uploadPicture"),
            Address = $("#currentAddress"),
            State = $("#state"),
            City = $("#city"),
            Submit = $("#submit"),
            checkModal = $(".modal-content"),
            checkNames = $x("//td[text()='Student Name']/following-sibling::td"),
            checkEmail = $x("//td[text()='Student Email']/following-sibling::td"),
            checkGender = $x("//td[text()='Gender']/following-sibling::td"),
            checkMobile = $x("//td[text()='Mobile']/following-sibling::td"),
            checkDOB = $x("//td[text()='Date of Birth']/following-sibling::td"),
            checkSubj = $x("//td[text()='Subjects']/following-sibling::td"),
            checkHobbie = $x("//td[text()='Hobbies']/following-sibling::td"),
            checkPic = $x("//td[text()='Picture']/following-sibling::td"),
            checkAddress = $x("//td[text()='Address']/following-sibling::td"),
            checkState = $x("//td[text()='State and City']/following-sibling::td");


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
    public void clickMaleGender(){
        GenderMale.click();
    }
    public void typeUserNumber(String value){
        userNumberIn.setValue(value);
    }
    public void clickBirthDay (){
        dayOfBirth.click();
    }
    public void selectMonth(){
        selectMonth.selectOption("August");
    }
    public void selectYear(){
        selectYear.selectOption("1900");
    }
    public void selectDate(){
        selectDate.click();
    }
    public void containerValue() {
        Container.find("input").setValue("Math").pressEnter();
    }
    public void selectHobbies2() {
        Hobbie2.click();
    }
    public void uploadPicture(String path) {
        uploadPicture.uploadFromClasspath(path);
    }
    public void typeAddress(String value) {
        Address.setValue(value);
    }
    public void chooseState() {
        State.find("input").setValue("NCR").pressEnter();
    }
    public void chooseCity() {
        City.find("input").setValue("Gurgaon").pressEnter();
    }
    public void clickSubmit() {
        Submit.scrollTo().click();
    }
    public void checkModal() {
        checkModal.shouldBe(Condition.visible);
    }
    public void checkNames(String value) {
        checkNames.shouldHave(text(value));
    }
    public void checkEmail(String value) {
        checkEmail.shouldHave(text(value));
    }
    public void checkGender() {
        checkGender.shouldHave(text("Male"));
    }
    public void checkMobile(String value) {
        checkMobile.shouldHave(text(value));
    }
    public void checkDateOfBirth() {
        checkDOB.shouldHave(text("05 August,1900"));
    }
    public void checkSubject() {
        checkSubj.shouldHave(text("Maths"));
    }
    public void checkHobbie() {
        checkHobbie.shouldHave(text("Reading"));
    }
    public void checkPicture() {
        checkPic.shouldHave(text("test.jpg"));
    }
    public void checkAddress(String value) {
        checkAddress.shouldHave(text(value));
    }
    public void checkState() {
        checkState.shouldHave(text("NCR Gurgaon"));
    }
}
