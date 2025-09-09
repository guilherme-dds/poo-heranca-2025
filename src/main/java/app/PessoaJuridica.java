package app;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String exbibirInformações(){
        return getNomeFantasia() + " | " + getCnpj();
    }
}