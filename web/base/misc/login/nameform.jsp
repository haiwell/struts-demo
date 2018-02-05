<%@page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<script src="<%=request.getContextPath()%>/jquery/jquery-1.9.1.js"></script>
<link href="<%=request.getContextPath()%>/css/grid.css" rel="stylesheet"
	type="text/css" />
<body>
	<h1>
		<form action="/strutsDemo/welcome.action" method="post">
			<input name="name" type="text" /> <input value="提交" type="submit" />
			<input name="" id="" value="<s:property value="name"/>"> <input
				name="" id="name1" value="${name}" /> <input id="id1" type="button"
				value="点击">
		</form>
	</h1>
	<h1>
		path:<%=request.getContextPath()%>
	</h1>

	<h1>
		<form>
			<input name="ss" class="test1" value="class" />
		</form>
		<input name="mm" />
	</h1>

	<h1>
		<div id="div1"
			style="width: 280px; height: 80px; background-color: red"></div>
		<div id="div2"
			style="width: 80px; height: 80px; background-color: green"></div>
		<div id="div3"
			style="width: 80px; height: 80px; background-color: blue"></div>
	</h1>

	<h2>
		<button id="stop">停止滑动</button>
		<div id="flip">点击这里向下滑动</div>
		<div id="panel">Hello world!</div>

	</h2>

	<h3>
		<input type="button" id="fck" value="click" />
	</h3>

	<table width="95%" align="center" border="0" cellspacing="0"
		cellpadding="0" class="gridtable" id="infotable"
		style="margin-top: 10px;">
		<tr>
			<td colspan="8" align="center" height="50px"
				style="background-image: url('${application}/default/images/jdxgz/jdxgz_title.jpg');"><font
				size="4">事故信息录入单</font></td>
		</tr>
		
		<tr>
			<th>事故概况</th>
			<td colspan="7"><textarea id="trouble_survey"
					name="sgxx.trouble_survey" cols="150" rows="10"></textarea></td>
		</tr>


		<tr>
			<th>&nbsp;&nbsp;事故等级</th>
			<td><select id="trouble_level" name="sgxx.trouble_level"
				class="" style="width: 198px;" panelheight="auto">
					<option></option>
					<option>铁路交通一般A</option>
					<option>铁路交通一般B</option>
					<option>铁路交通一般C</option>
					<option>铁路交通一般D</option>
			</select></td>


			<th class="">&nbsp;&nbsp;事故类别</th>
			<td style=""><input id="trouble_type" name="sgxx.trouble_type"
				type="text" size='100' style="width: 198px;" /></td>


			<th class="">&nbsp;&nbsp;责任程度</th>
			<td style=""><input id="trouble_duty" name="sgxx.trouble_duty"
				type="text" size='100' style="width: 198px;" /></td>




		</tr>


		<tr>
			<th>预警措施</th>
			<td colspan="7"><textarea id="warning_content"
					name="sgxx.warning_content" cols="150" rows="5"></textarea></td>
		</tr>

		<tr>
			<th>承担的经济损失费用</th>
			<td colspan="7"><textarea id="money_owe" name="sgxx.money_owe"
					cols="150" rows="5"></textarea></td>
		</tr>



		<tr>

			<th>原因分析</th>
			<td colspan="7"><textarea id="trouble_reason"
					name="sgxx.trouble_reason" cols="150" rows="3"></textarea></td>
		</tr>


		<tr>

			<th>事故单位</th>
			<td><select id="trouble_org" name="sgxx.trouble_org" class=""
				style="width: 198px;">
					<option></option>
					<option>本单位</option>
					<option>其他</option>
			</select></td>



			<th>预警级别</th>
			<td><select id="info_level" name="sgxx.info_level" class=""
				style="width: 198px;">
					<option></option>
					<option>蓝色</option>
					<option>黄色</option>
					<option>橙色</option>
					<option>红色</option>
			</select></td>

			<th class="attr_td">&nbsp;&nbsp;责任部门</th>
			<td style=""><input id="duty_orgid" name="sgxx.duty_orgid"
				class="easyui-combotree" multiple="true"
				url="${application}/basic/deptandstation/showDeptsAndStationsComTree.action"
				style="width: 198px;" type="text" /></td>
		</tr>

		<tr>

			<th>责任人</th>
			<td><input id="duty_oper_id" name="sgxx.duty_operid"
				type="hidden" value="" size="30" style="width: 198px;" /> <input
				id="duty_oper_name" name="" type="text" value="" size="30"
				style="width: 198px;" /></td>
			<th style="border-right: none;"></th>
			<th style="border-right: none;"></th>
			<th style="border-right: none;"></th>
			<th style="border-right: none;"></th>
			<th style="border-right: none;"></th>
			<th style="border-right: none;"></th>


		</tr>




		<tr id="last">
			<th colspan="8" align="center" valign="middle"
				style="padding-left: 30px; text-align: center;" height="40px;">
				<a href="#" class="easyui-linkbutton"
				onclick="onSave(); return false;">保存</a></th>
		</tr>
	</table>
</body>
<script>
	$("#fck").click(function() {
		alert("1");
	});
	/*-----------------------测试一-------------------------*/
	// $("#test").hide();
	// $(".test1").hide();
	// $(function(){
	// 	$("#div1").fadeIn();
	// 	$("#div2").fadeIn(3000);
	// 	$("#div3").fadeIn(6000);
	// 	$("#div1").fadeOut();
	// 	$("#div2").fadeOut(3000);
	// 	$("#div3").fadeOut(6000);
	//  var a = $("form input");
	// 	alert($("#name1").value);
	// 	var a=document.getElementById("name1").value;
	// 	alert(a);
	// 	var b=document.getElementById("name1").value;
	// 	alert(b.length);
	// });
	// $("#flip").click(function(){
	// 	$("#panel").slideDown(5000);
	// });
	// $("#stop").click(function(){
	// 	$("#panel").stop();
	// })
	/*--------------------测试二------------------------*/
	/*
	 $(function(){
	 alert("haihai");
	 });


	 $(document).ready(function(){
	 alert("hello!");
	 });
	 */

	/*
	 $(function(){
	 var a = $("form input");
	 $.each(a,function(key,val){
	 alert("key= "+key+" "+"val="+val);
	 })
	 })
	 */

	/*
	 var t1,t2;
	 $('#id1').tap(function () {
	 t1 = Date.now();
	 alert("t1="+t1);
	 });*/

	/*
	 $('#id1').click(function () {
	 t2 = Date.now();
	 alert("t2="+t2);
	 alert(t2 - t1);
	 });*/
	/*-------------------------------------------------*/
</script>
<style type="text/css">
#panel,#flip {
	padding: 5px;
	text-align: center;
	background: green;
	width: 200px;
	border: solid 1px black;
}

#panel {
	padding: 50px;
	display: none;
}
</style>