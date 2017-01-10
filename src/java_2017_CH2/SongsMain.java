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
		
		
		Songs song2=new Songs("첫 눈처럼 너에게 가겠다 ","에일리 "," ? "," ? ",0,0);
		song2.show();
		
		Songs song3=new Songs("Crush ","Beautiful");
		song3.show();
		
		Songs song4=new Songs("어반자카파 ","소원");
		song4.show();
		
		
	}

}
