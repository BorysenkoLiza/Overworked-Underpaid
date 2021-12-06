package com.company.calender.eventCategory;
import java.util.ArrayList;
import java.util.List;

public class Category {
    public String categoryName;
    private final ArrayList<String> categoryList = new ArrayList<>();
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    public String choose(String curCategoryName) {
        showAll();
        if(!categoryList.contains(curCategoryName)) categoryList.add(curCategoryName);
        return  categoryName;
    }
    public void add(String categoryName){
        categoryList.add(categoryName);
    }
    public void edit(String newCategoryName){
        this.categoryName = newCategoryName;
    }
    public List<String> showAll(){
       return categoryList;
    }
    public void delete(int index){
        categoryList.remove(index);
    }
}
