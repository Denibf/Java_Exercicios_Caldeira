public abstract class Veiculo {
    //atributos
    public     String  marca;
    public     String modelo;
    public     int ano;

    public  Veiculo (String marca, String modelo, int ano){
    this.marca = marca;
    this.ano = ano;
    this.modelo = modelo;
    }



    public abstract double CustoViagem(int distancia);

    //get e set//

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano= ano;
    }




}



