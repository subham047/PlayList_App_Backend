package com.example.playList.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import com.example.playList.Model.Songs;
import com.example.playList.Repository.SongsRepo;

@Service
public class SongsService {

	@Autowired
	public SongsRepo songsRepo;
	
//	public Songs storeSongs( MultipartFile file, String singersName) throws IOException {
//		String fileName = file.getOriginalFilename();
//		String singerName = singersName;
//		Songs updatedSongDetails = new Songs(singerName, fileName, file.getBytes());
//		return songsRepo.save(updatedSongDetails);
//	}
	
	public Songs storeSongs( MultipartFile file, String singersName, int playListId) throws IOException {
		String fileName = file.getOriginalFilename();
		String singerName = singersName;
		int plistId = playListId;
		Songs updatedSongDetails = new Songs(singerName, fileName, file.getBytes(), plistId);
		return songsRepo.save(updatedSongDetails);
	}

	public List<Songs> getSongList() {
		return songsRepo.findAll();
	}

	public ResponseEntity<Optional<Songs>> getSongById(int id) {
		Optional<Songs> songs = songsRepo.findById(id);
		return ResponseEntity.ok(songs);
	}
	
	public ResponseEntity<Songs> removeSongs(int id){
		songsRepo.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
