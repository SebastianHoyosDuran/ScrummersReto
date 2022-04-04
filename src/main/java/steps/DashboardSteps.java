package steps;

import drivers.GoogleChromeDriver;
import pages.Dashboard;

public class DashboardSteps{

    public static void irCrearBlog() throws InterruptedException {
        /*
        Sleep para que lapagina termine de cargar
         */
        Thread.sleep(5000);
        GoogleChromeDriver.driver.findElement(Dashboard.btnGestionBlogs).click();
        Thread.sleep(5000);
        GoogleChromeDriver.driver.findElement(Dashboard.btnCrearBlog).click();
    }

}
