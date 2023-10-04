package be.intecbrussel.Les7.Opdracht3;

public class Oefening2 {
    public static void main(String[] args) {
        int cadeautjes = 43;
        int friendshipRank = 0;
        int favorieteShopkeeper = 0;

        //give 1 gift to my favorite shop and i receive 1 friendshipRank and every 5th gifts i receive 2 friendshipRank
        do{
            --cadeautjes;
            ++favorieteShopkeeper;
            if(favorieteShopkeeper%5==0){
                friendshipRank+=2;
            }
            else{
                ++friendshipRank;
            }
        }while(friendshipRank != 20);

        System.out.println("Mijn cadeautjes: "+cadeautjes);
        System.out.println("Mijn FriendShip Rank: "+friendshipRank);
        System.out.println("Mijn Favoriete Shop keeper: "+favorieteShopkeeper);
    }
}
