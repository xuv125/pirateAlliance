package jp.co.piratealliance.pirateAllianceWeb.common.log;

import jp.co.piratealliance.pirateAllianceWeb.def.Constants;

import org.apache.log4j.Logger;

/**
 *
 * copyright pirate alliance team 2014
 *
 * @author xuwei
 *
 */
public final class SqlLogger
{
	/** ロガー. */
	private static Logger log;

	/**
	 * 初期化.
	 */
	static
	{
		// ロガーを初期化
		log = Logger.getLogger(Constants.LOG_PACKAGE_SQL);
	}

	/**
	 * プライベートコンストラクタ.
	 */
	private SqlLogger()
	{
	}

	/**
	 *
	 * @return
	 */
	public static boolean isInfoEnabled()
	{
		return log.isInfoEnabled();
	}

	/**
	 * SQLパフォーマンスログの出力を行います.
	 *
	 * @param startTime
	 *            処理開始時間
	 * @param endTime
	 *            処理終了時間
	 */
	public static void log(final String sql, final long startTime,
			final long endTime, String sqlClass)
	{
		// 最後に実行されたSQLログを取得します。
		if (isInfoEnabled() && sql != null)
		{
			log.info(buildLogMessage(endTime - startTime, sql, sqlClass));
		}
	}

	/**
	 * ログメッセージの構築を行います.
	 *
	 * @param procTime
	 *            処理時間
	 * @param execSql
	 *            実行SQL
	 * @return ログメッセージ
	 */
	private static String buildLogMessage(final long procTime,
			final String execSql, final String sqlClass)
	{
		StringBuilder logBuilder = new StringBuilder(String.valueOf(procTime));
		return logBuilder.append(Constants.LOG_ITEM_DELIMITER).append(sqlClass)
				.append(Constants.LOG_ITEM_DELIMITER).append(execSql)
				.toString();
	}
}
