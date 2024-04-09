/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes;

import java.time.LocalDate;

/**
 * Clase Persona utilizada como padre de alumno y profesor
 *
 * @author Marco Rodriguez
 * @version 1.0
 * @since 1.0
 */
public class Persona {

    // Metodos de clase. Edad y nombre
    String nombre;
    String dni;

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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Clase Alumno utilizada como hijo de persona
     *
     * @author Marco Rodriguez
     * @version 1.0
     * @since 1.0
     */
    public class Alumno extends Persona {

        // Metodos de clase. fechaMatriculacion y nacionalidad
        private LocalDate fechaMatriculacion;
        private String nacionalidad;

        /**
         * @return the fechaMatriculacion
         */
        public LocalDate getFechaMatriculacion() {
            return fechaMatriculacion;
        }

        /**
         * @param fechaMatriculacion the fechaMatriculacion to set
         */
        public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
            this.fechaMatriculacion = fechaMatriculacion;
        }

        /**
         * @return the nacionalidad
         */
        public String getNacionalidad() {
            return nacionalidad;
        }

        /**
         * @param nacionalidad the nacionalidad to set
         */
        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }

        /**
         * Constructor que inicializa los parametros de clase de los alumnos
         *
         * @param nombre Nombre del alumno
         * @param dni DNI del alumno
         * @param fechaMatriculacion Fecha de matriculación del alumno
         * @param nacionalidad Nacionalidad del alumno
         */
        public Alumno(String nombre, String dni, LocalDate fechaMatriculacion, String nacionalidad) {
            this.nombre = nombre;
            this.dni = dni;
            this.fechaMatriculacion = fechaMatriculacion;
            this.nacionalidad = nacionalidad;

        }

    }

    /**
     * Clase Profesor utilizada como hijo de persona
     *
     * @author Marco Rodriguez
     * @version 1.0
     * @since 1.0
     */
    public class Profesor extends Persona {

        // Metodos de clase. departamento
        private String departamento;

        /**
         * @return the departamento
         */
        public String getDepartamento() {
            return departamento;
        }

        /**
         * @param departamento the departamento to set
         */
        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        /**
         * Constructor que inicializa los parametros de clase del profesor
         *
         * @param nombre Nombre del profesor
         * @param dni DNI del profesor
         * @param departamento Departamento al que pertenece el profesor
         */
        public Profesor(String nombre, String dni, String departamento) {
            this.nombre = nombre;
            this.dni = dni;
            this.departamento = departamento;

        }

    }

}
