import java.util.Scanner;
import java.time.Year;

public class Student {

    public static void main(String[] args) {

        Scanner introducere = new Scanner(System.in);


        System.out.println("Intrare in program...");
        System.out.print("Introducere faculate (Matematica/Informatica):");

        String denumFacult = introducere.nextLine();
        System.out.println("----------------");
        String raspuns;
        String numeGrupa = " ";
        byte a = 0;
        double nota1;
        double nota2;
        double notaExam;



        switch (denumFacult.toLowerCase()) {

            case "matematica":

                System.out.println("A fost aleasa facultatea de Matematica.");
                System.out.println("--------------------");

                System.out.println("Doriti sa introduceti studenti noi (Da/Nu)");
                raspuns = introducere.nextLine();

                if (raspuns.toLowerCase().equalsIgnoreCase("da")) {

                    System.out.print("Creati numele grupei noi:");
                    numeGrupa = introducere.next();
                    System.out.println("--------------------");
                    a = 1;

                }
                else
                {
                    System.out.println("Iesire din program");
                }

                break;


            case "informatica":
                System.out.println("A fost aleasa facultatea de Informatica.");
                System.out.println("Doriti sa introduceti studenti noi (Da/Nu)");
                raspuns = introducere.nextLine();

                if (raspuns.toLowerCase().equalsIgnoreCase("da")) {

                    System.out.print("Creati numele grupei noi:");
                    numeGrupa = introducere.nextLine();
                    System.out.println("--------------------");
                    a = 1;
                }
                else {
                    System.out.println("Iesire din program");
                }

                break;

            default:
                System.out.println("Ati introdus o varianta greista.Iesire din program...");
                return;

        }

        if (a == 1) {

            System.out.println("Introducerea studentilor grupei " + numeGrupa + "...");
            infStudent();

        } else {
            System.out.println("--------------------");
        }

    }

    public static void infStudent() {

        Scanner introducere = new Scanner(System.in);
        int anCurent = Year.now().getValue();

        System.out.print("Introduceti numele studentului: ");
        String nume = introducere.next();
        System.out.println("--------------------");

        System.out.print("Introduceti anul nasterii: ");
        int anNastere = introducere.nextInt();
        System.out.println("--------------------");

        System.out.println("Student: " + nume + ", Varsta: " + (anCurent - anNastere) + " ani." );
        System.out.println("--------------------");

        System.out.println("Introduceti specialitatea(Algebra/Geometrie/Calcul_Integral): ");
        String specialitate = introducere.next();
        System.out.println("--------------------");
        System.out.println("A fost alaesa specialitatea " + specialitate + "...");
        System.out.println("--------------------");

        System.out.println("Introduceti notele:");
        System.out.print("Nota test 1:");
        double nota1 = introducere.nextDouble();
        System.out.println("--------------------");

        System.out.print("Nota test 2:");
        double nota2 = introducere.nextDouble();
        System.out.println("--------------------");

        System.out.print("Nota examen:");
        double notaExam = introducere.nextDouble();
        System.out.println("--------------------");

        double rezultat;

        if ( nota1 >= 0 & nota2 >=0 & notaExam >= 0 & nota1 <= 10 & nota2 <= 10 & notaExam <= 10  ) {

            System.out.println("Se calculeaza media...");

            rezultat = (nota1 + nota2 + notaExam) / 3;
            System.out.println("Media este: " + rezultat);

            if (rezultat >= 9) {
                System.out.println("Felicitari!!! Esti promovat");
            } else {
                System.out.println("Nu ati trecut cu brio,incercati in semestrul urmator");
            }

        } else{
            System.out.println("Ceva nu a mers bine.Iesire din program...");

        }


    }

}

