package com.example.stock.service;

import com.example.stock.bean.Ville;
import com.example.stock.dao.VilleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {
    @Autowired
    VilleDao villeDao;

    public List<Ville> findAll() {
        return villeDao.findAll();
    }



    public Ville findByCode(String code) {
		return villeDao.findByCode(code);
	}



	public void update(Ville ville) {
    	villeDao.save(ville);
    }

	public int save(Ville ville) {
        if(villeDao.findByCode(ville.getCode())!=null)
            return -1;
        else{
            villeDao.save(ville);
            return 1;
        }
    }
}
