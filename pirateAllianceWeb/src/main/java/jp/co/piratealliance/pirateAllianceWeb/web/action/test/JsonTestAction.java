package jp.co.piratealliance.pirateAllianceWeb.web.action.test;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.dto.test.JsonTestDto;

/**
 * copyright   pirate alliance team 2014
 * @author     xuwei
 */
public class JsonTestAction extends BaseAction
{

    private JsonTestDto jsonTestDto;

    public String outputTest()
    {
        jsonTestDto = new JsonTestDto();
        jsonTestDto.setKey1("abced");
        return SUCCESS;
    }

    /**
     * @return the jsonTestDto
     */
    public JsonTestDto getJsonTestDto()
    {
        return jsonTestDto;
    }

    /**
     * @param jsonTestDto the jsonTestDto to set
     */
    public void setJsonTestDto(JsonTestDto jsonTestDto)
    {
        this.jsonTestDto = jsonTestDto;
    }
}
