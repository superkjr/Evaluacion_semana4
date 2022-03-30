package Ejercicio2;


public class area {

    void setCarea(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnombre(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCEmpleado(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNEdificio(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String DatosA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Area  {

    String nombre;
    int Area, Empleado, Edificio;

    public Area() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCArea() {
        return Area;
    }

    public void setCArea(int CArea) {
        this.Area = CArea;
    }

    public int getCEmpleado() {
        return Empleado;
    }

    public void setCEmpleado(int CEmpleado) {
        this.Empleado = CEmpleado;
    }

    public int getNEdificio() {
        return Edificio;
    }

    public void setNEdificio(int NEdificio) {
        this.Edificio = NEdificio;
    }
String DatosA (){
  String  Inf = "";
  Inf +="El codigo de Area es:" + Area  +"\n";
  Inf +="El nombre del Area es:" + nombre +"\n";
  Inf +="La cantidad de empleados es:" + Empleado +"\n";
  Inf +="La cantidad de edificios es: " + Edificio +"\n";
  return Inf;
}

    
}

}
