package com.exec.wiki.service;


import com.exec.wiki.bean.req.EbookReq;
import com.exec.wiki.bean.resp.EbookResp;
import com.exec.wiki.domain.Ebook;
import com.exec.wiki.domain.EbookExample;
import com.exec.wiki.mapper.EbookMapper;
import com.exec.wiki.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

        return BeanCopyUtils.copyList(ebookList, EbookResp.class);
    }
}
