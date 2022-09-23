package facturas;
import java.util.Scanner;
import java.util.ArrayList;

public class Factura {
    private String Original;
    private int Nit;
    private int NroFactura;
    private int NroAutorizacion;
    private String Tipo;
    private String Periodo;
    private String FechaEmision;
    private String FechaDisposicion;
    private String FechaPago;
    private Contrato Usr;
    private Tarjeta Empresa;
    
    public Factura() {
        this.Original = "12*#@17";
        this.Nit = 1234567890;
        this.NroFactura = 123456;
        this.NroAutorizacion = 22000000;
        this.Tipo = "TELECOMUNICACIONES";
        this.Periodo = "05/2021";
        this.FechaEmision = "31-05-2022";
        this.FechaDisposicion = "31-05-2022";
        this.FechaPago = "28-06-2022";
        this.Usr = new Contrato();
        this.Empresa = new Tarjeta();
    }
    public Factura(int a) {
        this.Original = "1200*#@1227";
        this.Nit = a;
        this.NroFactura = 123456;
        this.NroAutorizacion = 22000000;
        this.Tipo = "TELECOMUNICACIONES";
        this.Periodo = "05/2021";
        this.FechaEmision = "22-05-2022";
        this.FechaDisposicion = "22-05-2022";
        this.FechaPago = "28-08-2021";
        this.Usr = new Contrato("pato");
        this.Empresa = new Tarjeta();
    }
    public Factura(int a, int b) {
        this.Original = "412*#@141";
        this.Nit = a;
        this.NroFactura = b;
        this.NroAutorizacion = 22000000;
        this.Tipo = "TELECOMUNICACIONES";
        this.Periodo = "05/2021";
        this.FechaEmision = "22-05-2022";
        this.FechaDisposicion = "22-05-2022";
        this.FechaPago = "28-08-2022";
        this.Usr = new Contrato("Pepito Torrez", "Pepito Torrez");
        this.Empresa = new Tarjeta();
    }
    public Factura(int a, int b, int c) {
        this.Original = String.valueOf(a+b)+"*#@"+String.valueOf(c);
        this.Nit = a;
        this.NroFactura = b;
        this.NroAutorizacion = c;
        this.Tipo = "TELECOMUNICACIONES";
        this.Periodo = "02/2021";
        this.FechaEmision = "10-04-2022";
        this.FechaDisposicion = "10-04-2022";
        this.FechaPago = "01-09-2022";
        this.Usr = new Contrato("Martin torrez", "Martin torrez", "Villa el carmen #123");
        this.Empresa = new Tarjeta();
    }
    public Factura(int a, int b, int c, int d) {
        this.Original = String.valueOf(a+b)+"*#@"+String.valueOf(c+d);
        this.Nit = a;
        this.NroFactura = b;
        this.NroAutorizacion = c;
        this.Tipo = "TELECOMUNICACIONES";
        this.Periodo = "01/2021";
        this.FechaEmision = "00-01-2022";
        this.FechaDisposicion = "00-01-2022";
        this.FechaPago = "12-02-2022";
        this.Usr = new Contrato("Zoila", "Serrano", "Zoila Serrano");
        this.Empresa = new Tarjeta();
    }

    public String getOriginal() {
        return Original;
    }

    public int getNit() {
        return Nit;
    }

    public int getNroFactura() {
        return NroFactura;
    }

