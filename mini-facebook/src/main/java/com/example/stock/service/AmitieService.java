package com.example.stock.service;

import java.util.List;
import java.util.Optional;

import com.example.stock.vo.AmitieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.stock.dao.AmitieDao;
import com.example.stock.bean.Amitie;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class AmitieService {
	@Autowired
	EntityManager entityManager;
	public List<Amitie> findByDateValidation(String date){
		String query="select a from Amitie a where a.dateValidation like '%"+date+"%'";
		return entityManager.createQuery(query).getResultList();
	}





	@Autowired
	AmitieDao amitieDao;
	@Autowired
	AmitieVilleService amitieVilleService;



@Transactional
public int deleteById(Long id){
	if(amitieDao.findById(id)==null){
		return -1;
	}else { amitieDao.deleteById(id);
	return 1;
}}

	public Amitie findById(long id) {
		return amitieDao.findById(id);
	}

	public int save(Amitie amitie) {

			amitieDao.save(amitie);
			amitie.getAmitieVilles().forEach(e->{
				amitieVilleService.save(amitie,e);
			});
			return 1;
		}


	public List<Amitie> findAll() {
		return amitieDao.findAll();
	}

}
