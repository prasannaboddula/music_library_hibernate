package com.example.song.controller;

import java.util.ArrayList;

import com.example.song.model.Song;
import com.example.song.service.SongJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController{
    @Autowired
    private SongJpaService songService;

    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return songService.getSongById(songId);
    }
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song){
        return songService.updateSong(songId,song);
    }
    @DeleteMapping("/songId/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }
}
