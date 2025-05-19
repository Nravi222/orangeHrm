
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
    private WebDriver driver;

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By chkLogin = By.id("chkLogin");
    By username = By.id("user_name");
    By password = By.id("user_password");
    By confirmPassword = By.id("re_password");
    By saveBtn = By.id("btnSave");

    public void addEmployee(String fName, String lName, String user, String pass) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(chkLogin).click();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(saveBtn).click();
    }

    public boolean isProfileSaved() {
        return driver.findElement(By.id("personal_txtEmpFirstName")).isDisplayed();
    }
}
