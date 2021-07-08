import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Logica {

    public static void main(String[] args) {

        // Creamos los objetos
        Alumno al1 = new Alumno("Sebastián", 6, 15, "A", "M");
        Alumno al2 = new Alumno("Pepito", 2, 14, "A", "M");
        Alumno al3 = new Alumno("Fulana", 8, 13, "B", "F");
        Alumno al4 = new Alumno("Claudio", 7, 15, "A", "M");
        Alumno al5 = new Alumno("Paulina", 4, 16, "B", "F");
        Alumno al6 = new Alumno("Carlos", 5, 15, "B", "M");
        Alumno al7 = new Alumno("Pablo", 8, 14, "B", "M");
        Alumno al8 = new Alumno("Florencia", 6, 16, "A", "F");

        // Array q tiene todos los alumnos y cursos
        List<Alumno> alumnos = Arrays.asList(al1, al2, al3, al4, al5, al6, al7, al8);

        // Separamos los array x curso
        List<Alumno> cursoA = alumnos.stream().filter(al -> al.getCurso().equals("A")).collect(Collectors.toList());

        List<Alumno> cursoB = alumnos.stream().filter(al -> al.getCurso().equals("B")).collect(Collectors.toList());

        // punto 1
        long aprobadosA = cursoA.stream().filter(al -> al.getNota() >= 6).count();
        long aprobadosB = cursoB.stream().filter(al -> al.getNota() >= 6).count();
        // punto 2
        long aplazadosA = cursoA.stream().filter(al -> al.getNota() < 6).count();
        long aplazadosB = cursoB.stream().filter(al -> al.getNota() < 6).count();
        // punto 3
        // Sacamos la cantidad de alumnos. Como el metodo count devuelve long lo
        // parseamos a int para operar luego.
        // general
        int cantGen = (int) alumnos.stream().count();
        Optional<Integer> sum = alumnos.stream().map(Alumno::getEdad).reduce(Integer::sum);
        Double edadGen = (double) sum.get() / cantGen;
        // curso a
        // Sacamos la cantidad de alumnos. Como el metodo count devuelve long lo
        // parseamos a int para operar luego.
        int cantGenA = (int) cursoA.stream().count();
        Optional<Integer> sumA = cursoA.stream().map(Alumno::getEdad).reduce(Integer::sum);
        Double edadGenA = (double) sumA.get() / cantGenA;

        // curso b
        // Sacamos la cantidad de alumnos. Como el metodo count devuelve long lo
        // parseamos a int para operar luego.
        int cantGenB = (int) cursoB.stream().count();
        Optional<Integer> sumB = cursoB.stream().map(Alumno::getEdad).reduce(Integer::sum);
        Double edadGenB = (double) sumB.get() / cantGenB;

        // punto 4
        // Curso A
        int cantMascA = (int) cursoA.stream().filter(al -> al.getSexo() == "M").count();
        Optional<Integer> notA = cursoA.stream().filter(al -> al.getSexo() == "M").map(Alumno::getNota)
                .reduce(Integer::sum);
        Double notGenA = (double) notA.get() / cantMascA;
        // Curso B
        int cantMascB = (int) cursoB.stream().filter(al -> al.getSexo() == "M").count();
        Optional<Integer> notB = cursoB.stream().filter(al -> al.getSexo() == "M").map(Alumno::getNota)
                .reduce(Integer::sum);
        Double notGenB = (double) notB.get() / cantMascB;

        // Impresiones
        alumnos.forEach(System.out::println);
        System.out.println("");
        // punto 1
        System.out.println("Curso A:");
        cursoA.forEach(System.out::println);
        System.out.println("");
        System.out.println("Curso B:");
        cursoB.forEach(System.out::println);
        // punto 2
        System.out.println("");
        System.out.println("Aprobados A:" + aprobadosA + "  | Aprobados B: " + aprobadosB);
        System.out.println("");
        System.out.println("Aplazados A: " + aplazadosA + " | Aplazados B: " + aplazadosB);
        // Punto 3
        System.out.println("");
        System.out.println("Promedio de edad: Alumnos general: " + edadGen + " | Curso A: " + edadGenA + " | Curso B: "
                + edadGenB);
        // Punto 4
        System.out.println("Nota varones Curso A: " + notGenA + " | Nota varones curso B: " + notGenB);
    }
}
