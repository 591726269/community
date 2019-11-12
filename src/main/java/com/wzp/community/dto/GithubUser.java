package com.wzp.community.dto;

import lombok.Data;

/**
 * @author wzp
 * @date 2019-10-29 13:08
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
