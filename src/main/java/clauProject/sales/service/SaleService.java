package clauProject.sales.service;

import clauProject.sales.model.Sale;
import clauProject.sales.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    public void createSale(Sale sale){
        repository.save(sale);
    }

    public List<Sale> returnAllSales() {
        return repository.findAll();
    }

    public Sale findSaleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteSaleById(Long id) {
        repository.deleteById(id);
    }

    public Sale updateSale(Sale sale) {
        repository.save(sale);
        return repository.findById(sale.getId()).orElse(null);
    }

   /* public List<Sale> findByLastname(String lastname) {
        return repository.findByLastName(lastname);

    }*/
}
