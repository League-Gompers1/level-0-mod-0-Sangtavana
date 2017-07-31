import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args){
		
		String Cats=JOptionPane.showInputDialog(null, "How many cats do you have?");
		int answer=Integer.parseInt(Cats);

		if(answer == 3){
			JOptionPane.showMessageDialog(null,"You are a lazy cat lady!");
		
		}
		else if (answer<=3 && answer!=0){
		playVideo("https://www.youtube.com/watch?v=4-0zb1LtXZg");
		}
		
		else if (answer==0){
			playVideo("https://www.youtube.com/watch?v=DwMVSzxqGl");
		}
	}
			static void playVideo(String videoURL ) {
				try {
					URI uri = new URI(videoURL);
					java.awt.Desktop.getDesktop().browse(uri);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	
			}
	
	

