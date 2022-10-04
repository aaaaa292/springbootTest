<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>題目測試</title>
<!-- bootstrap 5.1.3 CSS -->
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<style>
.hidden_data{
  display:none;
}
</style>


</head>
<body>


	<div class="container">
		<h1>題目測試</h1>
		<form id="insertBtn" action="" method="post" enctype="multipart/form-data">

			<div class="hidden_data">
				<input id="test" name="test" type="text" class="input">
			</div>

			請輸入名字：<input type="text" id="nameBtn" name="name"> 
			請輸入年齡：<input type="number" id="ageBtn" name="number"> 
			性別: <label for="sex"></label> 
			<select name="sex" size="1" id="sex">
				<option value="male">男</option>
				<option value="female">女</option>
			</select>

			<table>
				<tr>
					<td width="185">商品名</td>
					<td width="205">商品數量</td>
					<td width="296">商品價格</td>
				</tr>
				<tr>
					<td><input type="text" name="pro_name" id="pro_name" /></td>
					<td><input type="number" name="pro_num" id="pro_num" /></td>
					<td><input type="text" name="pro_price" id="pro_price" /></td>
				</tr>
			</table>
			<button type="submit" class="btn btn-primary text-white fs-3"
				name="upData_Btn">新增資料</button>
		</form>
	</div>
	<div>
  送出的結果：<span id="result"></span>
</div>


</body>
<script>
$('#upData_Btn').click(function(){
    // 名字
    nameBtn = $('#nameBtn').val(),
    // 年齡
    ageBtn = $('#ageBtn').val(),
    // 性別
    sex = $('#sex').val(),
    // 商品名
    pro_name = $('#pro_name').val(),
    // 商品數量
    pro_num = $('#pro_num').val();
    // 商品價格
    pro_price = $('#pro_price').val(),
  
    
    jsonObj = [];
       item={}
       item['test'] = 'test';
       item["nameBtn"] = nameBtn;//名字
       item["ageBtn"] = ageBtn;// 年齡
       item["sex"] = sex;// 性別
       item["pro_name"] = pro_name;// 商品名
       item["pro_num"] = pro_num;// 商品數量
       item["pro_price"] = pro_price;// 商品價格
      
      jsonObj.push(item);//將item傳入jsonObj裡面

        $('#test').val(JSON.stringify(jsonObj));//將JSON值塞入test欄位中，當送出表單時也會一併被存到資料庫
    
    $('#result').html(JSON.stringify(jsonObj));//前端呈現送到資料庫的結果
    
 
  });
	// function submit() {
	//     var name = insertBtn.nameBtn.value;
	//     var age = insertBtn.ageBtn.value;
	//     var sex = insertBtn.sex.value;
	//     var shoppping;
	//     var pro_name = insertBtn.pro_name.value;
	//     var pro_num = insertBtn.pro_num.value;
	//     var pro_price =insertBtn.pro_price.value;
	//     var FormData = {
	//     		nameBtn:name,
	//     		ageBtn:age,
	//     		sex:sex,
	//     		shoppping:[[pro_name:pro_name,
	//     		pro_num:pro_num,
	//     		pro_price:pro_price}]
	//     };

	//     myJSON = JSON.stringify(FormData);
	//     localStorage.setItem("formJSON", myJSON);
	//     text = localStorage.getItem("formJSON");
	//     obj = JSON.parse(text);

	//     addTask(task);
	//     addDescription(desc);
	//     console.log(FormData);
	//     return false;
	// };

	// newArray = [task, description];

	// var taskArray = [];
	// var descriptionArray = [];

	// var task = document.getElementById("task").value;
	// var description = document.getElementById("description").value;

	// function addTask(task) {
	//     taskArray.push(task);
	//     console.log(
	//         "Tasks: " + taskArray.join(",  "));

	// }

	// function addDescription(description) {
	//     descriptionArray.push(description);
	//     console.log("Description: " + descriptionArray.join(", "));
	// };

	// }
</script>
</html>