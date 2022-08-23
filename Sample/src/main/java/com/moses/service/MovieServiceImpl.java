package com.moses.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.moses.dao.MovieDAO;
import com.moses.service.MovieService;
import com.moses.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {
 
    @Inject
    private MovieDAO dao;
    
    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return dao.selectMovie();
    }
 
}