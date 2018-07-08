package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatException;
import org.seckill.exception.SeckillCloseExcuption;
import org.seckill.exception.SeckillException;

public interface SeckillService {
	List<Seckill> getSeckillList();
	
	Seckill getById(long seckillId);

	Exposer exportSeckillUrl(long seckillId);
	
	void executeSeckill(long seckillId,long userPhone,String md5) throws RepeatException,SeckillCloseExcuption,SeckillException;
}
