package org.example.codingtest;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Hanteo1 {
    public static void main(String[] args) throws JsonProcessingException {
        // 카테고리 구조 생성 예제
        Category mainCategory = new Category(1, "방탄소년단");
        Category noticeBoard = new Category(2, "공지사항");
        Category vBoard = new Category(3, "뷔 게시판");
        Category jkBoard = new Category(4, "정국 게시판");

        mainCategory.addChild(noticeBoard);
        mainCategory.addChild(vBoard);
        mainCategory.addChild(jkBoard);

        // JSON 형식으로 변환
        String json = mainCategory.toJson();
        System.out.println(json);
    }
}
