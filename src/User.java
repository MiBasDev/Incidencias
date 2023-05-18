/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase implementa un usuario da aplicación.
 *
 * @author Miguel Bastos Gándara.
 */
public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private int type;

    /**
     * Usuario estándar (valor 0) que só pode crear incidencias e ver as súas
     * incidencias.
     */
    public static final int USER = 0;

    /**
     * Usuario administrador (valor 1), que pode ver todas as incidencias,
     * cambiar o seu estado e resolvelas.
     */
    public static final int ADMIN = 1;

    /**
     * Constructor de clase User.
     *
     * @param username Login do usuario.
     * @param password Contrasinal do usuario.
     * @param name Nome real do usuario.
     * @param surname Apelidos do usuario.
     * @param type Tipo de usuario.
     */
    public User(String username, String password, String name, String surname, int type) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    /**
     * Devolve el login do usuario.
     *
     * @return Login do usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Cambia el login do usuario.
     *
     * @param username Login do usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Devolve o contrasinal do usuario.
     *
     * @return Contrasinal do usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Cambia o contrasinal do usuario.
     *
     * @param password Contrasinal do usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devolve o nome real do usuario.
     *
     * @return Nome real do usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * Camiba o nome real do usuario.
     *
     * @param name Nome real do usuario.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devolve os apelidos do usuario.
     *
     * @return Apelidos do usuario.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Cambia os apelidos do usuario.
     *
     * @param surname Apelidos do usuario.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Devolve o tipo de usuario.
     *
     * @return Tipo de usuario.
     */
    public int getType() {
        return type;
    }

    /**
     * Cambia o tipo de usuario.
     *
     * @param type Tipo de usuario.
     */
    public void setType(int type) {
        this.type = type;
    }

}
