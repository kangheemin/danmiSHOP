package com.pgy.rentcar.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pgy.rentcar.dto.JSPBoard_Dto;

public interface JSPBoard_IDao {
	// �� ����
	public int insert(String writer, String email, String subject, String password, String content) throws SQLException;
	// �� ��� ǥ��
	public ArrayList<JSPBoard_Dto> selectAll() throws SQLException;
	// Ư�� �� 
	public JSPBoard_Dto select(String key) throws SQLException;
	// ��� �ޱ�
	public int insert_reply(String writer, String email, String subject, String password, int ref, int re_step, int re_level, String content) throws SQLException;
	// �� ���� 
	public int update(String subject, String content, String num) throws SQLException;
	// �� ����
	public int delete(int key) throws SQLException;
	// �� �׷� �з�
	public int re_level_up(String ref, String re_level) throws SQLException;
	// ��ȸ�� ����
	public int upreadcnt(int num) throws SQLException;
	
	
	public int getAllCount() throws SQLException;
	public List<JSPBoard_Dto> selectPart(int key1, int key2) throws SQLException;
	public List<JSPBoard_Dto> selectPart2(int key1, int key2) throws SQLException;
	
}
