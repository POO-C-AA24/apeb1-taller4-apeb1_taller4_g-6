
public class Producto {
    public double precioProd;
    public int cantidadProd;
    public double descuento;
    public double precioFinal;  

    public Producto(double precioProd, int cantidadProd) {
        this.precioProd = precioProd;
        this.cantidadProd = cantidadProd;
    }
    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }
    public int getCantidadProd() {
        return cantidadProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }
    public double CalcularDescuento(){
        if (precioProd >= 1000 && cantidadProd >= 10) {
            return   0.10;
        }else{
            return  0.05;
        }
    }
    public void CalcularPrecioFinal(){
        double calcu;
        double des;
        calcu = precioProd * cantidadProd;
        des  = calcu * CalcularDescuento();
        this.descuento = des;
        this.precioFinal = calcu - (this.descuento);
    }

    @Override
    public String toString() {
        return "Producto{" + "precioProd=" + precioProd + ", cantidadProd=" + cantidadProd + ", descuento=" + descuento + ", precioFinal=" + precioFinal + '}';
    }
    
    
}
