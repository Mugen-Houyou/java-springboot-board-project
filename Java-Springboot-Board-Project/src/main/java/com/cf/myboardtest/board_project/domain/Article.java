package com.cf.myboardtest.board_project.domain;

import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title;
    private String content;
    private String hashtag;

    // metadata
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
