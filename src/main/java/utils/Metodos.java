package utils;

import drivers.GoogleChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Metodos {

    public static void resaltarElemento(String elemento){
        JavascriptExecutor js = ((JavascriptExecutor) GoogleChromeDriver.driver);
        js.executeScript(("arguments[0].style.border='3px solid red'"),elemento);
    }


}
