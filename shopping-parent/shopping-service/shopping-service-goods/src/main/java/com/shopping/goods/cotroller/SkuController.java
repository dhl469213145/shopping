package com.shopping.goods.cotroller;

import java.util.Arrays;
import java.util.Map;

import api.R;
import com.shopping.goods.service.SkuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pojo.entity.SkuEntity;
import utils.Constant;
import utils.PageUtils;
import utils.ValidatorUtils;


/**
 * 商品表
 *
 * @author dhl
 * @email dinghl@sqqmall.com
 * @date 2020-11-23 15:45:56
 */
@RestController
@CrossOrigin
@RequestMapping("rechargeable/sku")
@Api(value = "", description = "sku业务相关接口", tags = {"sku业务相关接口"})
public class SkuController {
    @Autowired
    private SkuService skuService;

    /**
     * 列表
     */
    @GetMapping("/list")
    @ApiOperation(value = "sku列表查询", notes = "sku列表查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "params", value = "当前页", required = true, dataType = "map", paramType = "query"),
//            @ApiImplicitParam(name = Constant.PAGE, value = "当前页", required = true, dataType = "int", paramType = "query"),
//            @ApiImplicitParam(name = Constant.LIMIT, value = "显示条目", required = true, dataType = "int", paramType = "query"),
    })
    public R list(Map<String, Object> params){
        PageUtils page = skuService.queryPage(params);
        return R.data(page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "sku信息", notes = "sku信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value ="id", required = true, dataType = "Long", paramType = "query")
//    })
    public R info(@PathVariable("id") Long id){
        SkuEntity sku = skuService.getById(id);

        return R.data(sku);
    }

    /**
     * 保存
     */
    @PutMapping("/save")
    public R save(@RequestBody SkuEntity sku){
        ValidatorUtils.validateEntity(sku);
        skuService.save(sku);

        return R.success("ok");
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody SkuEntity sku){
        ValidatorUtils.validateEntity(sku);
        skuService.updateById(sku);
        
        return R.success("ok");
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        skuService.removeByIds(Arrays.asList(ids));

        return R.success("ok");
    }

}
