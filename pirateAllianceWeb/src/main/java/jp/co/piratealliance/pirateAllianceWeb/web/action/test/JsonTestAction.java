package jp.co.piratealliance.pirateAllianceWeb.web.action.test;

import java.util.List;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.dto.test.JsonTestDto;
import jp.co.piratealliance.pirateAllianceWeb.service.test.JsonTestService;

/**
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 */
public class JsonTestAction extends BaseAction
{
	private JsonTestService jsonTestService;

	private JsonTestDto jsonTestDto;

	public String outputTest()
	{
		List<JsonTestDto> list = jsonTestService.getJsonTestDtoList();
		if (list != null && list.size() > 0)
		{
			jsonTestDto = list.get(0);
		}
		else
		{
			jsonTestDto = new JsonTestDto();
			jsonTestDto.setKey1("abced");
		}
		return SUCCESS;
	}

	public JsonTestService getJsonTestService()
	{
		return jsonTestService;
	}

	public void setJsonTestService(JsonTestService jsonTestService)
	{
		this.jsonTestService = jsonTestService;
	}

	/**
	 * @return the jsonTestDto
	 */
	public JsonTestDto getJsonTestDto()
	{
		return jsonTestDto;
	}

	/**
	 * @param jsonTestDto
	 *            the jsonTestDto to set
	 */
	public void setJsonTestDto(JsonTestDto jsonTestDto)
	{
		this.jsonTestDto = jsonTestDto;
	}
}
