//package org.example.codingtest;
//
////import com.fasterxml.jackson.core.JsonProcessingException;
//
//public class Hanteo1 {
//    // 이 트리 노드는, 남자 -> 방탄소년단 -> 공지사항, 뷔, 정국, 지민 으로 이루어져 있습니다.
//    // 각각 카테고리 번호 (child_idx), 카테고리명 (categoryName), 소속된 부모 노드의 값 (parent_idx)의 데이터를 가지고 있습니다.
//
//    public static void main(String[] args) throws JsonProcessingException {
//        // "남자" 부모 카테고리 생성
//        Category manCategory = new Category(0, "남자", 0);
//
//        // "방탄소년단" 자식 카테고리 생성
//        Category btsCategory = new Category(1, "방탄소년단", 0);
//
//        // "공지사항", "뷔 게시판", "정국 게시판" 자식의 자식 카테고리 생성
//        Category noticeBoard = new Category(2, "공지사항", 1);
//        Category vBoard = new Category(3, "뷔 게시판", 1);
//        Category jkBoard = new Category(4, "정국 게시판", 1);
//        Category jmBoard = new Category(5, "지민 게시판", 1);
//
//        // 자식 카테고리를 부모 카테고리에 추가
//        manCategory.addChild(btsCategory); // "방탄소년단"
//
//        // 자식의 자식 카테고리를 부모 카테고리에 추가
//        btsCategory.addChild(noticeBoard); // "공지사항"
//        btsCategory.addChild(vBoard); // "뷔"
//        btsCategory.addChild(jkBoard); // "정국"
//        btsCategory.addChild(jmBoard); // "지민"
//
//        // json 형식으로 변환
//        String result = manCategory.toJson();
//        System.out.println(result);
//    }
//}
