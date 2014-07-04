package jp.co.piratealliance.pirateAllianceWeb.dao.com;

import java.util.List;
import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dto.com.GoodsInfoDto;


/**
 * copyright   pirate alliance team 2014
 * @author     lunxing
 *
 */

public interface GoodsDao {

	public List<GoodsInfoDto> selectGoods(Map<String,Object> param);
}
