package org.example.javaswing;

import javax.swing.*;
import java.awt.*;

public class CalcTwo extends JFrame {
    public JTextField inputSpace= new JTextField();
    private GridBagLayout grid = new GridBagLayout();

    public CalcTwo() {

        setLayout(null);

        // 값입력하는 공간 설정
        inputSpace = new JTextField();
        inputSpace.setEditable(false); // 편집 불가능
        inputSpace.setBackground(Color.WHITE); // 배경은 화이트
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);  // input값 정렬 위치
        inputSpace.setFont(new Font("Times", Font.BOLD, 50)); // 글씨 체
        inputSpace.setBounds(8, 10, 270, 70); // x:8, y:10 위치 270x70 크기

        // 버튼 공간 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 격자형태로 배열
        buttonPanel.setBounds(8, 90, 270, 235); // x:8, y:90 위치 270x235 크기

        // 버튼에 들어갈 글자 배열
        String button_names[] = {"C","÷", "+","=", "7", "8", "9", "x","4", "5", "6", "-", "1", "2", "3","0"};
        // 버튼글자배열 개수만큼 버튼 만들기
        JButton buttons[] = new JButton[button_names.length];

        for(int i = 0; i<button_names.length; i++) {
            buttons[i] = new JButton(button_names[i]);


            buttonPanel.add(buttons[i]); // 버튼 추가
            buttons[i].setOpaque(true);  // 맥에서 배경색이 먹지 않는것을 해결!
        }

        // JFrame에 추가
        add(inputSpace);
        add(buttonPanel);

        setTitle("계산기");
        setVisible(true);
        setSize(300, 370);
        setLocationRelativeTo(null); // 화면 가운데에 띄우기
        setResizable(false); // 사이즈조절 불가
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을때 실행중인 프로그램 도 종료
    }

    public static void main(String[] args) {
        new CalcTwo();
    }
}
