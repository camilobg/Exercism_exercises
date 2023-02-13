package Exercism;

public class BlackJack {
    public static int parseCard(String card) {
        int r=0;
        switch(card){
            case "ace":
                r+=11;
                break;
            case "two":
                r+=2;
                break;
            case "three":
                r+=3;
                break;
            case "four":
                r+=4;
                break;
            case "five":
                r+=5;
                break;
            case "six":
                r+=6;
                break;
            case "seven":
                r+=7;
                break;
            case "eight":
                r+=8;
                break;
            case "nine":
                r+=9;
                break;
            case "ten":
                r+=10;
                break;
            case "jack":
                r+=10;
                break;
            case "queen":
                r+=10;
                break;
            case "king":
                r+=10;
                break;
            default:
                r=0;
        }
        return r;
    }

    public static boolean isBlackjack(String card1, String card2) {
        if(parseCard(card1)+parseCard(card2)==21) return true;
        else return false;
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack){
            if(dealerScore<10) return "W";
            else return "S";
        }
        else return "P";
    }

    public static String smallHand(int handScore, int dealerScore) {
        if(handScore>=17) return "S";
        //else if(handScore<=11) return "H";
        else if(handScore>=12 && handScore<=16){
            if(dealerScore<7) return "S";
            else return "H";
        }
        else return "H";
    }
    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
    public static void main(String[] args) {
        System.out.println(firstTurn("king", "ace", "nine"));
        System.out.println(isBlackjack("king", "ace"));


    }
}
