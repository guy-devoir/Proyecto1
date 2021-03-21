package info;

import java.util.Date;

public class Curso {

    protected String name;
    protected int id;
    protected Profesores profesor;
    protected int creditos;
    protected int prof_id;
    protected int id_tarea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }
   
     
}
