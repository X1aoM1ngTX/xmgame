package com.xm.gamehub.model.request.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class VerifyCodeRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String email;
    private String code;
} 