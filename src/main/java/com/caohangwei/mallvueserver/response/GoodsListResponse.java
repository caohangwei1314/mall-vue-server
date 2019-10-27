package com.caohangwei.mallvueserver.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GoodsListResponse {

    private List<GoodsResponse> data;

    private Integer goodsSum;
}
