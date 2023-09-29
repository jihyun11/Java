package org.example.codingtest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Category {
    private int categoryId;
    private String categoryName;
    private List<Category> children;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.children = new ArrayList<>();
    }

    public void addChild(Category child) {
        children.add(child);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Category> getChildren() {
        return children;
    }

    // JSON으로 변환하는 메소드
    public String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> categoryMap = new HashMap<>();
        categoryMap.put("categoryId", categoryId);
        categoryMap.put("categoryName", categoryName);
        categoryMap.put("children", children);
        return objectMapper.writeValueAsString(categoryMap);
    }
}
