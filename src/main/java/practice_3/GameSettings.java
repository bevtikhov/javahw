package practice_3;

//Создайте класс GameSettings с полями:
//static int maxPlayers — общее ограничение игроков
//final String gameName — название (нельзя менять)
//int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор, статический метод setMaxPlayers(int),
// метод addPlayer() — добавляет 1 игрока, метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
// В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.


public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;
    GameSettings (String someGameName, int someCurrentPlayers){
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }
    static void setMaxPlayers(int newMaxPlayers){
        GameSettings.maxPlayers = newMaxPlayers;
    }
    void addPlayer(){
        this.currentPlayers++;
    }
    void printGameStatus(){
        System.out.println("Название: " + gameName + " Сейчас игроков: " + currentPlayers + " Максимальное количество игроков: " + GameSettings.maxPlayers);
    }
    static void main (String[] a7args){
        GameSettings.setMaxPlayers(25);
        GameSettings game1 = new GameSettings("CS", 6);
        GameSettings game2 = new GameSettings("Valorant", 8);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

    }
}
