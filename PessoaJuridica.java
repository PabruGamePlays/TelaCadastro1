package Classe_Pessoas;

import Classe_Pessoas.Pessoa;

public class PessoaJuridica extends Pessoa{
    
    private String CNPJ;
    private String tipo;
    
    public PessoaJuridica(){
    
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
