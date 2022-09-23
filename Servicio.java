package facturas;
import java.util.Scanner;
public class Servicio {
    private String Tipo;
    private double Costo;

    public Servicio() {
        this.Tipo = "internet";
        this.Costo = 105;
    }
    public Servicio(double a) {
        this.Tipo = "llamada";
        this.Costo = a;
    }
    public Servicio(double a, double b) {
        this.Tipo = "tvcable";
        this.Costo = a + b;
    }
    
    //GETTERS PARA MOSTRAR
    //AYUDA PARA D
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    //AYUDA PARA D
    public double getCosto() {
        return Costo;
    }
    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    public void leer() {
        Scanner sc = new Scanner(System.in);
        this.Tipo = sc.nextLine();
        this.Costo = Double.parseDouble(sc.nextLine());
    }
    
    
}
