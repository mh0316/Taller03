import java.util.Scanner;

public class CuadernoUniversitario {
    public String Escriba;
    public String ArrancaHojas;

    private String getEscribir(){
        Scanner leer = new Scanner(System.in);
        int escritura;
        System.out.println("Escriba algo: ");
        escritura = leer.nextInt();
        return Escriba;
    }

    public void setEscrbir(String Escribir){
        this.Escriba = Escriba;
    }

    private String getArrancarHojas(){
        return ArrancaHojas;
    }

    public void setArrancarHojas(String ArrancatHojas){
        this.ArrancaHojas = ArrancaHojas;
    }
}
