package jp.co.piratealliance.pirateAllianceWeb.dao.test;

import java.util.List;
import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dto.test.JsonTestDto;

/**
 * copyright   pirate alliance team 2014
 * @author     xuwei
 *
 */
public interface JsonTestDao
{
	public List<JsonTestDto> selectTest(Map<String,Object> paramMap);
}
