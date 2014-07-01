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
	
	private String email;
	
	private String password;

	public String userLogin()
	{
		userInfoDto = userService.getUserInfo(this.email, this.password);
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
