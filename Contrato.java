package facturas;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Contrato {
    private String NomTitular;
    private String NomFacturar;
    private int Nit;
    private int Codigo;
    private String Direccion;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    
    public Contrato() {
        this.NomTitular = "Pepito Torrez";
        this.NomFacturar = "Pepito Torrez";
        this.Nit = 123456;
        this.Codigo = 12345678;
        this.Direccion = "ED Italia Piso 5 Dpto. B. Miraflores";
        this.servicios.add(new Servicio());
        this.servicios.add(new Servicio(42));
    }
    public Contrato(String a) {
        this.NomTitular = "Carlitos Perez";
        this.NomFacturar = "Carlitos Perez";
        this.Nit = 243154;
        this.Codigo = 84120040;
        this.Direccion = "Calle falsa #123";
        this.servicios.add(new Servicio());
        this.servicios.add(new Servicio(200000));
    }
    public Contrato(String a, String b) {
        Random rdm = new Random();
        this.NomTitular = a;
        this.NomFacturar = b;
        this.Nit =  rdm.nextInt(12000000) + 80000000;
        this.Codigo = rdm.nextInt(990000) + 800000;
        this.Direccion = "Zona burbuja calle real #1";
        this.servicios.add(new Servicio());
        this.servicios.add(new Servicio(1));
        this.servicios.add(new Servicio(100, 300));
    }
    public Contrato(String a, String b, String c) {
        Random rdm = new Random();
        this.NomTitular = a;
        this.NomFacturar = b;
        this.Nit =  rdm.nextInt(12000000) + 80000000;
        this.Codigo = rdm.nextInt(990000) + 800000;
        this.Direccion = c;
        this.servicios.add(new Servicio());
        this.servicios.add(new Servicio(20));
        this.servicios.add(new Servicio(30, 30));
    }
    public Contrato(String a, String b, String c, String d) {
        Random rdm = new Random();
        this.NomTitular = "Samuel Diaz";
        this.NomFacturar = a+b;
        this.Nit =  rdm.nextInt(12000000) + 80000000;
        this.Codigo = rdm.nextInt(990000) + 800000;
        this.Direccion = c+d;
        this.servicios.add(new Servicio());
        this.servicios.add(new Servicio(13));
        this.servicios.add(new Servicio(10, 43));
    }
    //GETTERS PARA MOSTRAR
    //AYUDA PARA B, C Y E
    public String getNomTitular() {
        return NomTitular;
    }
    public void setNomTitular(String NomTitular) {
        this.NomTitular = NomTitular;
    }
    public String getNomFacturar() {
        return NomFacturar;
    }
    public void setNomFacturar(String NomFacturar) {
        this.NomFacturar = NomFacturar;
    }
    public int getNit() {
        return Nit;
    }
    public void setNit(int Nit) {
        this.Nit = Nit;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    //AYUDA PARA D
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }
    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void agregarservicio() {
        Servicio aux = new Servicio();
        aux.leer();
        this.servicios.add(aux);
    }
    public void quitarservicio() {
        Scanner sc = new Scanner(System.in);
        String nomsrv = sc.nextLine();
        for (int i = 0; i < servicios.size(); i++) {
            if (nomsrv == servicios.get(i).getTipo()) {
                this.servicios.remove(i);
                break;
            }
        }
    }
}
