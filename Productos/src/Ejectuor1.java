
import java.util.Scanner;
public class Ejectuor1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto y la cantidad del producto: ");
        Producto producto1=new Producto(teclado.nextDouble(), teclado.nextInt());
            producto1.CalcularDescuento();
            producto1.CalcularPrecioFinal();
            System.out.println(producto1);
            
        }
}
