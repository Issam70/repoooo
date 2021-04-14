package com.example.stock.dao;

import com.example.stock.bean.AmitieVille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmitieVilleDao extends JpaRepository<AmitieVille, Long> {
}
