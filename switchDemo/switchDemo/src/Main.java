public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fen degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef : Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");


        }
    }
}