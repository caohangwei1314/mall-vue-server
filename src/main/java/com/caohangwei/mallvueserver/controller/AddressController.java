package com.caohangwei.mallvueserver.controller;

import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.Address;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.service.AddressService;
import com.caohangwei.mallvueserver.util.UserContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/address/list")
    public BaseResponse addressList(){
        User user = UserContextHolder.getUser();
        return BaseResponse.createSuccess(addressService
                .lambdaQuery()
                .eq(Address::getUserid,user.getUserid())
                .list());
    }

    @PostMapping("/addressAdd")
    public BaseResponse addressAdd(@RequestBody Address address){
        User user = UserContextHolder.getUser();
        address.setUserid(user.getUserid());
        addressService.save(address);
        return BaseResponse.createSuccess();
    }

    @PostMapping("/addressEdit")
    public BaseResponse addressEdit(@RequestBody Address address){
        return BaseResponse.createSuccess(addressService.updateById(address));
    }

    @PostMapping("/addressDel")
    public BaseResponse addressDel(@RequestBody Address address){
        return BaseResponse.createSuccess(addressService
                .lambdaUpdate()
                .eq(Address::getAddressId,address.getAddressId())
                .remove());
    }
}
