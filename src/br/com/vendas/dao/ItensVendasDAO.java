package br.com.vendas.dao;

import br.com.vendas.jdbc.ConnectionFactory;
import br.com.vendas.model.ItemVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Teixeira
 */
public class ItensVendasDAO {

    private Connection con;

    public ItensVendasDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //cadastrar itens
    public void cadastrarItem(ItemVenda obj) {
        try {
            String sql = "insert into tb_itensvendas(venda_id, produto_id, qtd, subtotal) values (?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtde());
            stmt.setDouble(4, obj.getSubtotal());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
}
