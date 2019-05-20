package javapractice.musicplayer;

import java.util.*;

public class MusicPlayerMain {
	
	private static ArrayList<Album> myAlbums = new ArrayList<Album>();
	private static LinkedList<Song> myPlayList = new LinkedList<Song>();
	
	public static void main(String[] args) {
		
		Album album = new Album("Horrible album do not buy", "Some random guy");
		
		album.addSong("HEY NOW", "3:12");
		album.addSong("YOU'RE A ROCKSTAR", "2:56");
		album.addSong("GET YOUR GAME ON", "1:23");
		album.addSong("GO PLAY", "13:45");
		
		myAlbums.add(album);

		album = new Album("GREAT ALBUM", "Steven");
		
		album.addSong("blah blah", "2:12");
		album.addSong("generic song", "3:54");
		album.addSong("test song", "1:36");
		
		myAlbums.add(album);
		
		myAlbums.get(0).addToPlayList("HEY NOW", myPlayList);
		myAlbums.get(0).addToPlayList("YOU'RE A ROCKSTAR", myPlayList);
		myAlbums.get(0).addToPlayList(1, myPlayList);
		
		printMenu();
		play(myPlayList);
	}
	
	private static void play(LinkedList<Song> playList) {
		Scanner scanner  = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in the playlist");
			return;
		} else {
			System.out.println("Now playing: " + listIterator.next().toString());
		}
		
		while(!quit) {
			int userAction = scanner.nextInt();
			scanner.nextLine();
			
			switch(userAction) {
			case 0:
				System.out.println("Bye! Have a wonderful time!");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
						forward = true;
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing: " + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("This is the beginning of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying: " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We're at the start of the list");
					}
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying: " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We're at the end of the list");
					}
				}
				break;
			case 4:
				printAllSongs(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Removed! Now playing : " + listIterator.next().toString());
					} else if(listIterator.hasPrevious()) {
						System.out.println("Removed! Now playing : " + listIterator.previous().toString());
					}
				}
				break;
			}
		}
	}
	
	private static void printAllSongs(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		int i = 0;
		
		while(iterator.hasNext()) {
			i++;
			System.out.println(i + ". " + iterator.next().toString());
		}
	}
	
	private static void printMenu() {
		System.out.println("Welcome to your playlist! What would you like to do?");
		System.out.println("0. Quit");
		System.out.println("1. Go the next song");
		System.out.println("2. Go back to the previous song");
		System.out.println("3. Replay the current song");
		System.out.println("4. List all songs in this playlist");
		System.out.println("5. Show menu again");
		System.out.println("6. Remove current song");
	}

}
