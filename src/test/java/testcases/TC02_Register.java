package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.RegisterationPage;

import static drivers.DriverHolder.getDriver;
import static util.UtilityCodes.generateRandomFirstName;
import static util.UtilityCodes.generateRandomPhoneNumber;

public class TC02_Register extends TestBase {

    static Faker faker = new Faker();
    String firstName = generateRandomFirstName();
    String lastName = faker.name().lastName();
    static String email ;
    String phone = generateRandomPhoneNumber();
    static String password ;  // Password length between 8 and 16 characters



    Homepage home;
    RegisterationPage register;

    @Test
    public void RegisterWithValidData_P() {
        email= faker.internet().emailAddress();
        password = faker.internet().password(8, 16);
        home = new Homepage(getDriver());
        register = new RegisterationPage(getDriver());
        home.GetRegisteration();
        register.Generatedata(firstName, phone, lastName, email, password, password);
        home.Getlogout();


    }


}
