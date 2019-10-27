package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.Address;
import com.caohangwei.mallvueserver.mapper.AddressMapper;
import com.caohangwei.mallvueserver.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {
}
