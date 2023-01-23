package ru.idc.reports.venereological.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.idc.reports.venereological.entity.ResultVenereologist;
import ru.idc.reports.venereological.service.VenereologicalService;

import java.util.List;

@RestController
@RequestMapping("/venereological")
public class VenereologicalController
{
    private final VenereologicalService service;

    @Autowired
    public VenereologicalController(
        VenereologicalService service)
    {
        this.service = service;
    }

    @GetMapping
    public List<ResultVenereologist> list()
    {
        return service.list();
    }
}
