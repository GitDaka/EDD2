/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes;

/**
 * Clase utilizada para las asignaturas
 *
 * @author Marco Rodriguez
 * @version 1.0
 * @since 1.0
 */
public class Asignatura {

    private String codigo;
    private String nombre;
    private int numeroHorasanuales;
    private Persona.Profesor profesor;
    private Persona.Alumno listaAlumnos[];

    /**
     * Constructor que inicializa los parametros de clase de las asignaturas
     *
     * @param codigo Codigo de la Asignatura
     * @param nombre Nombre de la Asignatura
     * @param numeroHorasanuales No. Horas anuales de la Asignatura
     */
    public Asignatura(String codigo, String nombre, int numeroHorasanuales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroHorasanuales = numeroHorasanuales;
    }
    // Zona de Getters & Setters
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroHorasanuales
     */
    public int getNumeroHorasanuales() {
        return numeroHorasanuales;
    }

    /**
     * @param numeroHorasanuales the numeroHorasanuales to set
     */
    public void setNumeroHorasanuales(int numeroHorasanuales) {
        this.numeroHorasanuales = numeroHorasanuales;
    }

}
