package com.qi.mapper;

import com.qi.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(@Param("bookID") int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    @Select("select * from ssmbuild.books where bookID = #{bookID}")
    Books queryBookById(@Param("bookID") int id);

    //查询全部Book,返回list集合
    @Select("select * from ssmbuild.books")
    List<Books> queryAllBook();

    //根据书名查询,返回一个Book
    @Select("select * from ssmbuild.books where bookName = #{bookName}")
    Books queryBookByName(@Param("bookName") String bookName);
}
