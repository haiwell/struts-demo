<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>颜色代码表</title>
</head>
<body>

</body>
</html>
<script language="JavaScript">
<!--//tool.webmasterhome.cn
clr=new Array('00','20','40','60','80','a0','c0','ff');
for (i=0;i<8;i++) { 
document.write("<table border=0 cellpadding=8 style='border:1px solid #000000'>");
for (j=0;j<8;j++) {
document.write("<tr>");
for (k=0;k<8;k++) {
document.write('<td bgcolor="#'+clr[i]+clr[j]+clr[k]+'">');
document.write('<tt><font color="#'+clr[7-i]+clr[7-j]+clr[7-k]+'"> ');
document.write(clr[i]+clr[j]+clr[k]+'</font></tt></td>'); }
document.write("</tr>"); }
document.write("</table><br>");}
//-->
</script>