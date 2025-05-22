package week12;

import java.rmi.Remote;
import java.util.Scanner;

public class RemoteControlEx {
	public static void main(String[] args) {
		Audio audio = new Audio();
		TV tv = new TV();
		
		tv.turnOn();
		audio.turnOn();

		System.out.println("리모컨 최대 볼륨: " + RemoteControl.MAX_VALUE);
		System.out.println("리모컨 최소 볼륨: " + RemoteControl.MIN_VALUE);
	
		Scanner sc = new Scanner(System.in);
		int input = 0;
		boolean swap = false;
		
		System.out.println();
		System.out.println("---Volume setting---");
		
		do  {
			System.out.printf(((swap) ? "TV" : "Audio") + "볼륨을 입력해주세요: ");
			input = sc.nextInt();
			
			if (input == -1) {
				break;
			}
			
			if (swap) {
				tv.setVolume(input);
			}
			else {
				audio.setVolume(input);
			}
			
			swap = !swap;
		} while(true);
		
		System.out.println();
		System.out.println("-----");
		
		tv.setMute(true);
		audio.setMute(true);
		tv.setMute(false);
		audio.setMute(false);

		System.out.println();
		System.out.println("-----");
		
		RemoteControl.changeBattery();
	}
}
