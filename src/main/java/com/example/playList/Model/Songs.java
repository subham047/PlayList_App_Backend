package com.example.playList.Model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
public class Songs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int sid;

	@Column(name = "Singers",nullable = false)
	private String singer;

	@Column(name = "Song_Names")
	private String songName;

	@Lob
	@Column(name = "Files")
	private byte[] songData;
	
//	
	@Column(name = "playList_Id")
	private int plId;

	public Songs() {

	}

//	public Songs(String singer, String songName, byte[] songData) {
//		super();
//		this.singer = singer;
//		this.songName = songName;
//		this.songData = songData;
//	}
	
	public Songs(String singer, String songName, byte[] songData, int pid) {
		super();
		this.singer = singer;
		this.songName = songName;
		this.songData = songData;
		this.plId=pid;
	}
	

	public int getPlId() {
		return plId;
	}

	public void setPlId(int plId) {
		this.plId = plId;
	}
//	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public byte[] getSongData() {
		return songData;
	}

	public void setSongData(byte[] songData) {
		this.songData = songData;
	}

	@Override
	public String toString() {
		return "Songs [sid=" + sid + ", singer=" + singer + ", songName=" + songName + ", song="
				+ Arrays.toString(songData) + "]";
	}

}
