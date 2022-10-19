package OpenSource221019.practiceChapter8.quiz8;

import javax.swing.*;
import java.awt.*;

public class SouthPanel extends JPanel {
    public SouthPanel() {
        setBackground(Color.YELLOW);
        setLayout(new FlowLayout());
        add(new JButton("Word Input"));
        add(new JTextField(15));
    }
}
