package ui_tests;

import dto.User;
import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends ApplicationManager {

    @Test
    public void LoginPositiveTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnHeaderLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm("tony1256@gmail.com", "Password12345!");

    }

    @Test
    public void LoginNegativeTest(){
        User user = new User("tony@gmail.com", "Password12345!");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickBtnHeaderLogin();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginFormWithUser(user);
    }
}
