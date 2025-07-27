package Abstratc;

public class Atributos extends Carro {
    public Atributos(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + getModelo() + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + getModelo() + " está desligado.");
    }
}
