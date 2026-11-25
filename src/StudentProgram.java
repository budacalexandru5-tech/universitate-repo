import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        System.out.println("Intrare in program...");

        System.out.print("Introduceti numarul de studenti: ");
        Scanner input = new Scanner(System.in);
        int nrStudenti = input.nextInt();

        Student [] studenti = new Student[nrStudenti];


        for(int i = 0; i < nrStudenti; i++){
            Student student = new Student();

            do {
                System.out.println("Introduceti facultatea (Matematica sau Informatica):");
                student.faculty = input.next().toUpperCase(Locale.ROOT).trim();

                switch (student.faculty) {
                    case "MATEMATICA":
                        System.out.println("Ati introdus un student in facultatea Matematica!");
                        break;
                    case "INFORMATICA":
                        System.out.println("Ati introdus un student in facultatea Informatica!");
                        break;
                    default:
                        System.out.println("Introduceti doar Matematica sau Informatica!");
                        break;
                }
            } while (!student.faculty.equals("MATEMATICA") && !student.faculty.equals("INFORMATICA"));



            System.out.println("Introducere nume grupa: ");
            student.numeGrupa = input.next();


            System.out.println("Introducere nume student: ");
            student.numeStudent = input.next();



            do {
                System.out.println("Introducere an nastere student: ");
                student.anulNasterii = input.nextShort();
                if(student.anulNasterii > 2026 || student.anulNasterii <= 0) System.out.println("Invalid! Introdu alt numar!");
                else break;
            } while (student.anulNasterii > 2026 || student.anulNasterii <= 0);




            do {
                System.out.println("Introducere specialitate: ");
                student.specialitate = input.next().toUpperCase(Locale.ROOT).trim();

                switch (student.specialitate) {
                    case "ALGEBRA":
                        System.out.println("Ati introdus un student in specialitatea Algebra!");
                        break;
                    case "GEOMETRIE":
                        System.out.println("Ati introdus un student in facultatea Geometrie!");
                        break;
                    case "CALCULINTEGRAL":
                        System.out.println("Ati introdus un student in facultatea Calcul Integral!");
                        break;
                    default:
                        System.out.println("Introduceti doar Algebra/Geometrie/CalculIntegral!");
                        break;
                }
            } while (!student.specialitate.equals("ALGEBRA") && !student.specialitate.equals("GEOMETRIE")&& !student.specialitate.equals("CALCULINTEGRAL"));


            System.out.println("Introduceti rezultatele de la testul1, testul2 si examen: ");
            student.test1 = input.nextByte();
            student.test2 = input.nextByte();
            student.examen = input.nextByte();
            studenti[i] = student;
        }
        for(Student student : studenti){

            if(student.estePromovat(student.test1, student.test2, student.examen))

                System.out.println(student.numeStudent + " din grupa " +

                student.numeGrupa + " din facultatea " + student.faculty

                + " " + student.specialitate + " cu varsta de " + student.varsta(student.anulNasterii)

                + " a fost promovat!");
        }
        input.close();
        System.out.println("Iesire din program...");

    }
}
