package com.caohangwei.mallvueserver.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class GoodsListRequest {

    private String name;

    private Integer classId;

    private Integer limit;

    private Integer page;
}
