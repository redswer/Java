package com.jslhrd.exboard.service;

import java.util.List;

import com.jslhrd.exboard.domain.BoardDTO;

public interface BoardService {
	public int boardCount();
	public List<BoardDTO> boardList();
	public int boardWrite(BoardDTO dto);
	public BoardDTO boardView(int idx);
	public int boardModify(BoardDTO dto);
	public int boardDelete(int idx, String pass);
}
