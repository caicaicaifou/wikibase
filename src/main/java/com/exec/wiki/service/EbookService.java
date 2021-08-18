package com.exec.wiki.service;


import com.exec.wiki.bean.req.EbookReq;
import com.exec.wiki.bean.resp.EbookResp;
import com.exec.wiki.domain.Ebook;
import com.exec.wiki.domain.EbookExample;
import com.exec.wiki.mapper.EbookMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aki
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + ebookReq.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            ebookRespList.add(ebookResp);
        }
        return ebookRespList;
    }
}
