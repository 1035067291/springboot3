package org.qf.springboot3.service;


import org.qf.springboot3.pojo.CusSms;

import java.util.List;

/**
 * Thanks for Everything.
 */
public interface CusService {

	public void registerCus(CusSms pojo);

	public CusSms findById(Long id);

	public List<CusSms> findByPage(int page, int size);

}
