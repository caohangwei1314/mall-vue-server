package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.GoodsDetail;
import com.caohangwei.mallvueserver.mapper.GoodsDetailMapper;
import com.caohangwei.mallvueserver.service.GoodsDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsDetailServiceImpl extends ServiceImpl<GoodsDetailMapper, GoodsDetail> implements GoodsDetailService {
}
