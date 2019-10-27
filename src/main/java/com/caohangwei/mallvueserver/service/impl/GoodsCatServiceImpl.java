package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.GoodsCat;
import com.caohangwei.mallvueserver.mapper.GoodsCatMapper;
import com.caohangwei.mallvueserver.service.GoodsCatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsCatServiceImpl extends ServiceImpl<GoodsCatMapper, GoodsCat> implements GoodsCatService {
}
