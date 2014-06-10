package jp.co.piratealliance.pirateAllianceWeb.common.log;

import javax.servlet.http.HttpServletRequest;

import jp.co.piratealliance.pirateAllianceWeb.def.Constants;
import jp.co.piratealliance.pirateAllianceWeb.helper.WebHelper;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;

/**
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public final class OperationLogger
{
	/** ロガー. */
	private static Logger log;

	/**
	 * 初期化.
	 */
	static
	{
		// ロガーを初期化
		log = Logger.getLogger(Constants.LOG_PACKAGE_DISP_OP);
	}

	/**
	 * パブリックコンストラクタ.
	 */
	public OperationLogger()
	{
	}

	/**
	 * ログメッセージの出力を行います.
	 *
	 * @param invocation
	 * @param userId
	 */
	public static void log(final ActionInvocation invocation,
			final String userId, final long startTime, final long endTime)
	{
		log.info(buildLogMessage(invocation, userId,startTime, endTime));
	}

	/**
	 * ログメッセージの構築を行います.
	 *
	 * @param invocation
	 *            invocation
	 * @param userId
	 *            ユーザID
	 * @return ログメッセージ
	 */
	private static String buildLogMessage(final ActionInvocation invocation,
            final String userId, final long startTime, final long endTime)
    {
        HttpServletRequest request = WebHelper.getRequest();
        String address = request.getRemoteAddr();
        String url = request.getRequestURI();

        StringBuffer sb = new StringBuffer();
        sb.append(userId);
        sb.append(Constants.LOG_ITEM_DELIMITER );
        sb.append(address);
        sb.append(Constants.LOG_ITEM_DELIMITER );
        sb.append(url);
        sb.append(Constants.LOG_ITEM_DELIMITER );
        sb.append(getInvokeMethodName(invocation));
        sb.append(Constants.LOG_ITEM_DELIMITER );
        sb.append(endTime - startTime);

        return sb.toString();

    }

	/**
	 * 操作が実行されたメソッド名を取得します.
	 *
	 * @param invocation
	 *            invocation
	 * @return メソッド名
	 */
	private static String getInvokeMethodName(final ActionInvocation invocation)
	{

		if (invocation == null)
		{
			return "";
		}
		return invocation.getProxy().getActionName();
	}
}
