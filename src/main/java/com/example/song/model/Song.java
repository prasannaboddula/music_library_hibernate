package com.example.song.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "playlist")
public class Song{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="songid")
    private int songId;

    @Column(name="songname")
    private String songName;

    @Column(name="lyricist")
    private String lyricist;

    @Column(name="singer")
    private String singer;

    @Column(name="musicDirector")
    private String musicDirector; 

    public Song(){}

    public int getSongId(){
        return songId;
    }
    public void setsongId(int songId){
        this.songId = songId;
    }

    public String getSongName(){
        return songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }

    public String getLyricist(){
        return lyricist;
    }
    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }
    public String getSinger(){
        return singer;
    }
    public void setSinger(String singer){
        this.singer = singer;
    }
    public String getMusicDirector(){
        return musicDirector;
    }
    public void setMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }

}
