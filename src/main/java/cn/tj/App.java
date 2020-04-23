package cn.tj;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        JFrame f = new JFrame();
        f.setSize(500, 450);
        f.setTitle("my ledger");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar tb = new JToolBar();
        JButton bSpend = new JButton("overview");
        JButton bRecord = new JButton("record once");
        JButton bCategory = new JButton("Category");
        JButton bReport = new JButton("Report");
        JButton bSetting = new JButton("Setting");
        JButton bBackup = new JButton("Backup");
        JButton bRecover = new JButton("Recover");

        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bSetting);
        tb.add(bBackup);
        tb.add(bRecover);

        f.setLayout(new BorderLayout());
        f.add(tb, BorderLayout.NORTH);
        f.add(new JPanel(), BorderLayout.CENTER);

        f.setVisible(true);

        bSpend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("sdf");
            }
        });

        bRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bBackup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bRecover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
