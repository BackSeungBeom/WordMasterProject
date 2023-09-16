package com.mycom.word;

import java.util.ArrayList;

public interface ICRUD {
    public void listAll();
    public Object add();
    public void addItem();
    public void updateItem();
    public ArrayList<Integer> listAll(String keyword);
    public void listAll(int level);
    public void deleteItem();
    public void loadFile();
    public void saveFile();
    public void searchLevel();
    public void searchWord();
}
