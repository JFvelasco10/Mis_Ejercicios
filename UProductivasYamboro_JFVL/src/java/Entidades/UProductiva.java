/* Autor: Julian Felipe Velasco Lopez */
package Entidades;

public class UProductiva {

    public float getCodigo() {
        return Codigo;
    }

    public void setCodigo(float Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public float getTotalProduccion() {
        return TotalProduccion;
    }

    public void setTotalProduccion(float TotalProduccion) {
        this.TotalProduccion = TotalProduccion;
    }

    public float getPProduccion() {
        return PProduccion;
    }

    public void setPProduccion(float PProduccion) {
        this.PProduccion = PProduccion;
    }
    private float Codigo;
    private String Nombre;
    private String Producto;
    private float Cantidad;
    private float Precio;
    private String Fecha;
    private float  TotalProduccion;
    private float  PProduccion;

    
    
}
