package org.hubt;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import org.hubt.view.HomeUI;
import org.hubt.view.LoginUI;
import org.hubt.view.student.StudentMngUI;
import org.hubt.view.teacher.TeacherMngUI;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new TeacherMngUI();
            frame.setVisible(true);
            frame.setResizable(false);
        });
    }
}