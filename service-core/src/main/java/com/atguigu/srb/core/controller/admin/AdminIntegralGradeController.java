package com.atguigu.srb.core.controller.admin;


import com.atguigu.common.result.R;
import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import com.atguigu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Example;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author 张慧
 * @since 2021-08-12
 */
@Api(tags = "积分等级管理")
@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll(){
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list).message("获取列表成功");
    }

    @ApiOperation(value = "根据id删除数据记录", notes = "逻辑删除数据记录")
    @DeleteMapping("remove/{id}")
    public R removeById(@ApiParam(value = "数据id",example = "100",required = true)
            @PathVariable Long id){
        boolean result = integralGradeService.removeById(id);
        if (result){
            return R.ok().message("删除成功");
        }else {
            return R.ok().message("删除失败");
        }
    }

}

