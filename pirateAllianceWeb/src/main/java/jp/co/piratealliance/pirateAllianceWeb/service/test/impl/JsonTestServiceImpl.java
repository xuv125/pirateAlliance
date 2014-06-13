package jp.co.piratealliance.pirateAllianceWeb.service.test.impl;

import java.util.List;

import jp.co.piratealliance.pirateAllianceWeb.dao.test.JsonTestDao;
import jp.co.piratealliance.pirateAllianceWeb.dto.test.JsonTestDto;
import jp.co.piratealliance.pirateAllianceWeb.service.test.JsonTestService;

/**
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public class JsonTestServiceImpl implements JsonTestService
{
	private JsonTestDao jsonTestDao;

	public List<JsonTestDto> getJsonTestDtoList()
	{
		return jsonTestDao.selectTest();
	}

	public JsonTestDao getJsonTestDao()
	{
		return jsonTestDao;
	}

	public void setJsonTestDao(JsonTestDao jsonTestDao)
	{
		this.jsonTestDao = jsonTestDao;
	}
}
