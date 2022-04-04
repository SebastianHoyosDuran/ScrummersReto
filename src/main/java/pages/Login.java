package pages;

import org.openqa.selenium.By;

public class Login {

    public static By txtEmail = By.xpath("/html/body/fury-root/fury-login/div/div/div[2]/div/mat-form-field[1]/div/div[1]/div/input");
    public static By txtPassword = By.xpath("/html/body/fury-root/fury-login/div/div/div[2]/div/mat-form-field[2]/div/div[1]/div[1]/input");
    public static By btnLogin = By.xpath("//div//button//span[text()=' Log In ']");
}
