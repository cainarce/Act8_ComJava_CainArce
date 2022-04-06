import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck card = new Deck();
        card.Deck();
        int op;

        System.out.println("BIENVENIDO AL JUEGO DE CARTAS");
        do{
            showMenu();

            Scanner leer = new Scanner(System.in);
            op = leer.nextInt();

            switch (op){
                case 0:
                    System.out.println("Exit success");
                    break;
                case 1:
                    System.out.println("Método shuffle:");
                    card.shuffle();
                    break;
                case 2:
                    System.out.println("Método head:");
                    card.head();
                    break;
                case 3:
                    System.out.println("Método pick:");
                    card.pick();
                    System.out.println("Quedan " + card.cardsDeck.size() + " cartas en deck.");
                    break;
                case 4:
                    System.out.println("Método hand:");
                    card.hand();
                    System.out.println("Quedan " + card.cardsDeck.size() + " cartas en deck.");
                    break;
                case 5:
                    System.out.println("Se reinició el juego");
                    card.Deck();
                    break;
            }
        }while(op!=0);

    }

    public static void showMenu(){
        System.out.println("0 - Salir");
        System.out.println("1 - Revolver cartas");
        System.out.println("2 - Sacar primer carta del Deck");
        System.out.println("3 - Sacar una carta aleatoria del Deck");
        System.out.println("4 - Sacar 5 cartas del Deck");
        System.out.println("5 - Reiniciar juego");
    }

}
