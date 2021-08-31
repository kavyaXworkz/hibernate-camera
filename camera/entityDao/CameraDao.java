package com.xworkz.camera.entityDao;

import com.xworkz.camera.entityDto.CameraEntity;

public interface CameraDao {
	
	void save(CameraEntity cam);
	CameraEntity readById(int id);
	void updateEntity(int id, String name);
	void deleteById(int id);
}
