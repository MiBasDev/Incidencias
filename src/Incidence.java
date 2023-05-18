/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa unha incidencia que se produciu no sistema.
 *
 * @author Miguel Bastos Gándara.
 */
public class Incidence {

    private int id;
    private String description;
    private String computer;
    private String resolution;
    private int status;
    private User sender;

    /**
     * Terá o valor 0, e será o que ten unha incidencia que está sen resolver.
     */
    public static final int STATUS_UNSOLVED = 0;

    /**
     * Terá o valor 1, e será o que ten no estado unha incidencia que está
     * pendente da solución.
     */
    public static final int STATUS_PENDING = 1;

    /**
     * Ten o valor 2, e será o estado dunha incidencia xa resolta.
     */
    public static final int STATUS_SOLVED = 2;

    /**
     * Constructor da clase Incidence.
     *
     * @param id Identificador da incidencia.
     * @param description Descrición do problema.
     * @param computer Nome do equipo relacionado coa incidencia.
     * @param resolution Descrición da solución da incidencia.
     * @param status Estado da incidencia.
     * @param sender Usuario que xenerou a incidencia.
     */
    public Incidence(int id, String description, String computer, String resolution, int status, User sender) {
        this.id = id;
        this.description = description;
        this.computer = computer;
        this.resolution = resolution;
        this.status = status;
        this.sender = sender;
    }

    /**
     * Devolve o identificador da incidencia.
     *
     * @return Identificador da incidencia.
     */
    public int getId() {
        return id;
    }

    /**
     * Cambia o identificador da incidencia.
     *
     * @param id Identificador da incidencia.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devolve a descrición do problema.
     *
     * @return Descrición do problema.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Cambia a descrición do problema.
     *
     * @param description Descrición do problema.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Devolve o nome do equipo relacionado coa incidencia.
     *
     * @return Nome do equipo relacionado coa incidencia.
     */
    public String getComputer() {
        return computer;
    }

    /**
     * Cambia o nome do equipo relacionado coa incidencia.
     *
     * @param computer Nome do equipo relacionado coa incidencia.
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }

    /**
     * Devolve a descrición da solución da incidencia.
     *
     * @return Descrición da solución da incidencia.
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Cambia a descrición da solución da incidencia.
     *
     * @param resolution Descrición da solución da incidencia.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Devolve o estado da incidencia.
     *
     * @return Estado da incidencia.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Cambia o estado da incidencia.
     *
     * @param status Estado da incidencia.
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Devolve o usuario que xenerou a incidencia.
     *
     * @return Usuario que xenerou a incidencia.
     */
    public User getSender() {
        return sender;
    }

    /**
     * Cambia o usuario que xenerou a incidencia.
     *
     * @param sender Usuario que xenerou a incidencia.
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

}
