package jp.co.piratealliance.pirateAllianceWeb.web.action.com;

import java.util.List;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.AreaInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.service.com.GoodsService;


/**
 * copyright pirate alliance team 2014
 *
 * @author lunxing
 */

public class GetAreaListAction extends BaseAction {
	private GoodsService goodsService;
	
	private List<AreaInfoDto> areaList;
	
	private String language_id;
	
	private int level;

	public String getAreaInfoList()
	{
		areaList = goodsService.getAreaList(this.language_id, this.level);
		return SUCCESS;
	}

	/**
	 * @return the goodsService
	 */
	public GoodsService getGoodsService() {
		return goodsService;
	}

	/**
	 * @param goodsService the goodsService to set
	 */
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	/**
	 * @return the areaList
	 */
	public List<AreaInfoDto> getAreaList() {
		return areaList;
	}

	/**
	 * @param areaList the areaList to set
	 */
	public void setAreaList(List<AreaInfoDto> areaList) {
		this.areaList = areaList;
	}

	/**
	 * @return the language_id
	 */
	public String getLanguage_id() {
		return language_id;
	}

	/**
	 * @param language_id the language_id to set
	 */
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}
