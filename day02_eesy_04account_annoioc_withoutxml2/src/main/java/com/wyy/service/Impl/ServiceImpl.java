package com.wyy.service.Impl;
import com.wyy.dao.WyyDao;
import com.wyy.entity.WyyEntity;
import com.wyy.service.WyyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service("wyyService")
public class ServiceImpl implements WyyService {
    @Autowired
    private WyyDao wyyDao;
    public List<WyyEntity> findAll() throws SQLException {
        return wyyDao.findAll();
    }

    public WyyEntity findOneById(Integer id) throws SQLException {
        return wyyDao.findOneById(id);
    }

}


