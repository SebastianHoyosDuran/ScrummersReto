package steps;

import drivers.GoogleChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CrearBlog;


public class CrearBlogSteps {

    public  static void crearBlog () throws InterruptedException {
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor)GoogleChromeDriver.driver ;
        js.executeScript("window.scrollBy(0,500)");

        //Rellenar informacion
        GoogleChromeDriver.driver.findElement(CrearBlog.txtTiutlo).sendKeys("Esto es un titulo de prueba");
        GoogleChromeDriver.driver.findElement(CrearBlog.txtSubtitutlo).sendKeys("Esto es un subtitulo de prueba");
        GoogleChromeDriver.driver.findElement(CrearBlog.txtParrafo).sendKeys("Esto es un Parrafo de prueba");
        js.executeScript("window.scrollBy(0,200)");

    }

}
