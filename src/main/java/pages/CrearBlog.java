package pages;

import org.openqa.selenium.By;

public class CrearBlog {

    public static By txtTiutlo = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[1]/input");
    public static By txtSubtitutlo = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[2]/input");
    public static By txtParrafo = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/quill-editor/div[2]/div[1]/p");
    public static By cbxMotivacionMenu = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[4]/select");
    public static By cbxMotivacionOpcion = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[4]/select/option[1]");
    public static By cbxEtiquetaMenu = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[5]/mat-select");
    public static By cbxEtiquetaOpcion = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span");
    public static By btnGuardar = By.xpath("/html/body/fury-root/fury-layout/mat-drawer-container/mat-drawer-content/div/div/div/fury-entrada-blog/div/div[5]/div[6]/button");
    public static By lblErrorMensaje = By.xpath("/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar/span");

}
