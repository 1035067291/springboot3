package org.qf.springboot3.service;



import org.qf.springboot3.dao.Cusdao;
import org.qf.springboot3.pojo.CusSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Thanks for Everything.
 */
@Service
public class CusServiceImpl implements CusService {

	//注入持久层DAO
	@Autowired
	private Cusdao cusDAO;

	@Override
	public void registerCus(CusSms pojo) {
		cusDAO.save(pojo);
	}

	@Override
	public CusSms findById(Long id) {
		CusSms one = cusDAO.findOne(id);
		return one;
	}

	@Override
	public List<CusSms> findByPage(int page, int size) {

		Pageable pageable = new PageRequest(page,size);
		Page<CusSms> all = cusDAO.findAll(pageable);
		//获取总页数
		int totalPages = all.getTotalPages();
		System.out.println(totalPages);
		List<CusSms> content = all.getContent();
		return content;
	}


}
