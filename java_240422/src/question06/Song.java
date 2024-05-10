package question06;

import java.time.Year;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
		
public Song() {}


public Song(String title, String artist, int year, String country) {
	super();
	this.title = title;
	this.artist = artist;
	this.year = year;
	this.country = country;
}


//	public Song(String a,String b,int c,String d) {	
//		title=a;
//		artist=b;
//		year=c;
//		country=d;
//	}
//	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	public static void main(String[] args) {
		Song dancingQueen = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		dancingQueen.show();
	}

}
