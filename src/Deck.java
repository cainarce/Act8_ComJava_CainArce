import java.util.*;

public class Deck {

    String[] palo = {"tréboles","corazones","picas","diamantes"};
    String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    List<Card> cardsDeck = new ArrayList<>();

    public void Deck(){
        //crear baraja
        for(int i=0; i<palo.length; i++){
            for(int j=0; j<valor.length; j++){
                Card nuevaCard = new Card();
                nuevaCard.palo = palo[i];
                nuevaCard.valor = valor[j];
                if(palo[i].equals("corazones") || palo[i].equals("diamantes")){
                    nuevaCard.color = "rojo";
                } else {
                    nuevaCard.color = "negro";
                }
                cardsDeck.add(nuevaCard);
            }
        }
    }

    public void shuffle(){
        //barajear
        List<Card> shuffleDeck = new ArrayList<Card>(cardsDeck);
        Collections.shuffle(shuffleDeck);
        Set<Card> shuffledSet = new LinkedHashSet<Card>();
        shuffledSet.addAll(shuffleDeck);

        cardsDeck = new ArrayList<Card>(shuffleDeck);

        System.out.println("Se mezcló el Deck.");
    }

    public void head(){
        if(cardsDeck.size()>0){
            System.out.println(cardsDeck.get(0).palo + " " + cardsDeck.get(0).color + " " + cardsDeck.get(0).valor);
            cardsDeck.remove(0);
            System.out.println("Quedan " + cardsDeck.size() + " cartas en deck.");
        } else {
            System.out.println("No hay suficientes cartas en el Deck.");
        }
    }

    public void pick(){
        if(cardsDeck.size()>0){
            Random rand = new Random();
            int numRandom = rand.nextInt(cardsDeck.size()-1);

            System.out.println(cardsDeck.get(numRandom).palo + " " + cardsDeck.get(numRandom).color + " " + cardsDeck.get(numRandom).valor);
            cardsDeck.remove(numRandom);
        } else {
            System.out.println("No hay suficientes cartas en el Deck.");
        }
    }

    public void hand() {
        if (cardsDeck.size() >= 5){
            for (int i = 0; i < 5; i++) {
                pick();
            }
        } else {
            System.out.println("No hay suficientes cartas en el Deck.");
        }
    }

}