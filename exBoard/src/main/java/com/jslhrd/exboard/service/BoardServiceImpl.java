package com.jslhrd.exboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.exboard.domain.BoardDTO;
import com.jslhrd.exboard.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public int boardCount() {
		int count = mapper.boardCount();
		
		return count;
	}

	@Override
	public List<BoardDTO> boardList() {
		List<BoardDTO> list = mapper.boardList();
		
		return list;
	}

	@Override
	public int boardWrite(BoardDTO dto) {
		int row = mapper.boardWrite(dto);
		
		return row;
	}
	
	@Override
	public BoardDTO boardView(int idx) {
		BoardDTO dto = mapper.boardView(idx);
	
		return dto;
	}
	
	@Override
	public int boardModify(BoardDTO dto) {
		int row = mapper.boardModify(dto);
		
		return row;
	}
	
	@Override
	public int boardDelete(int idx, String pass) {
		int row = mapper.boardDelete(idx, pass);
		
		return row;
	}
}
