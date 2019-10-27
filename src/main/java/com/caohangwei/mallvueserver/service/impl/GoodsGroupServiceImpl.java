package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.GoodsGroup;
import com.caohangwei.mallvueserver.mapper.GoodsGroupMapper;
import com.caohangwei.mallvueserver.service.GoodsGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsGroupServiceImpl extends ServiceImpl<GoodsGroupMapper, GoodsGroup> implements GoodsGroupService {
}
