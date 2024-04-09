/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes;

/**
 * Clase utilizada para el colegio
 *
 * @author Marco Rodriguez
 * @version 1.0
 * @since 1.0
 */
public class Colegio {

    private Persona.Alumno listaAlumnos[];
    private Persona.Profesor listaProfesores[];
    private Asignatura listaAsignaturas[];

    /**
     * Constructor que inicializa los parametros de clase de las asignaturas
     *
     * @param listaAlumnos[] Arraylist de profesores y alumnos
     * @param listaProfesores[] Arraylist de profesores y alumnos
     * @param listaAsignaturas[] Arraylist de asignaturas
     */
    public Colegio(Persona.Alumno listaAlumnos[], Persona.Profesor listaProfesores[], Asignatura listaAsignaturas[]) {
        this.listaAlumnos = listaAlumnos;
        this.listaProfesores = listaProfesores;
        this.listaAsignaturas = listaAsignaturas;
    }
	/**
	 * Implementa el guardado de todos los datos (asignaturas, profesores y alumnos)
	 * 
	 */
    public void guardarDatos() {

    }
	/**
	 * Implementa el cargue de todos los datos desde el fichero
	 * 
	 */
    public void cargarDatos() {

    }
	/**
	 * Implementa el listar profesores
	 * 
	 */
    public void listarProfofesores() {

    }
	/**
	 * Implementa el listar Alumnos
	 * 
	 */
    public void listarAlumnos() {

    }
	/**
	 * Implementa el dar de alta profesores
         *  @param listaProfesores [] Sen envia la informacion del profesor
	 * 
	 */
    public void altaProfesores(Persona.Profesor listaProfesores []) {

    }
    

    
	/**
	 * Implementa el dar de alta alumnos
         * @param listaAlumnos[] Sen envia la informacion del alumno
	 * 
	 */
    public void altaAlumnos(Persona.Alumno listaAlumnos[]) {

    }
	/**
	 * Implementa el alta de una asignatura 
         * @param listaAsignaturas[] informacion de la asignatura
	 * 
	 */
    public void altaAsignatura(Asignatura listaAsignaturas[]) {

    }
	/**
	 * Implementa la matriculacion del alumno a una asignatura
	 * 
	 */
    public void matricularAlumnos() {

    }
	/**
	 * Implementa la asignacion de asignaturas a un profesor
	 * 
	 */
    public void getAsignaturasProfesor() {

    }
	/**
	 * Implementa la obtencion de la asignatura con mas estudiantes matriculados
	 * 
	 */
    public void getMasasignaturasAlumno() {

    }
}
