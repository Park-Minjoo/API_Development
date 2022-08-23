package com.moses.service;

import java.util.List;
import com.moses.vo.MovieVO;

public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}
