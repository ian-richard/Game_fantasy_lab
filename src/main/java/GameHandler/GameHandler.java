package GameHandler;

import player.IWarCry;

import java.util.ArrayList;

public class GameHandler {
    private ArrayList<IWarCry> warCryPlayers;

    public GameHandler(){
        this.warCryPlayers = new ArrayList<IWarCry>();
    }

    public void addItem(IWarCry character) { this.warCryPlayers.add(character);}

    public int getNumberOfWarCryPlayers(){ return this.warCryPlayers.size();}
}
