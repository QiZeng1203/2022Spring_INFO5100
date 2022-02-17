import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("Ashish", 45);
        Player player2 = new Player("Mark", 40);
        Player player3 = new Player("Peter", 24);
        Player player4 = new Player("Bill", 28);
        Player player5 = new Player("Tom",45);

        Player[] players = {player1, player2, player3, player4, player5};

        Comparator<Player> myComparator = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.getScore() < o2.getScore()) {
                    return 1;
                }
                else if(o1.getScore() > o2.getScore()) {
                    return -1;
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };

        System.out.println("*************");
        printPlayers(players);
        Arrays.sort(players, myComparator);
        System.out.println("*************/a object of Comparator");
        printPlayers(players);
//        System.out.println("*************/inside arrays.sort");
//        Arrays.sort(players, new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//                if(o1.getScore() < o2.getScore()) {
//                    return 1;
//                }
//                else if(o1.getScore() > o2.getScore()) {
//                    return -1;
//                }
//                else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//        });
//        printPlayers(players);

//        System.out.println("*************/by class");
//        Arrays.sort(players, new myComparatorClass());
//        printPlayers(players);

    }

    private static void printPlayers(Player[] players) {
        System.out.println("Name\tScore");
        for (Player player: players) {
            System.out.println(
                    player.getName() + " \t"  +
                    player.getScore()
            );
        }
    }

 /*   public static class myComparatorClass implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            if(o1.getScore() < o2.getScore()) {
                return 1;
            }
            else if(o1.getScore() > o2.getScore()) {
                return -1;
            }
            else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }*/
}