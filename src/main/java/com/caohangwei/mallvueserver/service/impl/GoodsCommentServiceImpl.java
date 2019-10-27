package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.GoodsComment;
import com.caohangwei.mallvueserver.mapper.GoodsCommentMapper;
import com.caohangwei.mallvueserver.service.GoodsCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsCommentServiceImpl extends ServiceImpl<GoodsCommentMapper, GoodsComment> implements GoodsCommentService {
}
