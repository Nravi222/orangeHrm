
package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void testAddEmployee() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.goToAddEmployee();

        AddEmployeePage addEmp = new AddEmployeePage(driver);
        addEmp.addEmployee("John", "Doe", "john.doe01", "Pass1234!");

        Assert.assertTrue(addEmp.isProfileSaved(), "Employee profile not saved");

        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
}
