package jp.co.piratealliance.pirateAllianceWeb.service.com;

import java.util.List;

import jp.co.piratealliance.pirateAllianceWeb.dto.com.GoodsInfoDto;


/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/
public interface GoodsService {

	List<GoodsInfoDto> getGoodsList(String language);
	
}
