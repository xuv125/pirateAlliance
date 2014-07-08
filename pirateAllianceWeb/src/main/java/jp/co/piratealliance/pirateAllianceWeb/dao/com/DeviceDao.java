package jp.co.piratealliance.pirateAllianceWeb.dao.com;

import java.util.Map;

/**
 * copyright   pirate alliance team 2014
 * @author     lunxing
 *
 */

public interface DeviceDao {

	public int setBadgeZero(Map<String,Object> param);
	
	public int badgeAddOne(Map<String,Object> param);
}
