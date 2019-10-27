package com.caohangwei.mallvueserver.response;

import com.baomidou.mybatisplus.annotation.TableField;
import com.caohangwei.mallvueserver.entity.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class GoodsResponse {

    private int id;

    // 商品名称
    private String goodsName;

    // 商品图片多张使用 `,` 分割，限制最多五张
    private String goodsImgs;

    // 商品描述（只能使用图片，规则和商品图片相同）
    private String goodsDesc;

    // 基础价格，套餐价格在此基础上变化
    private BigDecimal basicPrice;

    // 商品销售总数
    private int salesNum;

    // 库存总数
    private int skuNum;

    // 分类id
    private GoodsCat goodsCat;

    // 分类id
    private Merchant merchant;

    // 商品所在分组（提供给商家自己对商品归类）
    private List<GoodsGroup> goodsGroups = new ArrayList<>();

    // 商品套餐（价格在这里面定义）
    private List<GoodsAttr> goodsAttrs = new ArrayList<>();

    // 商品详细配置信息
    private List<GoodsDetail> goodsDetails = new ArrayList<>();

    // 商品评价
    private List<GoodsComment> goodsComments = new ArrayList<>();

}
