package jp.co.piratealliance.pirateAllianceWeb.service.com;

import jp.co.piratealliance.pirateAllianceWeb.dto.com.UserInfoDto;


/**
*
* copyright   pirate alliance team 2014
* @author     lunxing
*
*/
public interface UserService {

	UserInfoDto getUserInfo(String email, String password);
	
}
