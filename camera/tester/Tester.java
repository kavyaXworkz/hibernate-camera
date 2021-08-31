package com.xworkz.camera.tester;

import com.xworkz.camera.entityDao.CameraDao;
import com.xworkz.camera.entityDao.cameraDaoImpl;
import com.xworkz.camera.entityDto.CameraEntity;

public class Tester {

	public static void main(String[] args) {
		
		CameraEntity ent=new CameraEntity(1, "sony", "itex", 1,"mall");
		
		CameraDao dao=new cameraDaoImpl();
		dao.save(ent);
	    dao.readById(1);
	    dao.updateEntity(1, "titan");
	    dao.deleteById(1);
	}
}
