package com.wzp.community.dto;

import lombok.Data;

/**
 * @author wzp
 * @date 2019-10-29 12:43
 */
@Data
public class AccessTokenDto {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
