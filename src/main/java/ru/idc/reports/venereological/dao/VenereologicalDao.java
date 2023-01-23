package ru.idc.reports.venereological.dao;

import org.apache.ibatis.annotations.Mapper;

import ru.idc.reports.venereological.entity.ResultVenereologist;

import java.util.List;

@Mapper
public interface VenereologicalDao
{
    List<ResultVenereologist> list();
}
