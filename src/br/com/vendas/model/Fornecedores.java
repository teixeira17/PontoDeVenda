package br.com.vendas.model;

/**
 *
 * @author Lucas Teixeira
 */
public class Fornecedores extends Clientes {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }

}
