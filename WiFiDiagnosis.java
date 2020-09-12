import java.util.Scanner;
public class WiFiDiagnosis {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		char answer;
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First Step: Reboot the computer and try to connect\nDid that fix the problem?(y or n)");
		answer = input.nextLine().charAt(0);
			if(answer == 'n') {
				System.out.println("Seconds Step: Reboot the Router and try to connect.\nDid that fix the problem?(y or n)");
				answer = input.nextLine().charAt(0);
				if(answer == 'n') {
					System.out.println("Third Step: Make sure the cables connecting the router are firmly plugged in and power is getting to the router.\nDid that fix the problem?(y or n)");
					answer = input.nextLine().charAt(0);
					if(answer == 'n') {
						System.out.println("Fourth Step: Move the computer closer to the router and try to connect.\nDid that fix the problem?(y or n)");
						answer = input.nextLine().charAt(0);
						if(answer == 'n') {
							System.out.println("We are unable to fix your problem. Contact your ISP");
						}
						else {
							System.out.println("Moving your computer seemed to work, thank you for using WiFi Diagnosis.");
						}
					}
					else {
						System.out.println("Checking the cabels seemed to work, thank you for using WiFi Diagnosis.");
					}
				}
				else {
					System.out.println("Rebooting the router router seemed to work, thank you for using WiFi Diagnosis.");
				}
			}
			else {
				System.out.println("Rebooting the computer seemed to work, thank you for using WiFi Diagnosis.");
			}
		}
	}