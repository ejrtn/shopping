package com.example.shopping.comment;

import lombok.Data;

@Data
public class CommentDto {

    private String commentId;
    private String rating;
    private String content;
    private String title;
    private String productId;
    private String writeId;
}
