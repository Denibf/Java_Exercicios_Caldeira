public class moto extends Veiculo{

    public moto (String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public double CustoViagem(int distancia){
        return 0.15* distancia;
    }

}
