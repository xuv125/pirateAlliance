package jp.co.piratealliance.pirateAllianceWeb.service.com.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dao.com.GoodsDao;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.AreaInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.GoodsInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.service.com.GoodsService;


/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDao goodsDao;

	public List<GoodsInfoDto> getGoodsList(String language_id) {
		// TODO Auto-generated method stub
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("language_id", language_id);
		return goodsDao.selectGoods(paramMap);
	}
	
	public List<AreaInfoDto> getAreaList(String language_id, int level) {
		// TODO Auto-generated method stub
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("language_id", language_id);
		paramMap.put("level", level);
		return goodsDao.selectArea(paramMap);
	}

	/**
	 * @return the goodsDao
	 */
	public GoodsDao getGoodsDao() {
		return goodsDao;
	}

	/**
	 * @param goodsDao the goodsDao to set
	 */
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	
}
