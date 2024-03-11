package clauProject.sales.controller;

import clauProject.sales.model.Sale;
import clauProject.sales.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping("/createSale")
    public void addSale(@RequestBody Sale sale){
        saleService.createSale(sale);
    }

    @GetMapping("")
    public List<Sale> getAllSales(){
        return saleService.returnAllSales();
    }

    @GetMapping("/{id}")
    public Sale saleFoundById(@PathVariable Long id){
        return saleService.findSaleById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteSale(@PathVariable Long id){
        saleService.deleteSaleById(id);
    }

    @PutMapping("/update")
    public Sale updateSale(@RequestBody Sale sale){
        return saleService.updateSale(sale);
    }

    //metodo por hacer, no me salio
   /* @GetMapping("/findSaleByLastname/{lastname}")
    public List<Sale> getSaleByLastname(@PathVariable String lastname ){
        return saleService.findByLastname(lastname);
    }*/

}
