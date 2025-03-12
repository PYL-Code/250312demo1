package com.example.demo.model;


public class Task {
    private Long id;
    private String title;
    private String description;
    private String status;
    private String dueDate;

    //생성자가 명시적으로 정의되어 있지 않아,
    //Controller 등에서 new Task 를 호출하면 기본 생성자가 자동으로 적용
    //모든 필드는 null, 또는 초기값으로 설정됨

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}