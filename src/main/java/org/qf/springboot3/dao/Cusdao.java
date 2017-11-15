package org.qf.springboot3.dao;

import org.qf.springboot3.pojo.CusSms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cusdao extends JpaRepository<CusSms, Long> {
}
