package com.tw.demo.dao;

import com.tw.demo.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaDaoTest {

  @Autowired private AreaDao areaDao;

  @Test
  public void queryArea() {
    List<Area> list = areaDao.queryArea();
    assertEquals(4, list.size());
  }

  @Test
  public void queryAreaById() {
    assertEquals("东苑", areaDao.queryAreaById(2).getAreaName());
  }

  @Test
  public void insertArea() {
    Area area = new Area();
    area.setAreaName("广东");
    area.setPriority(1); // 数据库定义not null default '0',不设置priority会报错？？？
    area.setCreateTime(new Date());
    assertEquals(1, areaDao.insertArea(area));
  }

  @Test
  public void updateArea() {
    Area area = new Area();
    area.setAreaId(7);
    area.setAreaName("广西");
    assertEquals(1, areaDao.updateArea(area));
  }

  @Test
  public void deleteArea() {
    assertEquals(1, areaDao.deleteArea(7));
  }
}
