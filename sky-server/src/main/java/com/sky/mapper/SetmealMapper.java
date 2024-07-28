package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SetmealMapper {

	/**
	 * 根据分类id查询套餐的数量
	 * <p>
	 * 该方法用于根据分类ID查询套餐的数量。
	 *
	 * @param id 分类的唯一标识符
	 * @return 返回套餐数量
	 */
	Integer countByCategoryId(@Param("id") Long id);
}