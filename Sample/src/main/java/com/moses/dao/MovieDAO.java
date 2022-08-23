package com.moses.dao;

import java.util.List;
import com.moses.vo.MovieVO;

public interface MovieDAO {
	public List<MovieVO> selectMovie() throws Exception;
}