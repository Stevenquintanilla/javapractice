package javapractice.musicplayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String albumName;
	private String artist;
	private ArrayList<Song> listOfSongs;

	public Album(String albumName, String artist) {
		this.albumName = albumName;
		this.artist = artist;
		this.listOfSongs = new ArrayList<Song>();
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public ArrayList<Song> getListOfSongs() {
		return listOfSongs;
	}

	public void setListOfSongs(ArrayList<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public boolean addSong(String title, String duration) {
		if (findSong(title) == null) {
			Song song = new Song(title, duration);
			listOfSongs.add(song);
			System.out.println("Song was successfully added");
			return true;
		}
		System.out.println("Duplicate song name was found, cannot add song");
		return false;
	}

	private Song findSong(String title) {
		for (Song checkedSong : listOfSongs) {
			if (checkedSong.getTitle().equalsIgnoreCase(title)) {

				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

		if ((trackNumber > 0) && trackNumber <= playList.size()) {
			playList.add(listOfSongs.get(trackNumber - 1));
			System.out.println("Track number " + trackNumber + " was added to this album");
			return true;
		} else {
			System.out.println("Track number " + trackNumber + " not found in this album");
			return false;
		}
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {

		Song foundSong = findSong(title);
		if (foundSong != null) {
			playList.add(foundSong);
			System.out.println("Adding " + foundSong.getTitle() + " to the playlist");
			return true;
		} else {
			System.out.println("Could not find the song under that name");
			return false;
		}

	}
}
