package com.exec.wiki.bean.resp;

import lombok.Data;

/**
 * @author Aki
 */
@Data
public class EbookResp {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}