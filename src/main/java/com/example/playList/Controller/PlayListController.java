package com.example.playList.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.playList.Model.PlayList;
import com.example.playList.Model.Songs;
import com.example.playList.Service.PlayListService;

@RestController
@RequestMapping("/")
public class PlayListController {

	@Autowired
	public PlayListService playListService;

	@PostMapping("create-playList")
	public PlayList createPlayList(@RequestBody PlayList playList) {
		return playListService.savePlayLists(playList);
	}
	
//	@PostMapping("create-playList")
//	public PlayList createPlayList(@RequestParam("playListName") String listName, List<Songs>songs) {
//		return playListService.savePlayLists(listName,songs);
//	}

	@GetMapping("playLists")
	public List<PlayList> fetchPlaylists() {
		return playListService.getPlayLists();
	}

	@GetMapping("playListDetails/{id}")
	public ResponseEntity<Optional<PlayList>> getPlayListById(@PathVariable int id) {
		return playListService.getPlayListsById(id);
	}

}
