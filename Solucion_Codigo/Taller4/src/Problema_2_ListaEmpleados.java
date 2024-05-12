public class Problema_2_ListaEmpleados {
    public static void main(String[] args) {
        Problema_2_Empleado obj=new Problema_2_Empleado();
        int n;
        do{
            n = obj.ListaOpciones();
            switch (n){
                case 1: obj.agregarEmpleado();
                        break;
                case 2: obj.MostrarInfEmpleados();
                        break;
                case 3: obj.CalcularSalario();
                        break;
                default: break;
            }
        }while(n != 0);
    }
}
