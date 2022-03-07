package com.example.playList.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PlayList")
public class PlayList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int pid;

	@Column(name = "PlayList")
	private String name;

//	@OneToMany(targetEntity = Songs.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "playListId_Fk", referencedColumnName = "ID")
//	private List<Songs> songs;

	public PlayList() {

	}

//	public PlayList( String name, List<Songs> songs) {
//		super();
//		this.name = name;
//		this.songs = songs;
//	}
	
	public PlayList( String name) {
		super();
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Songs> getSongs() {
//		return songs;
//	}
//
//	public void setSongs(List<Songs> songs) {
//		this.songs = songs;
//	}

	@Override
	public String toString() {
		return "PlayList [pid=" + pid + ", name=" + name + "]";
	}

}
