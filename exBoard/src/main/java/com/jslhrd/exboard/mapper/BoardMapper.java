package com.jslhrd.exboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jslhrd.exboard.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public int boardCount();
	public List<BoardDTO> boardList();
	public int boardWrite(BoardDTO dto);
	public BoardDTO boardView(int idx);
	public int boardModify(BoardDTO dto);
	public int boardDelete(int idx, String pass);
}
