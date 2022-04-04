package steps;

import drivers.GoogleChromeDriver;
import pages.Login;


public class LoginSteps {

    public static void loguearse() throws InterruptedException {
        /*
        Se hace una espera para que carge la pagina
        Se ingresa la informacion
         */
        Thread.sleep(3000);
        GoogleChromeDriver.driver.findElement(Login.txtEmail).sendKeys("daniel@scrummers.co");
        GoogleChromeDriver.driver.findElement(Login.txtPassword).sendKeys("1234");
        GoogleChromeDriver.driver.findElement(Login.btnLogin).click();
    }


}
