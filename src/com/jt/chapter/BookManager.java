package com.jt.chapter;

/**
 * @program: classprogram
 * @Description:
 * @author: JT
 * @date: 2019/10/30
 */
public class BookManager {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        //x子类访问父类的protect成员变量
        int pages = dictionary.pages;
        //类型转换int转String
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        Book book = new Book("INB002","James",70);
        display(book.getBookId());
        Book bookdictionary = new Dictionary("INB003","Toms",98,8);
        display(bookdictionary.getBookId());

        //final
    }

    /**
     * @Description: 显示结果
     * @Param:
     * @return: void
     * @Author: JT
     * @Date: 2019/10/30
     */
     public static void display(String content) {
         System.out.println(content);
     }
}
