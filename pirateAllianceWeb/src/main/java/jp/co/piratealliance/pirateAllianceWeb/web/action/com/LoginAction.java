package jp.co.piratealliance.pirateAllianceWeb.web.action.com;

import jp.co.piratealliance.pirateAllianceWeb.common.base.BaseAction;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.UserInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.service.com.UserService;

/**
 * copyright pirate alliance team 2014
 *
 * @author lunxing
 */

public class LoginAction extends BaseAction {
	private UserService userService;

	private UserInfoDto userInfoDto;

	public String output()
	{
		String email = "xing_lun@hotmail.com";
		String password = "12345678";
		userInfoDto = userService.getUserInfo(email, password);
		return SUCCESS;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @return the userInfoDto
	 */
	public UserInfoDto getUserInfoDto() {
		return userInfoDto;
	}

	/**
	 * @param userInfoDto the userInfoDto to set
	 */
	public void setUserInfoDto(UserInfoDto userInfoDto) {
		this.userInfoDto = userInfoDto;
	}
	
	
}
