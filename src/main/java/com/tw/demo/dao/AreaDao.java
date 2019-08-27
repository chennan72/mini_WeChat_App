package com.tw.demo.dao;

import com.tw.demo.entity.Area;

import java.util.List;

public interface AreaDao {
  /**
   * 查询所有地区
   *
   * @return
   */
  List<Area> queryArea();

  /**
   * 根据id查询地区
   *
   * @param areaId
   * @return
   */
  Area queryAreaById(int areaId);

  /**
   * 添加地区
   *
   * @param area
   * @return
   */
  int insertArea(Area area);

  /**
   * 更新地区
   *
   * @param area
   * @return
   */
  int updateArea(Area area);

  /**
   * 删除地区
   *
   * @param areaId
   * @return
   */
  int deleteArea(int areaId);
}
