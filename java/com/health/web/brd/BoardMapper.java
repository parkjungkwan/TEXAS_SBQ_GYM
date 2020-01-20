package com.health.web.brd;

import java.util.List;


import org.springframework.stereotype.Repository;

@Repository
public interface BoardMapper {
	public void insertBrd(Board param);
	public List<Board> selectAll();
	public String countArtseq();
	public Board selectBrd(String brdseq);
	public void updateBrd(Board param);
	public void deleteBrd(Board param);
}
