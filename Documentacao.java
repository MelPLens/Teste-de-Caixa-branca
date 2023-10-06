/**
 * A classe User é responsável por lidar com a autenticação de usuários em um sistema.
 * Ela se conecta a um banco de dados MySQL para verificar as credenciais do usuário.
 * A autenticação é feita por meio do método verificarUsuario, que verifica se o login
 * e senha fornecidos correspondem a um registro de usuário no banco de dados.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class User {
    /**
     * Método conectarBD() estabelece uma conexão com o banco de dados MySQL.
     * Retorna a conexão estabelecida ou null se houver um erro na conexão.
     *
     * @return Uma conexão com o banco de dados ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;

        try {
            /* Carrega o driver do MySQL*/
            Class.forName("com.mysql.Driver.Manager").newInstance();
            /* Define a URL de conexão ao banco de dados*/
            String url = "jdbc:mysql://127.0.0.1/test7user=lopes&password=123";
            /* Estabelece a conexão com o banco de dados*/
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            /* Manipula exceções relacionadas à conexão com o banco de dados*/
        }
        return conn;
    }

    /**
     * Variáveis de instância para armazenar o nome do usuário e o resultado da autenticação.
     */
    public String nome = "";
    public boolean result = false;

    /**
     * Método verificarUsuario verifica as credenciais do usuário.
     * Ele monta uma consulta SQL para procurar um usuário com um login e senha correspondentes
     * no banco de dados e atualiza as variáveis de instância "result" e "nome" da public boolean e String de acordo com o resultado.
     *
     * @param login O login do usuário a ser verificado.
     * @param senha A senha do usuário a ser verificada.
     * @return true se as credenciais forem válidas, caso contrário, false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        /*Monta a instrução SQL para verificar o usuário, como o nome,login e senha*/
        sql += "select nome from usuario";
        sql += "where login = + "'" + login + "'";
        sql += "and senha = + "'" + senha + "'";

        try {
            Statement st = conn.createStatement();
            /* Executa a consulta SQL*/
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                /* Se a consulta retornar algum resultado, atualiza as variáveis*/
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            /** Manipula exceções relacionadas à execução da consulta SQL**/
        }
        return result;
    }
} /** fim da classe**/
