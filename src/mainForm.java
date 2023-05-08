import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JButton bigOComparisonButton;
    private JTextArea textArea1;
    private JButton o1Button;

    private BigO bigO;

    mainForm (){
        bigO = new BigO();
        o1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bigO.
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


}
