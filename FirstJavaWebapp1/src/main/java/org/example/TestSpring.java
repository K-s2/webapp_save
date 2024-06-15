package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer player = new MusicPlayer(music);

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);//spring ваызывает сеттер из xml файла и преедает ему bean который был ранее
        //<property name="music" ref="musicBean"/> тут спринг сам после слвоа music ищет у этого класса метод musicSET именно что нахания бина + сет
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player1==player2);

        player2.setVolume(100);
        player1.playMusic();
        System.out.println(player1.getVolume());
        System.out.println(player2.getVolume());
        context.close();
    }

}
