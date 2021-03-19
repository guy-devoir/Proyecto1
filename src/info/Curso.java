package info;

import java.util.Date;

public class Curso {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }
    protected String name;
    protected Profesores profesor;
    protected int id_tarea;
   
     
}
