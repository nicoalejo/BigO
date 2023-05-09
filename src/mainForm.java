import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class mainForm extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JButton bigOComparisonButton;
    private JTextArea textAreaResults;
    private JButton o1Button;
    private JButton oNButton;
    private JButton hashO1Button;
    private JButton forVsForEachButton;
    private JButton linearVsBinaryButton;

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
        linearVsBinaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResults.setText(bigO.TestBigO());
            }
        });

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


    //        ArrayList<ArrayList<Integer>> nicolas = new ArrayList<>(3);
//        for(int i=0; i < 3; i++) {
//            nicolas.add(new ArrayList());
//        }
//        nicolas.get(0).add(0);
//        nicolas.get(0).add(1);
//        nicolas.get(0).add(2);
//
//        nicolas.get(1).add(3);
//        nicolas.get(1).add(4);
//        nicolas.get(1).add(5);
//
//        nicolas.get(2).add(6);
//        nicolas.get(2).add(7);
//        nicolas.get(2).add(8);
//
//        int vertexCount = nicolas.size();
//        for (int i = 0; i < vertexCount; i++) {
//            int edgeCount = nicolas.get(i).size();
//            for (int j = 0; j < edgeCount; j++) {
//                Integer startVertex = i;
//                Integer endVertex = nicolas.get(i).get(j);
//                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
//            }
//        }

}
