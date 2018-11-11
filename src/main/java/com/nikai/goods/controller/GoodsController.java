package com.nikai.goods.controller;

import com.jiatui.spi.ServiceResponse;
import com.nikai.goods.dto.Goods;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品相关接口
 *
 * @author keni@aijiatui.com
 * @version 1.0.0
 * @domain GOODS
 */
@RestController
public class GoodsController {


    /**
     * 查询所有商品信息
     *
     * @return 商品列表
     * @service 查询所有商品信息
     * @scene 小程序
     * @domain GOODS
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/all-goods/query")
    @ResponseBody
    public ServiceResponse<List<Goods>> queryAll() {
        return null;
    }

    /**
     * 分页查询所有商品信息
     *
     * @param start 起始位置
     * @param length 页大小
     * @return 商品列表
     * @service 分页查询所有商品信息
     * @scene 小程序
     * @domain GOODS
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/goods-by-page/query")
    @ResponseBody
    public ServiceResponse<Map<String, Object>> queryByPage(Integer start, Integer length) {
        return null;
    }

    /**
     * 根据商品ID查询所有商品信息
     *
     * @return 商品列表
     * @service 根据商品ID查询所有商品信息
     * @scene 小程序
     * @type QUERY
     * @domain GOODS
     * @param id 商品id
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/goods-by-id/query")
    @ResponseBody
    public ServiceResponse<Goods> queryById(Long id) {
        return null;
    }

    /**
     * 新增商品
     *
     * @return 新增结果
     * @service 新增商品
     * @scene 小程序
     * @type COMMAND
     * @domain GOODS
     * @param goods 商品信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/goods/add")
    @ResponseBody
    public ServiceResponse<String> save(Goods goods) {
        return null;
    }

    /**
     * 更新商品信息
     *
     * @return 商品列表
     * @service 更新商品信息
     * @scene 小程序
     * @type COMMAND
     * @param goods 商品信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/goods/update")
    @ResponseBody
    public ServiceResponse<String> update(Goods goods) {
        return null;
    }

    /**
     * 删除商品
     *
     * @return 商品列表
     * @service 删除商品
     * @scene 小程序
     * @type COMMAND
     * @domain GOODS
     * @param goods 商品信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/goods/delte")
    @ResponseBody
    public ServiceResponse<String> delete(Goods goods) {
        return null;
    }

}
