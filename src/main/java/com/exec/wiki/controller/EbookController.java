package com.exec.wiki.controller;

import com.exec.wiki.bean.req.EbookReq;
import com.exec.wiki.bean.resp.EbookResp;
import com.exec.wiki.service.EbookService;
import com.exec.wiki.utils.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Aki
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public ResponseUtils<?> list(EbookReq ebookReq) {
        List<EbookResp> ebookList = ebookService.list(ebookReq);
        return new ResponseUtils(0, "success", ebookList);
    }
}
