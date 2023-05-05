package com.DaoImpl;

import com.Dao.CureventDao;
import com.Entity.Curevent;
import com.Repository.CureventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CureventDaoImpl implements CureventDao {

    @Autowired
    CureventRepository cureventRepository;

    @Override
    public List<Curevent> GetAll()
    {
        return cureventRepository.findAll();
    }
    @Override
    public void AddCurevent(Curevent curevent)
    {
        cureventRepository.save(curevent);
    }

    @Override
    public void DeleteAll()
    {
        cureventRepository.deleteAllByCureventId();;
    }
}
