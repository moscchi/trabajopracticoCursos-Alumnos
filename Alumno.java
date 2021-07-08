public class Alumno {
    private String nombre;
    private int nota;
    private int edad;
    private String curso;
    private String sexo;


    public Alumno(String nombre,int nota, int edad, String curso, String sexo) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
        this.curso = curso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nota='" + getNota() + "'" +
            ", edad='" + getEdad() + "'" +
            ", curso='" + getCurso() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }


}