public class ClassMain {

    public static void main(String... args) {
        Carro carro = new Carro(4);
        carro.setCor(Carro.PRETA);
        carro.setChassis(Carro.NUMEROCHASSIS);
        carro.setGasolina(Carro.GASOLINA);
        carro.setAno(Carro.ANO);

        carro.imprimeValores();
    }
}

