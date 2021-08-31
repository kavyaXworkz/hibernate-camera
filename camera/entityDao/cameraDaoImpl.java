package com.xworkz.camera.entityDao;

import java.util.camera.SFUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.xworkz.camera.entityDto.CameraEntity;

public class cameraDaoImpl implements CameraDao{
	
	private SessionFactory factory=SFUtil.getFactory();

	@Override
	public void save(CameraEntity cam) {
		try(Session session = factory.openSession()) {
			Transaction tx=session.beginTransaction();
			int pk =(int) session.save(cam);
			tx.commit();
			session.close();
			System.out.println(pk);
		}
		
	}

	@Override
	public CameraEntity readById(int id) {
		try(Session session=factory.openSession()){
			CameraEntity ent=session.get(CameraEntity.class, id);
			session.close();
			return ent;
		 }
		
	}

	@Override
	public void updateEntity(int id, String name) {
	 try(Session session=factory.openSession()){
		 Transaction tx = session.beginTransaction();
		 CameraEntity dto = new CameraEntity();
		 dto=session.get(CameraEntity.class,id);
		 dto.setName(name);
		 session.update(dto);
		 session.getTransaction().commit();
		 System.out.println("updated");
		 session.close();
		}
		
	}

	@Override
	public void deleteById(int id) {
		try(Session session= factory.openSession()){
			Transaction tx= session.beginTransaction();
			CameraEntity dto1= new CameraEntity();
			dto1= session.get(CameraEntity.class,id);
			session.delete(dto1);
			session.getTransaction().commit();
			System.out.println("deleted");
			session.close();
			
		}
		
	}

}
