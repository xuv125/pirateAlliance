package jp.co.piratealliance.pirateAllianceWeb.service.com.impl;

import java.util.HashMap;
import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dao.com.UserDao;
import jp.co.piratealliance.pirateAllianceWeb.dto.com.UserInfoDto;
import jp.co.piratealliance.pirateAllianceWeb.service.com.UserService;

/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public UserInfoDto getUserInfo(String email, String password) {
		// TODO Auto-generated method stub
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put("email", email);
		paramMap.put("password", password);
		return userDao.getUserInfo(paramMap);
	}

	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
}
