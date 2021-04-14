package com.example.stock.dao;

import com.example.stock.bean.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {
Ville findByCode(String code);
}
