import javax.swing.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JogoDAO {
    public  Connection conn;
    public JogoDAO() {
        String url = "jdbc:mysql://localhost/bancoteste?user=root&password=748596";
        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Conectado!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao" + erro.getMessage());
        }
    }
    public void adiciona(Jogo c) {
        String sql = "INSERT INTO Jogo(nome, descricao, criador) VALUES (?,?,?)";
        try {
            PreparedStatement stmt =
                    conn.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getDescricao());
            stmt.setString(3, c.getCriador());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     public List<Jogo> recuperarJogos(){
        List<Jogo> jogos = new LinkedList<Jogo>();
         String sql = "select * from jogo";
         try {
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                Jogo jogo = new Jogo();
                jogo.setNome(rs.getString("nome"));
                jogo.setDescricao(rs.getString("descricao"));
                jogo.setCriador(rs.getString("criador"));
                jogos.add(jogo);
             }
             stmt.close();
         } catch (SQLException u) {
             throw new RuntimeException(u);
         }

         return jogos;
     }
}
