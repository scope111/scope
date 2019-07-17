package com.scope.BookManager.dao;

import com.scope.BookManager.model.Book;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper  //通用Mapper Mabitis插件 不需要写SQL语言就能完成增删查改操作
public interface BookDAO {
    String   table_name="book";
    String insert_field="name,author,price";
    String select_field="id,status,"+insert_field;

    @Insert({"insert into",table_name,"(",insert_field,") values (#{name},#{author},#{price})"})
    int addBook(Book book);

    @Select({"select", select_field, "from", table_name})
    List<Book> selectAll();


    @Update({"update",table_name,"set status=#{status} where id=#{id}"})
void updateBookstatus(@Param("id") int id,@Param("status")int status);

}
