import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck card = new Deck();
        card.Deck();
        int op = 0;

        System.out.println("-----------------------------");
        System.out.println("BIENVENIDO AL JUEGO DE CARTAS");
        System.out.println("-----------------------------");
        do{
            try {
                showMenu();

                Scanner leer = new Scanner(System.in);
                op = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Opción no válida.");
            }

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
                    try {
                        card.head();
                    } catch (Exception e) {
                        System.out.println("No hay suficientes cartas en el Deck.");
                    }
                    break;
                case 3:
                    System.out.println("Método pick:");
                    try {
                        card.pick();
                    } catch (Exception e) {
                        System.out.println("No hay suficientes cartas en el Deck.");
                    }
                    System.out.println("Quedan " + card.cardsDeck.size() + " cartas en deck.");
                    break;
                case 4:
                    System.out.println("Método hand:");
                    try {
                        card.hand();
                    } catch (Exception e) {
                        System.out.println("No hay suficientes cartas en el Deck.");
                    }
                    System.out.println("Quedan " + card.cardsDeck.size() + " cartas en deck.");
                    break;
                case 5:
                    System.out.println("Se reinició el juego");
                    card.Deck();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while(op!=0);

    }

    public static void showMenu() throws Exception{
        System.out.println("0 - Salir");
        System.out.println("1 - Revolver cartas");
        System.out.println("2 - Sacar primer carta del Deck");
        System.out.println("3 - Sacar una carta aleatoria del Deck");
        System.out.println("4 - Sacar 5 cartas del Deck");
        System.out.println("5 - Reiniciar juego");
    }

}
