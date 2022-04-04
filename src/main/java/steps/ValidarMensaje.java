package steps;

import drivers.GoogleChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CrearBlog;

public class ValidarMensaje {

    public static void validarMensaje(){
        GoogleChromeDriver.driver.findElement(CrearBlog.btnGuardar).click();

        //Espera implicita
        WebDriverWait wait  = new WebDriverWait(GoogleChromeDriver.driver , 60 * 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CrearBlog.lblErrorMensaje));
        Assert.assertEquals("No es el mismo","Error al tratar de agregar el Post" , GoogleChromeDriver.driver.findElement(CrearBlog.lblErrorMensaje).getText());
        //Cerrar Navegador
        GoogleChromeDriver.driver.quit();
    }

}

