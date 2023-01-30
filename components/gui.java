package components;

import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
      String name =  JOptionPane.showInputDialog("hi"); 
      JOptionPane.showMessageDialog(null, name);
    }
}
