package org.frameworkset.security.session.service;

import java.util.List;

import org.frameworkset.security.session.entity.SessionCondition;
import org.frameworkset.security.session.entity.SessionInfoBean;
import org.frameworkset.security.session.statics.SessionAPP;

import com.frameworkset.util.ListInfo;

public interface SessionManagerService {

	/**
	 * 分页获取session数据
	 * 
	 * @param condition
	 * @param offset
	 * @param pagesize
	 * @return 2014年6月5日
	 */
	public ListInfo querySessionDataForPage(SessionCondition condition,
			int offset, int pagesize) throws Exception;

	/**
	 * 查询应用列表
	 * 
	 * @param appKey
	 * @return
	 * @throws Exception
	 *             2014年6月5日
	 */
	public List<SessionAPP> queryAppSessionData(String appKey) throws Exception;
	
	/** 删除应用下的session
	 * @param appkey
	 * @param sessionid
	 * 2014年6月5日
	 */
	public void delSession(String appkey, String sessionid) throws Exception;
	
	/** 删除应用下的session
	 * @param appkey
	 * @param sessionid
	 * 2014年6月5日
	 */
	public void delAllSessions(String appkey)  throws Exception;
	
	/** 获取单个session明细信息
	 * @param appkey
	 * @param sessionid
	 * 2014年6月5日
	 */
	public SessionInfoBean getSessionInfo(String appkey, String sessionid) throws Exception;

}
