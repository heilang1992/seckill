package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	int insertSuccessKilled(long seckillId,long userPhone);
	
	SuccessKilled queryByIdWithSeckilled(long seckillId);
	
}
