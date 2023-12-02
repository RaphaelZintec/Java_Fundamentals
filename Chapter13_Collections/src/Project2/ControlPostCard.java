package Project2;

import Project1.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ControlPostCard {
    //ATTRIBUTES
    private List<PostCard> myPostCards;
    private Set<PostCard> myPostCardsWithoutExtras = new HashSet<>();
    private int indexOfMyRemovedCard;
    private List<PostCard> myExtraCards = new ArrayList<>();
    private List<PostCard> friendPostCards;
    private List<Friend> allMyFriends;
    private Queue<Friend> sortedFriends = new PriorityQueue<>();

    //CONSTRUCTOR
    public ControlPostCard(List<PostCard> myPostCards, List<PostCard> friendPostCards, List<Friend> allMyFriends) {
        this.myPostCards = myPostCards;
        this.friendPostCards = friendPostCards;
        this.allMyFriends = allMyFriends;
    }

    //OPDRACHT 1: 3 methodes (find best friend, remove extra card from both and main methode which execute )
    public void switchFriendDoublePostCard() {
        //1. find best friend
        Friend bestFriend = findBestFriend(allMyFriends);

        //2. remove useless card that i have many times from my collection + get the index + send to my friend
        myPostCards = removeUselessCard(myPostCards, "me");

        //3. remove double useless card from my best friend and send it to me to the index of the removed card (will go at first place because first belgian removed card is first position)
        friendPostCards = removeUselessCard(friendPostCards, "friend");

        System.out.println("\uD83D\uDCE2 Best friend's cards without double");
        friendPostCards.forEach(n -> System.out.println(n));
        System.out.println("\n\uD83D\uDCE2 My cards with friends double card");
        myPostCards.forEach(n -> System.out.println(n));
    }

    public Friend findBestFriend(List<Friend> friends) {
        return friends.stream().filter(friend -> !friend.isFamily()).max(Comparator.comparingInt(Friend::getFriendShipLevel)).orElse(null);
    }

    public List<PostCard> removeUselessCard(List<PostCard> postCards, String owner) {
        Map<String, Long> countPostCards = postCards.stream().collect(Collectors.groupingBy(PostCard::getCountry, Collectors.counting())); // country + count number of times country is present, here unfortunately country is the key because groupingBy need to know what to group first and make it as a key
        int highestNumber = countPostCards.values().stream().max(Long::compareTo).orElse(0L).intValue(); //find the max count and convert to int because uses only Long. And if user has 2x Belgium and 2x Rwanda and 1x France then will return 2
        String extraCountry = countPostCards.entrySet().stream().filter(c -> c.getValue() == highestNumber).map(Map.Entry::getKey).findFirst().get(); //find any having the max (no matter the country) and use get() to convert Optional to String

        //remove double country from friend cards
        for (int i = 0; i < postCards.size(); ++i) {
            if (postCards.get(i).getCountry().equals(extraCountry)) {
                if (owner.equals("me")) { //if my card's collection then send removed card to my friend's collection
                    indexOfMyRemovedCard = i;
                    friendPostCards.add(postCards.get(i));
                } else if (owner.equals("friend")) //if friend's card then send removed card to my collection
                    myPostCards.add(indexOfMyRemovedCard, postCards.get(i));
                postCards.remove(postCards.get(i));
                break; //remove one and leave dont remove the others similar
            }
        }
        return postCards;
    }

    //OPDRACHT 2
    public void orderByCountries() {
        System.out.println("\uD83D\uDCE2 My cards ordered by country");
        myPostCards.sort(Comparator.comparing(PostCard::getCountry));
        myPostCards.forEach(System.out::println);
    }

    //OPDRACHT 3
    public void removeAllExtraCards() {
        //New list without doubles
        System.out.println("\uD83D\uDCE2 My cards without doubles");
        myPostCardsWithoutExtras.addAll(myPostCards);
        myPostCardsWithoutExtras.forEach(System.out::println);

        //New List with extras only
        myPostCards.forEach(p -> {
            int frequency = Collections.frequency(myPostCards, new PostCard(p.getCountry(), p.getContinent()));
            if (frequency > 1 && !myExtraCards.contains(p)) { //if frenquency more than one = extra and never added to extra
                for (int i = 0; i < frequency - 1; ++i) // add frenquency -1 because we add only extras
                    myExtraCards.add(p);
            }
        });
        System.out.println("\n\uD83D\uDCE2 My second card collection with only extra cards");
        myExtraCards.forEach(System.out::println);
    }

    //OPDRACHT 4
    public void shareCardsWithFriends() {

        //1.PRIORITY FAMILY THEN BEST FRIEND
        final boolean[] bestFriendCheck = new boolean[1]; //default false
        //here i learned that we cannot make priority at the same time for two int
        allMyFriends.stream()
                .sorted(Comparator
                        .comparing(Friend::isFamily)
                        .thenComparing(Friend::getFriendShipLevel).reversed())
                .forEach(f -> {
                    if (f.isFamily()) {
                        sortedFriends.offer(f);
                    } else if (!bestFriendCheck[0]) {
                        sortedFriends.offer(f);
                        bestFriendCheck[0] = true; //stop foreach after best friend added (foreach will continue but branches won't be executed)
                    }
                });

        //2.PRIORITY FRIEND BY YEARS KNOWN
        //- remove family + best friend from main list
        allMyFriends.removeAll(sortedFriends);
        //- make order by years known with the rest
        allMyFriends.stream()
                .sorted(Comparator.comparingInt(Friend::getYearsKnown).reversed())
                .forEach(f->{
                    sortedFriends.offer(f);
                });

        System.out.println("\uD83D\uDCE2 Priority to family then best friend then years known");
        sortedFriends.forEach(System.out::println);
    }
}
