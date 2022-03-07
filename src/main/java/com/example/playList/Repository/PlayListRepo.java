package com.example.playList.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.playList.Model.PlayList;

@Repository
public interface PlayListRepo extends JpaRepository<PlayList, Integer> {

}
