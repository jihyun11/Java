package org.example.javaswing.app;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyEditor extends JFrame implements ActionListener {

    private JTextArea textArea;

    private JMenuItem itemNew, itemOpen, itemSave, itemExit, itemApp, itemInfo;
    public MyEditor(String title) //기본 프레임
    {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocation(1000, 200);
        setLayout(new BorderLayout());

        setMenuBar(); //메뉴바

        setToolBar(); //툴바

        setPanCenter(); //패널붙이고 텍스트에어리어

        setVisible(true);
    }

    private void setPanCenter() {
        JPanel panCenter = new JPanel();
        panCenter.setLayout(new BorderLayout());

        textArea = new JTextArea();

        panCenter.add(textArea);
        add(panCenter);

    }

    private void setToolBar() {
    }

    private void setMenuBar() {
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

    public static void main(String[] args) {
        new MyEditor("MyEditor ver0.1");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == itemNew) {
            fileSave();
            textArea.setText("");
        }
        else if (obj == itemOpen) {
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
            new FirstForm("textt");

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

}
