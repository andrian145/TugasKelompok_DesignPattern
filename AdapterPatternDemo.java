public class AdapterPatternDemo {
	public static void main (String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "James Dean & Audrey Hepburn.mp3");
		audioPlayer.play("mp4", "Iris.mp4");
		audioPlayer.play("vlc", "Swing Life Away.vlc");
		audioPlayer.play("avi", "Rescue Me.avi");
		}    
}