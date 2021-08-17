package com.exec.wiki.controller;

import com.exec.wiki.service.EbookService;
import com.exec.wiki.utils.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Aki
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public ResponseUtils<?> list() {
        return new ResponseUtils(0, "success", ebookService.list());
    }
}
