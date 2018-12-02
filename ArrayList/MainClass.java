package com.joakims.ArrayList;

import java.util.ArrayList;

public class MainClass {

    public static void main(String args[]) {
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        VideoGame game1 = new VideoGame("Battlefield", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon", 2016, "E", platform2);
        VideoGame game3 = new VideoGame("Zelda", 2017, "E", platform2);


        //System.out.println("game1: "+ game1.getTitle());

        // CREATE AN ARRAYLIST OF GAMES
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        //System.out.println(games.toString());

        System.out.println(games);
        games.add(0, game3); // putting Zelda in position 0
        System.out.println(games);
    }
}
