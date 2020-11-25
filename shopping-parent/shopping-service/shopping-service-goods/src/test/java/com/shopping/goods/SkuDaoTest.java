package com.shopping.goods;

import com.shopping.goods.mapper.SkuDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pojo.entity.SkuEntity;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SkuDaoTest {

    @Resource
    private SkuDao skuDao;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<SkuEntity> userList = skuDao.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}