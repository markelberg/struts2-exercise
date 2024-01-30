<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>
    <s:text name= "concepto" /> <s:property value="invoiceBean.subject"/><br>
    <s:text name="desde" /> <s:property value="invoiceBean.dateFrom" /><br>
    <s:text name="hasta" /> <s:property value="invoiceBean.dateTo" /><br>
    <s:text name="importeBruto" /> <s:property value="invoiceBean.importeBruto" /><s:text name=" €" /><br>
    <br>
    Importe Total (IVA incluido): ${importeTotal} €

</body>
</html>