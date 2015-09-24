package com.anakiou.opap.service;

public interface GenericService<T, S> {

    T getDrawByNo(int no);

    T getLatestDraw();

    S getDrawsForDate(int dayOfMonth, int month, int year);

}
