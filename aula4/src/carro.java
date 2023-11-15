public class carro extends Veiculo{
    public carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public double CustoViagem(int distancia){
        return 0.20* distancia;
    }
}
