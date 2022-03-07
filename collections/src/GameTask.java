import java.util.*;

public class GameTask {
    public static void main(String[] args) {
        Game game1 = new Game("Amnesia", Genre.HORROR, 5, 1000);
        Game game2 = new Game("Machine", Genre.HORROR, 10, 3000);
        Game game3 = new Game("Mass Effect1", Genre.ACTION, 50, 1000000);
        Game game4 = new Game("Mass Effect2", Genre.ACTION, 60, 40);


        List<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        Printing(games);

        System.out.println("------");

        games.remove(1);

        Printing(games);

        System.out.println("------");
        Collections.sort(games, new PriceComparator());
        Printing(games);

        System.out.println("------");
        Collections.sort(games, new PriceComparator().reversed());
        Printing(games);

        games.stream().forEach(game -> game.incrementPrice(5));
        Printing(games);
        System.out.println("------");

        //price > 10 && copiesSold > 50
        List<Game> tripleA = games.stream().filter(game -> game.getPrice() > 10).filter(game -> game.getCopiesSold() > 50).toList();
        Printing(tripleA);
        System.out.println("------");

        //sorting by copiesSold
        List<Game> sorted = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        System.out.println(sorted);
        System.out.println("------");

        //Find game with the least copies sold (min)
        Optional<Game> minGamesSold = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("Min sold copies " + minGamesSold);
        System.out.println("------");

        //Find game with most copies sold (max)
        Optional<Game> maxGamesSold = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("Max sold copies " + maxGamesSold);
        System.out.println("------");

    }

    public static void Printing(List<Game> games) {
        for (Game game : games) {
            System.out.println(game.toString());
        }
    }
}
