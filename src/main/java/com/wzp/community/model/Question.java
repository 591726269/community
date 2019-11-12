package com.wzp.community.model;

import lombok.Data;

/**
 * @author wzp
 * @date 2019-11-08 13:40
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
}
