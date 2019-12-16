package com.odessey.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

@Repository("odesseyrepositoryoracle")
public class OdesseyRepositoryOracle implements OdesseyRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Mission> fetchMissionDetails() {
		 
		
		Session session=sessionFactory.getCurrentSession();
		
		Query <Mission> query=session.createQuery("from Mission",Mission.class);
		List<Mission> missionDetailList=query.getResultList();
		return missionDetailList;

	}

//	public List<Astronaut> fetchAstronautDetails() {
//		Session session=OdesseyUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		List<Astronaut> astronautDetailList= session.createQuery("from Astronaut").list();
//		session.getTransaction().commit();
//		session.close();
//		
//		return  astronautDetailList;
//		
//	}
//
//	public void updateMissionDetails(Mission missionDetails) {
//		Session session = OdesseyUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		session.save(missionDetails);
//		session.getTransaction().commit();
//		session.close();
//	}
//
//	public void updateAstronautDetails(Astronaut astronautDetails) {
//		Session session = OdesseyUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//		session.update(astronautDetails);
//		session.getTransaction().commit();
//		session.close();
//	}
//
}
