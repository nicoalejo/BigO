import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JButton bigOComparisonButton;
    private JTextArea textAreaResults;
    private JButton o1Button;
    private JButton oNButton;
    private JButton hashO1Button;
    private JButton forVsForEachButton;

    private BigO bigO;

    mainForm (){
        bigO = new BigO();
        o1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResults.setText(bigO.O1());
            }
        });
        oNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResults.setText(bigO.ON());
            }
        });
        hashO1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResults.setText(bigO.hashTest());
            }
        });
        forVsForEachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResults.setText(bigO.ForVSForEach());
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


}
