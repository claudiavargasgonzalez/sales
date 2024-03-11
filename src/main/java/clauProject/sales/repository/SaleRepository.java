package clauProject.sales.repository;

import clauProject.sales.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {
    /*@Query("select s from Sale s where s.apellido_cliente = :lastname")
    List<Sale> findByLastName(@Param ("lastname")String lastname);*/
}
