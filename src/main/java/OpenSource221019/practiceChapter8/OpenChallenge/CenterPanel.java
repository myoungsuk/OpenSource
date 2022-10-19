package OpenSource221019.practiceChapter8.OpenChallenge;

import javax.swing.*;

public class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);

        JLabel a = new JLabel("Hello");
        JLabel b = new JLabel("java");
        JLabel c = new JLabel("love");

        a.setBounds(100, 200, 50, 20);
        b.setBounds(200, 100, 50, 20);
        c.setBounds(150, 150, 50, 20);

        add(a);
        add(b);
        add(c);
    }
}
