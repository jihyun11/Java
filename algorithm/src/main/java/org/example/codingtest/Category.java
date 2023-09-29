package org.example.codingtest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Category {
    private int child_idx; // child_idx
    private String categoryName; // 편의를 위해 카테고리명 변수 추가

    private int parent_idx; // parent_idx
    private List<Category> children; // children 노드들을 담을 리스트

    public Category(int child_idx, String categoryName, int parent_idx) {
        this.child_idx = child_idx;
        this.categoryName = categoryName;
        this.children = new ArrayList<>();
        this.parent_idx = parent_idx;
    }

    // child 노드를 추가하는 메소드
    public void addChild(Category child) {
        children.add(child);
    }


    //child_idx를 리턴해 주는 메소드
    public int getchild_idx() {
        return child_idx;
    }


    // 카테고리명을 리턴해 주는 메소드
    public String getCategoryName() {
        return categoryName;
    }


    // 각각의 하위 자식 카테고리들을 리턴해 주는 메소드
    public List<Category> getChildren() {
        return children;
    }


    // 어느 부모 노드에 소속되어 있는지, 각각의 부모 카테고리 식별자를 리턴해 주는 메소드
    public int getParent_idx() { return parent_idx; }


    // json 형식으로 변환해 주는 메소드
    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }
}
    // 이 클래스는, Hanteo1 클래스에서 작동합니다.
