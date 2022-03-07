package com.example.playList.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.playList.Model.Songs;
import com.example.playList.Service.SongsService;

@RestController
@RequestMapping("/")
public class SongsController {

	@Autowired
	public SongsService songsService;

	@PostMapping("upload-songs")
	public Songs uploadSongs(@RequestParam("file") MultipartFile file, @RequestParam("singer_name") String singerName, @RequestParam("pList_Id") int playListId) throws IOException {
		return songsService.storeSongs(file, singerName, playListId);
	}

	@GetMapping("SongList")
	public List<Songs> getAllSongs() {
		return songsService.getSongList();
	}

	@GetMapping("SongDetails/{id}")
	public ResponseEntity<Optional<Songs>> fetchSongById(@PathVariable int id) {
		return songsService.getSongById(id);
	}
	
	@DeleteMapping("Delete-Songs/{id}")
	public ResponseEntity<Songs> deleteSongs(@PathVariable int id){
		return songsService.removeSongs(id);
	}

}
