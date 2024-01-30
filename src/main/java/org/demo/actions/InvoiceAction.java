import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.demo.actions.beans.InvoiceBean;

import javax.servlet.http.HttpServletRequest;

public class InvoiceAction extends ActionSupport {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        // Cálculo con el IVA incluido
        double importeBruto = invoiceBean.getImporteBruto();
        double valorIVA = 0.21; // IVA del 21%
        double importeTotal = importeBruto * (1 + valorIVA);

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("importeTotal", importeTotal);

        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "Añadir concepto.");
        }
        if (invoiceBean.getDateFrom() == null) {
            addFieldError("invoiceBean.dateFrom", "Añadir fecha de inicio.");
        }
        if (invoiceBean.getDateTo() == null) {
            addFieldError("invoiceBean.dateTo", "Añadir fecha de finalización.");
        }
        if (invoiceBean.getImporteBruto() == null) {
            addFieldError("invoiceBean.importeBruto", "Añadir importe bruto.");
        }
        else if (invoiceBean.getImporteBruto() <= 0) {
            addFieldError("invoiceBean.importeBruto", "El importe bruto debe ser mayor que cero.");
        }
    }
}