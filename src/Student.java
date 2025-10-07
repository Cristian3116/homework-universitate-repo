import java.util.Scanner;
import java.time.Year;

public class Student {

    public static void main(String[] args) {

        Scanner introducere = new Scanner(System.in);
        System.out.println("Intrare in program...");
        String denumFacult ;
        String raspuns;

        String numeGrupa = " ";
        byte a = 0;

        do {

            System.out.print("Introducere faculate (Matematica/Informatica):");

            denumFacult = introducere.next();
            System.out.println("----------------");

            switch (denumFacult.toLowerCase()) {

                case "matematica":

                    System.out.println("A fost aleasa facultatea de Matematica.");
                    System.out.println("--------------------");

                    System.out.print("Doriti sa introduceti studenti noi (Da/Nu): ");
                    raspuns = introducere.next();

                    if (raspuns.toLowerCase().equalsIgnoreCase("da")) {

                        System.out.print("Creati numele grupei noi:");
                        numeGrupa = introducere.next();
                        System.out.println("--------------------");
                        a = 1;

                    } else {
                        System.out.println("Iesire din program");
                        System.exit(1);
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
                    } else {
                        System.out.println("Iesire din program");
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Ati introdus o varianta greista.Iesire din program...");
                    System.exit(1);
            }

            if (a == 1) {

                System.out.println("Introducerea studentilor grupei " + numeGrupa + "...");
                infStudent();

            } else {
                System.out.println("--------------------");
            }
            System.out.println("Doriti sa efectuati operatiunea din nou?(Da/Nu)");
            raspuns = introducere.next();

        }while (raspuns.equalsIgnoreCase("Da"));
        System.out.println("Iesire din program...");

    }

    public static void infStudent() {

        Scanner introducere = new Scanner(System.in);
        int anCurent = Year.now().getValue();

        System.out.print("Introduceti numele studentului: ");
        String nume = introducere.nextLine();
        System.out.println("--------------------");

        System.out.print("Introduceti anul nasterii: ");
        int anNastere = introducere.nextInt();
        System.out.println("--------------------");

        if((anCurent - anNastere) > 125 || (anCurent - anNastere) <= 17 ){
            System.out.println("EROARE(Varsta studentului e prea mare sau greista)!!!.Iesire din program");
            System.out.println("--------------------");
            System.exit(1);
        } else {}

        System.out.println("Student: " + nume + ", Varsta: " + (anCurent - anNastere) + " ani.");
        System.out.println("--------------------");

        System.out.print("Introduceti specialitatea(Algebra/Geometrie/Calcul_Integral): ");
        String specialitate = introducere.next();

            switch (specialitate.toLowerCase()) {
                case "algebra": specialitate = "Algebra";
                    break;
                case "geometrie": specialitate = "Geometria";
                    break;
                case "calcul_integral": specialitate = "Calcul_Integral";
                    break;
                default:
                    System.out.println("EROARE.Iesire din program");
                    System.exit(1);
            }

        System.out.println("--------------------");
        System.out.println("A fost alaesa specialitatea " + specialitate + "...");
        System.out.println("--------------------");

        System.out.println("Introduceti notele:");
        System.out.print("Nota test 1:");
        double nota1 = introducere.nextDouble();
        System.out.println("--------------------");

        for (int i =0; nota1 >= 11 || nota1 <= 0; i++ ){
            System.out.println("Nota a fost introdusa gresit.Iesire din program...");
            System.exit(1);
        }

        System.out.print("Nota test 2:");
        double nota2 = introducere.nextDouble();
        System.out.println("--------------------");

        for (int i =0; nota2 >= 11 || nota2 <= 0; i++ ) {
            System.out.println("Nota a fost introdusa gresit.Iesire din program...");
            System.exit(1);
        }

        System.out.print("Nota examen:");
        double notaExam = introducere.nextDouble();
        System.out.println("--------------------");

        for (int i =0; notaExam >= 11 || notaExam <= 0; i++ ){
            System.out.println("Nota a fost introdusa gresit.Iesire din program...");
            System.exit(1);
        }

        double rezultat;

            System.out.println("Se calculeaza media...");
            rezultat = (nota1 + nota2 + notaExam) / 3;
            System.out.println("Media este: " + rezultat);

            if (rezultat >= 9) {
                System.out.println("Felicitari!!! Esti promovat");
            } else {
                System.out.println("Nu ati trecut cu brio,incercati in semestrul urmator");
            }

            System.out.println("Ceva nu a mers bine.Iesire din program...");

    }

}

