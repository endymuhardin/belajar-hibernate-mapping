package com.muhardin.endy.belajar.hibernate.mapping.dao;

import com.muhardin.endy.belajar.hibernate.mapping.entity.Berita;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeritaDao extends PagingAndSortingRepository<Berita, Integer> {

}
