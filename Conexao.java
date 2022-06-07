import javax.swing.*;
import java.sql.*;
import java.util.List;

public class Conexao {
    /*

    public static Connection conn;
    public static void createTable(){


        String sql = "CREATE TABLE ( " +
                "email varchar(30), telefone varchar(30), " +
                "nome varchar(30) )";
        PreparedStatement stmt;
        try {
        stmt = conn.prepareStatement(sql);
        stmt.execute();
        stmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void Inserircontato(){

        String sql = "INSERT INTO contato(nome,email, telefone) VALUES(?,?, ?)";

        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "carlos");
        stmt.setString(2, "carlosdiel16@gmail.com");
        stmt.setString(3, "123");
        stmt.execute();
        stmt.close();
        System.out.print("inserido");
    } catch (SQLException e){
        e.printStackTrace();
        }
    }
    public static void PrintContato(){

        String sql = "select * from contato";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Nome:"+rs.getString("nome"));
                System.out.println("Email:"+rs.getString("email"));
            }
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
    /*
     */
/*
    public static Connection conn;
    public static void createTable(){
    String sql = "CREATE TABLE jogo( " +
            "nome varchar(30), descricao varchar(30), " +
            "criador varchar(30) )";
    PreparedStatement stmt;

        try {
        stmt = conn.prepareStatement(sql);
        try {
            stmt.execute();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        try {
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    } catch (SQLException e){
        e.printStackTrace();
    }
    }
    /*
 */
    public static void main (String[] args){
        JogoDAO dao = new JogoDAO();
        Jogo Jogo = new Jogo("The last of us", "Jogo de terror", "Jacob Minkoff");
        List<Jogo> jogos = dao.recuperarJogos();
        for (Jogo jogo : jogos){
            System.out.println(jogo);

        }
        /*
        String url = "jdbc:mysql://localhost/bancoteste?user=root&password=748596";
        try{
        conn = (Connection) DriverManager.getConnection(url);
        System.out.println("Conectado!");
        //createTable();
            //Inserircontato();
            PrintContato();
        conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexao" + erro.getMessage());
        }

         */
    }


}


