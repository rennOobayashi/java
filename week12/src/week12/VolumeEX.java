package week12;

import java.util.Scanner;

public class VolumeEX {
	public static void main(String[] args) {
		Volume volume = new Volume() {
			private int volume = 0;
			@Override
			public void volumeUp(int level) {
				if (level < 0 || level > 10) {
					System.out.println("out of range");
					return;
				}
				volume += level;
				
				if (volume > 10) {
					volume = 10;
				}
				
				System.out.printf("Volume level %d Up (%d)\r\n", level, volume);
			}
			
			@Override
			public void volumeDown(int level) {
				if (level < 0 || level > 10) {
					System.out.println("out of range");
					return;
				}
				volume -= level;
				
				if (volume < 0) {
					volume = 0;
				}
				
				System.out.printf("Volume level %d Down (%d)\r\n", level, volume);
			}
		};
		
		volume.volumeUp(1);
		volume.volumeDown(1);
		
		System.out.println();
		System.out.println("---Volume Control---");
		
		boolean swap = true;
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			System.out.printf(((swap) ? "Up" : "Down") + " level: ");
			input = sc.nextInt();
			
			if (input == -1) {
				break;
			}
			
			if (swap) {
				volume.volumeUp(input);
			}
			else {
				volume.volumeDown(input);				
			}
			
			swap = !swap;
		} while(true);
	}

}
