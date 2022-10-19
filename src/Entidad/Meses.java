package Entidad;

public class Meses {
    private String[] meses={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto=meses[9];

    public Meses() {
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    
}
