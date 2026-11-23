public class Student {
    public  String faculty, numeGrupa, numeStudent, specialitate;
    public  short anulNasterii;
    public  byte test1, test2, examen;
    public  boolean estePromovat(byte test1, byte test2, byte examen){
        double mediaAritmetica = (test1 + test2 + examen) / 3.0;
        if(mediaAritmetica >= 9) return true;
        return false;
    }
    public static int varsta(short an){
        return 2026 - an;
    }
}
