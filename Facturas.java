package facturas;
public class Facturas {
    public static void main(String[] args) {
        //Hecho por Luis Gabriel
        
        Factura fc1 = new Factura();
        Factura fc2 = new Factura(123);
        Factura fc3 = new Factura(123, 000);
        Factura fc4 = new Factura(321, 123, 456);
        Factura fc5 = new Factura(123, 123, 321, 321);

        //Para a) los que gastaron más en agosto 2022
        fc1.GastoFecha(fc2, fc3, fc4, fc5);

        //Para b) pepito torrez con dos facturas
        fc1.GastoMas(fc3);

        //Para c) comparar a pepito y carlitos en llamadas
        fc1.mayorinternet(fc2);

        //Para d) comparar gasto menos
        fc1.gastomenos(fc3, fc4);
        
        fc1.mostrar();
        fc2.mostrar();
        fc3.mostrar();
        fc4.mostrar();
        fc5.mostrar();
    }
}
