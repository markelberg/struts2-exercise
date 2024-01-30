package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private Double importeBruto;
    private Double importeTotal;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getImporteBruto() {return importeBruto;}

    public void setImporteBruto(Double importeBruto) {this.importeBruto = importeBruto;}

    public Double getImporteTotal() {return importeTotal;}

    public void setImporteTotal(Double importeTotal) {this.importeTotal = importeTotal;}
}