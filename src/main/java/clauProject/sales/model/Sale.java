package clauProject.sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@Data
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long numeroFactura;
    private String apellidoCliente;
    private String nombreCliente;
    private String fechaHoraVenta;
    private Double monto;
    private Boolean clienteFrecuente;

    public Sale(Long id, Long numeroFactura, String apellidoCliente,
                String nombreCliente, String fechaHoraVenta, Double monto, Boolean clienteFrecuente) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente = nombreCliente;
        this.fechaHoraVenta = fechaHoraVenta;
        this.monto = monto;
        this.clienteFrecuente = clienteFrecuente;
    }

    public Sale(Long numeroFactura, String apellidoCliente, String nombreCliente,
                String fechaHoraVenta, Double monto, Boolean clienteFrecuente) {
        this.numeroFactura = numeroFactura;
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente = nombreCliente;
        this.fechaHoraVenta = fechaHoraVenta;
        this.monto = monto;
        this.clienteFrecuente = clienteFrecuente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setFechaHoraVenta(String fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setClienteFrecuente(Boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }

    public Long getId() {
        return id;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public Double getMonto() {
        return monto;
    }

    public Boolean getClienteFrecuente() {
        return clienteFrecuente;
    }
}
