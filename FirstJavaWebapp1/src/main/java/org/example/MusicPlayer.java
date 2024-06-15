package org.example;
import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }




    public MusicPlayer(){}


    public void playMusic() {
        //System.out.println();
        for(Music music : musicList) {
            System.out.println("playing " +music.getSong());
        }
    }
}
