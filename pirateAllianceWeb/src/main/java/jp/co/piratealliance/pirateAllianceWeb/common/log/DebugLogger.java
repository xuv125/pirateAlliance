package jp.co.piratealliance.pirateAllianceWeb.common.log;

import jp.co.piratealliance.pirateAllianceWeb.def.Constants;

import org.apache.log4j.Logger;

/**
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public final class DebugLogger
{
	/** ロガー. */
	private static Logger log;

	/**
	 * 初期化.
	 */
	static
	{
		// ロガーを初期化
		log = Logger.getLogger(Constants.LOG_PACKAGE_DEBUG);
	}

	/**
	 * プライベートコンストラクタ.
	 */
	private DebugLogger()
	{
	}

	/**
	 * ログメッセージの出力
	 *
	 * @return
	 */
	public static boolean isDebugEnabled()
	{
		return log.isDebugEnabled();
	}

	/**
	 * ログメッセージの出力を行います.
	 *
	 * @param message
	 *            出力するメッセージ.
	 */
	public static void log(final String message)
	{
		if (isDebugEnabled())
		{
			log.debug(message);
		}
	}

	/**
	 * ログメッセージの出力を行います.
	 *
	 * @param message
	 *            出力するオブジェクト.
	 */
	public static void log(final Object message)
	{
		if (isDebugEnabled())
		{
			log.debug(message);
		}
	}

	/**
	 * ログメッセージの出力を行います.
	 *
	 * @param message
	 *            出力するオブジェクト.
	 * @param t
	 *            出力する例外.
	 */
	public static void log(final Object message, final Throwable t)
	{
		if (isDebugEnabled())
		{
			log.debug(message, t);
		}
	}
}
