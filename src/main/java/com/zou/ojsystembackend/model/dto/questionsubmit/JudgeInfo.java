package com.zou.ojsystembackend.model.dto.questionsubmit;

import lombok.Data;

@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 用户代码
     */
    private String memory;

    /**
     * 消耗时间 kb
     */
    private Long time;

}
