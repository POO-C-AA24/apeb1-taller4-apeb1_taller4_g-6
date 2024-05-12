import java.util.Scanner;
public class Problema_2_Empleado {
    Scanner entrada;
    String[] nombre;
    double[] salario;
    int[] edad;
    int nEmpleado=0;
    double porcentaje, promedio;
    
    public Problema_2_Empleado(){
        this.entrada = new Scanner(System.in);
        this.nombre = new String[10];
        this.salario = new double[10];
        this.edad = new int[10];
    }
    
    public int ListaOpciones(){
        System.out.println("\nAgregar un Empleado                  [1]:");
        System.out.println("Mostrar informacion de los empleados [2]:");
        System.out.println("Calcular aumento de salario          [3]:");
        System.out.println("Salir                                [0]:\n");
        return entrada.nextInt();
    }
    
    public void agregarEmpleado(){
        System.out.println("\nIngrese el nombre del Empleado "+(nEmpleado+1)+":");
        nombre[nEmpleado]=entrada.next();
        System.out.println("Ingrese el salario del Empleado:");
        salario[nEmpleado]=entrada.nextDouble();
        System.out.println("Ingrese la edad del Empleado:");
        edad[nEmpleado]=entrada.nextInt();
        nEmpleado++;
    }
    
    public void MostrarInfEmpleados(){
        System.out.println(this);
    }
    
    public void CalcularSalario(){
        System.out.println("Ingrese el porcentaje de aumento salarial que desea asignar: (0 a 100)%");
        porcentaje=entrada.nextDouble();
        salarioPromedio();
        System.out.println("Empleados a los que se les actualizo el salario: ");
        for (int i = 0; i < nEmpleado; i++) {
            if (salario[i]<promedio) {
                salario[i]=salario[i]+(salario[i]*(porcentaje/100));
                System.out.println(this);
            }
        }
    }
    
    public void MostrarDatosEmpleado(int i){
        System.out.println("\nEmpleado "+(i+1));
        System.out.println("\nNombre: "+nombre[i]+"\nSalario: "+salario[i]+"\nEdad: "+edad[i]);
    }
    
    public double salarioPromedio(){
        promedio=0;
        for (int i = 0; i < nEmpleado; i++) {
            promedio=promedio+salario[i];
        }
        promedio=promedio/nEmpleado;
        return promedio;
    }
    
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\nInformación de los empleados:\n");
    for (int i = 0; i < nEmpleado; i++) {
        sb.append("\nEmpleado ").append(i + 1).append("\n");
        sb.append("Nombre: ").append(nombre[i]).append("\n");
        sb.append("Salario: ").append(salario[i]).append("\n");
        sb.append("Edad: ").append(edad[i]).append("\n");
    }
    return sb.toString();
}
    
}
