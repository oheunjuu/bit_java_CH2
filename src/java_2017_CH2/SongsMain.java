package java_2017_CH2;

public class SongsMain {

	public static void main(String[] args) {
		Songs song=new Songs();
		
		song.setAlbum("Real");
		song.setArtist("아이유 ");
		song.setComposer("이민수 ");
		song.setTitle("좋은 날 ");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
	}

}
