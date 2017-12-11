import javax.swing.JOptionPane;

public class Mod5 {
public static void main(String[] args) {
	
	String ask = JOptionPane.showInputDialog(null,"How many cups of flour do you have?");
	int answer= Integer.parseInt(ask);
	if(answer<2){
		JOptionPane.showMessageDialog(null, "You'll need to go to the store to buy more flour!");
	}
	}
}
