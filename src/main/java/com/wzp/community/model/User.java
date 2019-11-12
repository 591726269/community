package com.wzp.community.model;

import lombok.Data;

/**
 * @author wzp
 * @date 2019-10-30 11:39
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String account_id;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
