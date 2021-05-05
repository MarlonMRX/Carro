
public class Carro {

    public static final String VERMELHO = "Cor do carro : Vermelho";
    public static final String PRETA = "Preta";
    public static final String NUMEROCHASSIS = "Numero do Chassis: 9BWSU19F08B302158";
    public static final String GASOLINA = "carro flex :Gasolina e alcool";
    public static final String ANO = "Fabricado em 2017";

    public void setCor(String cor) {
        System.out.println(cor);
    }
    public void setChassis(String chassis) {
        System.out.println(chassis);
    }
    public void setGasolina(String gasolina){
        System.out.println(gasolina);
    }

    public void setAno(String ano){
        System.out.println(ano);
    }

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer quantidadePortas;


    public Carro(Integer quantidadePneus) {
        setQuantidadePneus(quantidadePneus);
    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 2;



    }
    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;

    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void  setQuantidadePneus(Integer quantidadePneus){
        quantidadeCalotas = quantidadePneus;
        quantidadeParafusosPneus = quantidadePneus * 4;
        quantidadePortas = quantidadePneus;
        this.quantidadePneus = quantidadePneus;

    }


    public void imprimeValores() {
        System.out.println("Quantidade Pneus: " + getQuantidadePneus());
        System.out.println("Quantidade de calotas: " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos pneu: " + getQuantidadeParafusosPneus());
        System.out.println("Quantidade de portas: " + getQuantidadePortas());
    }

}
