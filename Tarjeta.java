package facturas;
public class Tarjeta {
    private String Nombre;
    private int Id;
    private String Direccion;
    private int Telefono;
    
    public Tarjeta() {
        this.Nombre = "COTEL R.L";
        this.Id = 1020289021;
        this.Direccion = "AVENIDA MARISCAL SANTA CRUZ #980 ZONA CENTRAL";
        this.Telefono = 2372323;
    }

    //GETTERS PARA MOSTRAR EN FACTURA
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
