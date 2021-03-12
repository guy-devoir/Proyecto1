package info;

public class Almacenar {
    int i;
    public static Profesores[] arreglo_profesores = new Profesores[10];
    public static Actividades[ ] arreglo_actividades = new Actividades[100];
    public static Curso[ ] arreglo_curso = new Curso[10];
    public static Estudiantes[ ] arreglo_estudiantes = new Estudiantes[10];

    public Almacenar() {
        arreglo_profesores = null;
        arreglo_actividades = null;
        arreglo_curso = null;
        arreglo_estudiantes = null;
        this.i = 0;
    }

    /*
    public boolean isFull(){//Ponds can only have so many fish
    boolean Full = false;
    if (numFish >= capacity){
        Full = true;}
    return Full;
}
    */
    public void GuardarProfesores(int codigo, String nombre, String apellido, String correo, String contraseña, boolean genero) {
        Profesores entrada = new Profesores(codigo, nombre, apellido, correo, contraseña, genero);
        arreglo_profesores[i] = entrada;
        i++;
    }
    public static Profesores[] getArreglo_profesores() {
        return arreglo_profesores;
    }

    public static Actividades[] getArreglo_actividades() {
        return arreglo_actividades;
    }

    public static void setArreglo_actividades(Actividades[] arreglo_actividades) {
        Almacenar.arreglo_actividades = arreglo_actividades;
    }

    public static Curso[] getArreglo_curso() {
        return arreglo_curso;
    }

    public static void setArreglo_curso(Curso[] arreglo_curso) {
        Almacenar.arreglo_curso = arreglo_curso;
    }

    public static Estudiantes[] getArreglo_estudiantes() {
        return arreglo_estudiantes;
    }

    public static void setArreglo_estudiantes(Estudiantes[] arreglo_estudiantes) {
        Almacenar.arreglo_estudiantes = arreglo_estudiantes;
    }

    public void setArreglo_profesores(Profesores[] arreglo_profesores) {
        for (int i = 0; i < arreglo_profesores.length; i++) {
            Almacenar.arreglo_profesores = arreglo_profesores;
        }
    }
  
}
