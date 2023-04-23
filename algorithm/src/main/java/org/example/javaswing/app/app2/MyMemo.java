package org.example.javaswing.app.app2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyMemo extends JFrame implements ActionListener {

    private JTextArea textArea;

    private JMenuItem itemNew, itemOpen, itemSave, itemExit, itemApp, itemInfo;

    public MyMemo(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocation(1000, 200);
        setLayout(new BorderLayout());

        setPanCenter();

        setMenubar();

        setVisible(true);
    }

    private void setMenubar() {
        JMenuBar bar = new JMenuBar();
        JMenu menuFile = new JMenu("File");

        itemNew = new JMenuItem("New");
        itemNew.addActionListener(this);
        menuFile.add(itemNew);

        itemOpen = new JMenuItem("Open");
        itemOpen.addActionListener(this);
        menuFile.add(itemOpen);

        itemSave = new JMenuItem("Save");
        itemSave.addActionListener(this);
        menuFile.add(itemSave);

        menuFile.addSeparator();

        itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(this);
        menuFile.add(itemExit);

        bar.add(menuFile);

        JMenu menuOption = new JMenu("Option");
        JMenuItem itemFont = new JMenuItem("Font");
        menuOption.add(itemFont);

        menuOption.addSeparator();

        itemApp = new JMenuItem("App");
        itemApp.addActionListener(this);
        menuOption.add(itemApp);

        bar.add(menuOption);

        JMenu menuInfo = new JMenu("정보");
        itemInfo = new JMenuItem("프로그램 정보");
        itemInfo.addActionListener(this);
        menuInfo.add(itemInfo);

        bar.add(menuInfo);

        setJMenuBar(bar);
    }

    private void setPanCenter() {
        JPanel panCenter = new JPanel();
        panCenter.setLayout(new BorderLayout());

        JTextField textField = new JTextField(10);

        panCenter.add(textField);
        add(panCenter);

    }

    public static void main(String[] args) {
        new MyMemo("mymemo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == itemNew) {
            fileSave();
            textArea.setText("");
        } else if (obj == itemOpen) {
            fileOpen();
        } else if (obj == itemSave) {
            fileSave();
        } else if (obj == itemExit) {
            if ((JOptionPane.showConfirmDialog(this, "정말 종료할까요?", "종료 확인", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE)) == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (obj == itemInfo) {
            JOptionPane.showConfirmDialog(this, "나의 에디터 프로그램", "프로그램 정보", JOptionPane.ERROR_MESSAGE);

        } else if (obj == itemApp) {
            new MemoFirstForm("textt");

        }


    }

    private void fileOpen() {

        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileNameExtensionFilter("텍스트 파일", "txt"));
        fc.addChoosableFileFilter(new FileNameExtensionFilter("이미지 파일", "png", "jpg", "gif"));

        fc.showOpenDialog(this);
        File in = fc.getSelectedFile();
        BufferedReader br = null;
        String line = null;

        try {
            br = new BufferedReader(new FileReader(in));
            while ((line = br.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void fileSave() {

        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        File out = fc.getSelectedFile();

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(out));
            String str = textArea.getText();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
