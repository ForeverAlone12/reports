package ru.idc.reports.venereological.entity;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class ResultVenereologist
{
    /**
     * Номер карты пациента.
     */
    private Long cartnum;

    /**
     *  ФИО пациента.
     */
    private String fio;

    /**
     * Дата рождения.
     */
    private Date birthday;

    /**
     * Возраст.
     */
    private Date age;

    /**
     * Пол.
     */
    private String sex;

    private Time authorized_time;

    /**
     * Код услуги.
     */
    private String resid;

    private String test_name;

    /**
     * Пользователь.
     */
    private String username;
}
