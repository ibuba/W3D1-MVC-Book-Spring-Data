package com.miu.ea;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookDao extends JpaRepository<Book, Integer> {

}
