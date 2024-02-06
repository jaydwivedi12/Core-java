package com.book.app.services;

public interface BookServices {
  int printMenu();
  void insertRecord(int idx);
  void deleteRecord();
  void updateRecord();
  void printRecord(int id);
  void printAllRecord();
  }
