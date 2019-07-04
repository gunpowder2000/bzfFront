package com.company.dao.work.impl;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.bean.work.WorkBean;
import com.company.dao.work.WorkDao;
import com.company.utils.ConnectionManage;

public class WorkDaoImpl extends ConnectionManage implements WorkDao  {

	// 查询人才招聘头展示内容（分页）

	/* (non-Javadoc)
	 * @see com.company.dao.work.impl.WorkDao#querywork(int, int)
	 */
	@Override
	public List<WorkBean> querywork( int page, int listNum){
		
		int start = (page-1)*listNum+1;
		int end = page*listNum;
		
		List<WorkBean> result=new ArrayList<WorkBean>();
		try {
			conn = init(1);
			String sql = "select * from " 
					+ "(select row_number() over( order by work_id desc) rn,work_id,work_title,work_digest,work_date from tbl_work ) x " 
					+ "where x.rn >= ? and x.rn <= ?";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			rs = ps.executeQuery();

			while (rs.next()) {
				WorkBean work = new WorkBean();
				work.setWorkid(rs.getString("work_id"));
				work.setWorktitle(rs.getString("work_title"));
				work.setWorkdigest(rs.getString("work_digest"));
				work.setWorkdate(rs.getString("work_date"));
				result.add(work);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
	
	
	// 查询人才招聘头展示内容（总数）

	/* (non-Javadoc)
	 * @see com.company.dao.work.impl.WorkDao#queryworktotal()
	 */
	@Override
	public int queryworktotal( ){
		
		int result = 0;

		try {
			conn = init(1);
			String sql = "select count(*) from  " 
					+ "(select work_id,work_title,work_digest,work_date from tbl_work ) x ";
			
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				result = rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
	
	
	// 查询人才招聘展示内容（明细）
	/* (non-Javadoc)
	 * @see com.company.dao.work.impl.WorkDao#queryworkdetail(java.lang.String)
	 */
	@Override
	public WorkBean queryworkdetail( String workid){
		
		WorkBean result=new WorkBean();
		try {
			conn = init(1);
			String sql = "select work_id,work_title,work_digest,work_content,work_date from tbl_work " 
					+ "where work_id =?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, workid);
			rs = ps.executeQuery();

			while (rs.next()) {
				result.setWorkid(rs.getString("work_id"));
				result.setWorktitle(rs.getString("work_title"));
				result.setWorkdigest(rs.getString("work_digest"));
				result.setWorkcontent(rs.getString("work_content"));
				result.setWorkdate(rs.getString("work_date"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				destory();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;		
	}
}
