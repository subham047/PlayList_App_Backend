package com.example.playList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.playList.Model.Songs;

@Repository
public interface SongsRepo extends JpaRepository<Songs, Integer> {

}
