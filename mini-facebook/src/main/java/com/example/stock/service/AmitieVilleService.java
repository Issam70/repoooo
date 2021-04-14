package com.example.stock.service;

import com.example.stock.bean.Amitie;
import com.example.stock.bean.AmitieVille;
import com.example.stock.bean.Ville;
import com.example.stock.dao.AmitieVilleDao;
import com.example.stock.dao.VilleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmitieVilleService {
    @Autowired
    AmitieVilleDao amitieVilleDao;
    @Autowired
    VilleService villeService;
    @Autowired
    AmitieService amitieService;

    public void save(Amitie amitie, AmitieVille e) {
        e.setVille(villeService.findByCode(e.getVille().getCode()));
        e.setAmitie(amitieService.findById(amitie.getId()));
        amitieVilleDao.save(e);
    }
}
