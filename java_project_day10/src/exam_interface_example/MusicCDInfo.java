package exam_interface_example;
import java.util.Arrays;
public class MusicCDInfo extends CDInfo {

	private String artist;
	private String[] songTitle;
	
	public MusicCDInfo(String registerNo,String title, String artist, String[] songTitle) {
		super(registerNo, title);
		this.artist = artist;
		this.songTitle = songTitle;
	}
	
	
	public String songData() {
		String sTitle = "";
		for(int i = 0; i < songTitle.length; i++) {
			sTitle += (songTitle[i]);
			if(i < songTitle.length -1) {
				sTitle += ",";
			}
		}
		return sTitle;
	}
	
	
	public String toString() {
		return artist + "" + getTitle() + "[" + songData() + "] 음반";
	}

}
