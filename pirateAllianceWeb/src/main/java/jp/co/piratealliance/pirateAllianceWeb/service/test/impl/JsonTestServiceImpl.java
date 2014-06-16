package jp.co.piratealliance.pirateAllianceWeb.service.test.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("name", "xuv");
		return jsonTestDao.selectTest(paramMap);
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
