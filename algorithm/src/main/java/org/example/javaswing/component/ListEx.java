package org.example.javaswing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListEx extends JFrame implements MouseListener, ActionListener {
    private JList<String> list;
    private DefaultListModel<String> model;

    private JButton btnLR, btnRL;

    private DefaultComboBoxModel<String> cbModel;

    private JComboBox<String> cb;

    public ListEx(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(1100, 200);
        setLayout(new GridLayout(1, 3));

        model = new DefaultListModel<>();
        model.addElement("AAA");
        model.addElement("BBB");
        model.addElement("CCC");
        model.addElement("AAA");
        model.addElement("BBB");
        model.addElement("CCC");
        model.addElement("AAA");
        model.addElement("BBB");
        model.addElement("CCC");


        list = new JList<>(model);
        list.addMouseListener(this);

        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane);

        JPanel panCenter = new JPanel();

        btnLR = new JButton("->");
        btnLR.addActionListener(this);
        panCenter.add(btnLR);
        btnRL = new JButton("<-");
        btnRL.addActionListener(this);
        panCenter.add(btnRL);
        add(panCenter);


        cbModel = new DefaultComboBoxModel<>();
        cbModel.addElement("1111");
        cbModel.addElement("2222");
        cbModel.addElement("3333");
        cbModel.addElement("4444");

        cb = new JComboBox<String>(cbModel);
        add(cb);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ListEx("list");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        Object obj = e.getSource();

//        if (e.getClickCount() == 2) {
//
//            int i = list.getSelectedIndex();
//            String val = list.getSelectedValue();
//            System.out.println(i + " : " + val);
//
//            model.remove(i);
//            int i = list.getSelectedIndex();
//            String val = list.getSelectedValue();
//
//
//            cbModel.addElement(val);

//            cbModel.addElement(val);
        }



    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btnLR) {

            int i = list.getSelectedIndex();
            String val = list.getSelectedValue();
            System.out.println(i + " : " + val);

            model.remove(i);

            cbModel.addElement(val);

        } else if (obj == btnRL) {
            int i = cb.getSelectedIndex();
            String val = (String) cb.getSelectedItem();

            cbModel.removeElementAt(i);

            model.addElement(val);


        }

    }
}
