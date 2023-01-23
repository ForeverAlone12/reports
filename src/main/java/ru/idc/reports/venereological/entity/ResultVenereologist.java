package ru.idc.reports.venereological.entity;

import lombok.Data;

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
    private String birthday;

    /**
     * Возраст.
     */
    private String age;

    /**
     * Пол.
     */
    private String sex;

    /**
     * Код услуги.
     */
    private String resid;

    /**
     * Пользователь.
     */
    private String username;
}
