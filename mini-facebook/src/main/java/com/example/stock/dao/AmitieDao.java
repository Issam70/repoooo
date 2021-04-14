package com.example.stock.dao;

import com.example.stock.bean.Amitie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmitieDao extends JpaRepository<Amitie, Long> {
    Amitie findById(long id);
}
