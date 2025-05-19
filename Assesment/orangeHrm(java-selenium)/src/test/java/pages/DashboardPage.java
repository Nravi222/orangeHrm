
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By pimMenu = By.id("menu_pim_viewPimModule");
    By addEmpMenu = By.id("menu_pim_addEmployee");

    public void goToAddEmployee() {
        driver.findElement(pimMenu).click();
        driver.findElement(addEmpMenu).click();
    }
}
