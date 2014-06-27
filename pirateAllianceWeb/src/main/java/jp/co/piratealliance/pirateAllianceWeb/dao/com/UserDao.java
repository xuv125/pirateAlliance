package jp.co.piratealliance.pirateAllianceWeb.dao.com;

import java.util.Map;

import jp.co.piratealliance.pirateAllianceWeb.dto.com.UserInfoDto;


/**
 * copyright   pirate alliance team 2014
 * @author     lunxing
 *
 */

public interface UserDao {

	public UserInfoDto getUserInfo(Map<String,String> param);
}
