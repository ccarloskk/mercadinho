import dao.ConexaoBD;
import dao.VendasBD;
import model.Produtos;
import model.Vendas;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConexaoBD.getConnection();
        Vendas venda1 = new Vendas(connection);

        venda1.adicionarAoCarrinho(5);
    }
}