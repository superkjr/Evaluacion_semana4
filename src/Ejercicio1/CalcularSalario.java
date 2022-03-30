package Ejercicio1;

public class CalcularSalario {
    double HorasTrabajadas, PagoHora;

    public CalcularSalario() {
    }

    public CalcularSalario(double HorasTrabajadas, double PagoHora) {
        this.HorasTrabajadas = HorasTrabajadas;
        this.PagoHora = PagoHora;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(double HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public double getPagoHora() {
        return PagoHora;
    }

    public void setPagoHora(double PagoHora) {
        this.PagoHora = PagoHora;
    }
    
    double CalcularSalarioTrabajador(){
        double salario = 0;
        double HorasDos;
        double HorasTres;
        
        if (this.HorasTrabajadas <=40){
            salario = this.HorasTrabajadas * this.PagoHora;
            return salario;
        } else if (this.HorasTrabajadas > 40 && this.HorasTrabajadas < 48){
            HorasDos = this.HorasTrabajadas - 40;
            salario = (40 * this.PagoHora) + (HorasDos * this.PagoHora * 2);
            return salario;
        } else if (this.HorasTrabajadas > 48){
            HorasTres = this.HorasTrabajadas - 48;
            salario = (40 * this.PagoHora) + (8 * this.PagoHora * 2) +(HorasTres * this.PagoHora * 3);
            return salario;
        }
            return salario;
    }
    
    double Renta(CalcularSalario salario){
        double R;
        salario.CalcularSalarioTrabajador();
        R = salario.CalcularSalarioTrabajador() * 10;
        return R;
    }
    
    double SalarioLiquido(CalcularSalario Sliquido){
        double Salarioliquido;
        
        Salarioliquido =Sliquido.CalcularSalarioTrabajador() - Sliquido.Renta(Sliquido);
        return Salarioliquido;
    }
}
