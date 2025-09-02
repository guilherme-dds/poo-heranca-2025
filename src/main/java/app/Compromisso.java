package app;

public class Compromisso extends Atividade {
    private String dataInicial;
    private String dataFinal;

    public String getDatainicial(){
        return dataInicial;
    }

    public void setDatainicial(String dataInicial){
        this.dataInicial = dataInicial;
    }

    public String getDatafinal(){
        return dataFinal;
    }

    public void setDatafinal(String dataFinal){
        this.dataFinal = dataFinal;
    }

    public Compromisso(long id, String descricao, String dataInicial, String dataFinal){
        this.setId(id);
        this.setDescricao(descricao);
        this.setDatainicial(dataInicial);
        this.setDatafinal(dataFinal);
    }
    
    public Compromisso(long id, String descricao, String dataInicial){
        this.setId(id);
        this.setDescricao(descricao);
        this.setDatainicial(dataInicial);
    }
}