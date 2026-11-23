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
            System.out.println("Introducere facultate (Matematica / Informatica): ");
            student.faculty = input.next();


            System.out.println("Introducere nume grupa: ");
            student.numeGrupa = input.next();


            System.out.println("Introducere nume student: ");
            student.numeStudent = input.next();


            System.out.println("Introducere an nastere student: ");
            student.anulNasterii = input.nextShort();


            System.out.println("Introducere specialitate: ");
            student.specialitate = input.next();


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
