import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you wan to change to the first class ticket?");

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: Yes");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: No");
        }
        
        System.exit(0);
    }
}
