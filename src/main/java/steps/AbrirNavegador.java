package steps;

import drivers.GoogleChromeDriver;

public class AbrirNavegador {

    public static void abrirNavegador(){

        //Se abre el navegador con la configuracion del metodo
        GoogleChromeDriver.ChromeDriver("https://dev.tutranqui.travel/login");
    }

}
