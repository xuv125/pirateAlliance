package jp.co.piratealliance.pirateAllianceWeb.web.action.com;

import java.util.List;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.GoodsInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.service.com.GoodsService;


/**
 * copyright pirate alliance team 2014
 *
 * @author lunxing
 */

public class GetGoodsListAction extends BaseAction {
	private GoodsService goodsService;
	
	private List<GoodsInfoDto> goodsList;
	
	private String language_id;

	public String getGoodsInfoList()
	{
		goodsList = goodsService.getGoodsList(this.language_id);
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
	 * @return the goodsList
	 */
	public List<GoodsInfoDto> getGoodsList() {
		return goodsList;
	}

	/**
	 * @param goodsList the goodsList to set
	 */
	public void setGoodsList(List<GoodsInfoDto> goodsList) {
		this.goodsList = goodsList;
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

}
