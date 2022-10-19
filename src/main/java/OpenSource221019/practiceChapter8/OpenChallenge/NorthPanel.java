package OpenSource221019.practiceChapter8.OpenChallenge;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    public NorthPanel()
    {
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Cancel"));

    }
}

class ExFrame extends JFrame
{
    ExFrame()
    {
        this.setTitle("Open Challenge 9");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel np =new NorthPanel();
        CenterPanel cp =new CenterPanel();

        add(np, BorderLayout.NORTH);
        add(cp, BorderLayout.CENTER);

        this.setSize(300,300);
        this.setVisible(true);
    }
}
class JavaApplication9
{

    public static void main(String[] args)
    {
        new ExFrame();
    }

}