    public int getNroAutorizacion() {
        return NroAutorizacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public String getFechaDisposicion() {
        return FechaDisposicion;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public Contrato getUsr() {
        return Usr;
    }

    public Tarjeta getEmpresa() {
        return Empresa;
    }
    
    
    
    public void leer() {
        Scanner sc = new Scanner(System.in);
        this.Original = sc.nextLine();
        this.Nit = sc.nextInt();
        this.NroFactura = sc.nextInt();
        this.NroAutorizacion = sc.nextInt();
        this.Tipo = sc.nextLine();
        this.Periodo = sc.nextLine();
        this.FechaEmision = sc.nextLine();
        this.FechaDisposicion = sc.nextLine();
        this.FechaPago = sc.nextLine();
        this.Usr = new Contrato(sc.nextLine(), sc.nextLine());
    }
    public void mostrar() {
        String mostrar = "";
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        mostrar +=
                "Original: " + this.Original + "\n" +
                "NIT: " + this.Nit + "\n" +
                "Numero de factura: " + this.NroFactura + "\n" +
                "Numero de autorizacion: " + this.NroAutorizacion + "\n" +
                this.Tipo + "\n" +
                "Periodo: " + this.Periodo + "\n" +
                "Fecha de emision: " + this.FechaEmision + "\n" +
                "Fecha de disposicion: " + this.FechaDisposicion + "\n" +
                "Fecha de pago: " + this.FechaPago;
        System.out.println(mostrar);
        System.out.println(">>>>>>>>>>>>>>>>Infromacion empresa-------------------");
        mostrar ="";
        mostrar += 
                this.Empresa.getNombre() + "\n" +
                this.Empresa.getId() + "\n" +
                "Dirección: " + this.Empresa.getDireccion() + "\n" +
                "Telefono: " + this.Empresa.getTelefono();
        System.out.println(mostrar);
        System.out.println(">>>>>>>>>>>>>>>>Informacion-Usr-----------------------");
        mostrar = "";
        mostrar +=
                "Nombre titular: " + this.Usr.getNomTitular() + "\n" +
                "Nombre a facturar: " + this.Usr.getNomFacturar() + "\n" +
                "NIT: " + this.Usr.getNit() + "\n" +
                "Codigo: " + this.Usr.getCodigo() + "\n" +
                "Direccion: " + this.Usr.getDireccion();
        System.out.println(mostrar);
        System.out.println(">>>>>>>>>>>>>>>>Gastos--------------------------------");
        mostrar = "";
        int costoTotal = 0;
        for(int i = 0; i < Usr.getServicios().size(); i++) {
            Servicio aux = Usr.getServicios().get(i);
            mostrar += aux.getTipo() + " :  " + aux.getCosto() +"\n";
            costoTotal += aux.getCosto();
        }
        mostrar += "Costo total: " + costoTotal;
        System.out.println(mostrar);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
    //METODO PARA INCISO B
    public void GastoFecha(Factura a, Factura b, Factura c, Factura d) {
        Factura list[] = new Factura[4];
        list[0] = a; list[1] = b; list[2] = c; list[3] = d;
        String Gastador = this.Usr.getNomTitular();
        double MayorGasto = monto();
        for(int i = 0; i < list.length; i++) {
            int mes = Integer.parseInt(list[i].FechaEmision.substring(4, 5));
            if (mes == 5 && MayorGasto < list[i].monto()) {
                MayorGasto = list[i].monto();
                Gastador = list[i].Usr.getNomTitular();
            }
        }
        System.out.println("El que más gastó es "+ Gastador +", con una cantidad de: "+ MayorGasto);
    }
    //METODO PARA INCISO C
    public void GastoMas(Factura a) {
        String mensaje = "El usuario: " + this.Usr.getNomTitular() + "gasto mas en : ";
        if (this.Usr.getNomTitular() == a.Usr.getNomTitular()) {
            if (monto() > a.monto()) {
                System.out.println(mensaje + a.getFechaEmision());
            } else {
                System.out.println(mensaje + this.FechaEmision);
            }
        }
    }
    //METODO PARA INCISO D
    public void mayorinternet(Factura a) {
        if (GastoServicio("internet") > a.GastoServicio("internet")) {
            System.out.println(this.Usr.getNomTitular() + "Consume mas internet");
        } else {
            System.out.println(a.getUsr().getNomTitular() + " Consume mas internet");
        }
    }
    //METODO PARA INCISO E
    public void gastomenos(Factura a, Factura b) {
        Factura list[] = new Factura[2];
        list[0] = a; list[1] = b;
        String Gastador = this.Usr.getNomTitular();
        String mes = this.FechaEmision;
        double MenorGasto = monto();
        for(int i = 0; i < list.length; i++) {
            if (MenorGasto > list[i].monto()) {
                MenorGasto = list[i].monto();
                Gastador = list[i].Usr.getNomTitular();
                mes = list[i].getFechaEmision();
            }
        }
        System.out.println("El que gasto menos es "+ Gastador +", con una cantidad de: "+ MenorGasto +" En el: "+ mes);
    }
    //APOYO PARA D
    public double GastoServicio(String a) {
        double gasto = 0;
        for (int i = 0; i < this.Usr.getServicios().size(); i++) {
            Servicio aux = this.Usr.getServicios().get(i);
            if (aux.getTipo() == a) {
                gasto += aux.getCosto();
            }
        }
        return gasto;
    }
    //AYUDA PARA B, C Y E
    public double monto() {
        double monto = 0;
        for (int i = 0; i < this.Usr.getServicios().size(); i++) {
            monto += this.Usr.getServicios().get(i).getCosto();
        }
        return monto;
    }
}
