package com.cf.myboardtest.board_project.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private long id;
    private Article article ;
    private String content;

    // metadata
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
