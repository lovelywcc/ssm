package com.service;


import com.pojo.Paper;

import java.util.List;

/**
 * @author wangcc
 * @create 2019-10-10 18:54
 **/
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
