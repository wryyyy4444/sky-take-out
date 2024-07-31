package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {

	/**
	 * 新增菜品和对应的口味
	 * <p>
	 * 该方法用于将一个菜品及其对应的口味信息保存到数据库中。
	 * 它首先将菜品信息保存到菜品表中，然后获取生成的主键值，
	 * 并将该主键值设置到每个口味对象中，最后将这些口味对象保存到口味表中。
	 *
	 * @param dishDTO 包含菜品和口味信息的数据传输对象
	 */
	void saveWithFlavor(DishDTO dishDTO);

	/**
	 * 菜品批量删除
	 *
	 * @param ids 包含要删除的菜品ID列表
	 */
	void deleteBatch(List<Long> ids);

	/**
	 * 菜品分页查询
	 * <p>
	 * 该方法用于分页查询菜品信息。
	 *
	 * @param dishPageQueryDTO 包含分页查询条件的数据传输对象
	 * @return 返回包含分页结果的操作结果
	 */
	PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}