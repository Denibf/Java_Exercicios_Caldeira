package exercicio_OO;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class ContaBancaria {
        private String nometitular;
        private int cpf;
        private String banco;
        private int identificadorConta;
        private String endereco;
        private double saldo;
        private LocalDateTime horarioatual;

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getHorarioatual() {
        return horarioatual;
    }

    public void setHorarioatual(LocalDateTime horarioatual) {
        this.horarioatual = horarioatual;
    }

    public String Sacar(double valor){
        if (valor<saldo){
            saldo = saldo - valor;
            return "Saque realizado";
        }else{
            return "Saldo indisponivel";
        }
    }
    public double Depositar(double valor){
        saldo= saldo + valor;
        return saldo;
    }

}
