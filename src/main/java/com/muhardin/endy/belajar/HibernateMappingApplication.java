package com.muhardin.endy.belajar;

import com.muhardin.endy.belajar.hibernate.mapping.dao.BeritaDao;
import com.muhardin.endy.belajar.hibernate.mapping.entity.Berita;
import com.muhardin.endy.belajar.hibernate.mapping.entity.Komentar;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibernateMappingApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(HibernateMappingApplication.class, args);

        Berita b = new Berita();
        b.setJudul("Tol Brexit");
        b.setIsi("Tol brexit macet parah");
        b.setWaktuPublikasi(new Date());

        Komentar k = new Komentar();
        k.setEmail("endy@muhardin.com");
        k.setNama("Endy Muhardin");
        k.setIsi("Wih, ngeri gan");
        k.setWaktuPublikasi(new Date());
        
        b.getDaftarKomentar().add(k);
        
        BeritaDao bd = app.getBean(BeritaDao.class);
        bd.save(b);
    }
}
