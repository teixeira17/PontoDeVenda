package br.com.vendas.model;

/**
 *
 * @author Lucas Teixeira
 */
public class Produtos {

    private int id;
    private String descricao;
    private double preco;
    private int qtdeEstoque;

    private Fornecedores forn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public Fornecedores getForn() {
        return forn;
    }

    public void setForn(Fornecedores forn) {
        this.forn = forn;
    }
}
