import Abstratc.Atributos;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Atributos carro = new Atributos("Gol", "preto", 2003);
        carro.ligar();
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano: " + carro.getAno());
        carro.desligar();

        Atributos carro2 = new Atributos("BMW", "preto", 2018);
        carro2.ligar();
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Ano: " + carro2.getAno());
        carro2.desligar();



    }
}