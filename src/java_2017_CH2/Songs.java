package java_2017_CH2;

public class Songs {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Songs(){
		//System.out.println("생성자 호출 ");
	}
	
	public Songs(String title,String artist,String album,String composer,int year,int track){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	}
	
	public Songs(String artist,String title){
		this(title,artist," ? "," ? ",0,0);   //만들어 놓은 생성자를 호출하는 방법!!
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		System.out.println(artist+title+" ("+album+","+year+","+track+"번 트랙,"+composer+"작곡) ");
		
	}
}
