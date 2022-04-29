package Atributos_e_Metodos_Estaticos.Exercicios01_e_02;

public class Main {

    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea.medida= 8250;
        System.out.println(ConversaoDeUnidadesDeArea.metroPes() + " pés quadrados.");
        System.out.println(ConversaoDeUnidadesDeArea.pesCentimetros() + " centimetros quadrados.");
        System.out.println(ConversaoDeUnidadesDeArea.milhaAcre() + " acres.");
    }

}
