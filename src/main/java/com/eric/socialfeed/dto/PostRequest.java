package com.eric.socialfeed.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PostRequest {

    @NotBlank(message = "Content cannot be empty")
    @Size(max = 255, message = "Content too long")
    private String content;

    private Integer accountId;

    public String getContent() {
        return content;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
