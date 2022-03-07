package com.example.playList.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.playList.Model.PlayList;
import com.example.playList.Model.Songs;
import com.example.playList.Repository.PlayListRepo;

@Service
public class PlayListService {

	@Autowired
	public PlayListRepo playListRepo;

	public PlayList savePlayLists(PlayList playList) {
		return playListRepo.save(playList);
	}
	
//	public PlayList savePlayLists(String playListName, List<Songs> songs) {
//		String play_List_Name = playListName;
//		PlayList playList = new PlayList(play_List_Name, songs);
//		return playListRepo.save(playList);
//	}

	public List<PlayList> getPlayLists() {
		return playListRepo.findAll();
	}

	public ResponseEntity<Optional<PlayList>> getPlayListsById(@PathVariable int id) {
		Optional<PlayList> playList = playListRepo.findById(id);
		return ResponseEntity.ok(playList);
	}

}
