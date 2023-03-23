package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File("demo.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		
		
		String response = "";
		
		while (!response.equalsIgnoreCase("Q")) {
			System.out.println("P = play, Q = quit");
			System.out.print("Enter your choice: ");
			
			response = sc.next();
			response = response.toUpperCase();
			
			switch(response) {
				case "P": clip.start();
				break;
				case "S": clip.stop();
				break;
				case "R": clip.setMicrosecondPosition(0);
				break;
				case "Q" : clip.close();
				break;
				default: System.out.println("Not a valid response");
			}			
		}
		System.out.println("is that good :))");
	}
 
}
