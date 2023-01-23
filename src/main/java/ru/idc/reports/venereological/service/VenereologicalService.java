package ru.idc.reports.venereological.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.idc.reports.venereological.dao.VenereologicalDao;
import ru.idc.reports.venereological.entity.ResultVenereologist;

import java.util.List;

@Service
@Transactional
public class VenereologicalService
{
    private final VenereologicalDao dao;

    @Autowired
    public VenereologicalService(
        VenereologicalDao dao)
    {
        this.dao = dao;
    }

    public List<ResultVenereologist> list()
    {
        return dao.list();
    }
}
