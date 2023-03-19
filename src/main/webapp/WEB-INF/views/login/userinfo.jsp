<%@page import="mul.cam.a.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	UserDto login = (UserDto) session.getAttribute("login");
	String id = login.getId();
%>

<!-- 
[참고] 프로필 사진이 로딩이 안되는 경우
(1) 'Servers' 폴더 > server.xml
(2) (*) Web에서 local의 이미지를 볼 수 있게 하는 설정 확인
(3) << 다음과 같이 수정 >> docBase="프로필 사진이 업로드되는 서버의 경로" (\는 \\로 써야 인식됨)
-->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- AJAX -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

<!-- 파일유효성 검사를 위한 JQuery 버전 -->
<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>
</head>
<body>
<div>
<form id="frm" method="post" enctype="multipart/form-data">
<h3>정보수정</h3>
<table>
	<thead>
	<tr>
		<th>ID</th>
		<th>이름</th>
		<th>생년월일</th>
		<th>이메일</th>
		<th>핸드폰 (공개<input type="checkbox" id="p_Check" onchange="public_Change()">)</th>
		<th id="f">프로필사진<input type="file" onchange="filechange()" id="profPic" name="profPic">
		<input type="button" id="delProf" onclick="changeBee()" value="프로필사진 삭제">
		</th>
		<th>프로필메세지</th>
		<th>회원가입일</th>
	</tr>
	</thead>
	<tbody id="tBody">
		<tr>
		</tr>
	</tbody>
</table>
<input type="hidden" id="id" name='id' value='<%=id%>'>
</form>
<input type="hidden" id="fChange">
<input type="hidden" id="bChange">
<button type="button" id="updUser" onclick="go_updUser()">수정하기</button>
<button type="button" id="delUser" onclick="go_delUser()">계정 삭제</button>
</div>

<script type="text/javascript">
$(document).ready(function(){
	
	$.ajax({
		url:"selectUser.do",
		type:"get",
		data:{"id":'<%=id %>'},
		
		success:function(data){
			if(data!=null && data!="") {
				var tableTd = "";
				$("#tBody").html('');
				tableTd += '<tr>'
							+ '<td>' + data.id + '</td>'
							+ "<td><input type='text' id='name' name='name' value='" + data.name + "'></td>"
							+ "<td><input type='date' id='birth' name='birth' value='" + data.birth + "'></td>"
							+ "<td><input type='text' id='email' name='email' value='" + data.email + "'></td>"
							+ "<td><input type='text' id='phone' name='phone' value='" + data.phone + "'></td>"
							+ "<td>";
				if(data.profPic_Origin===undefined || data.profPic_Origin=="" || data.profPic_Origin=="basic.png" ) {
					tableTd += "<img src='./images/BusyB.png' width='100px' height='100px' alt=''/></td>";
					$("#delProf").remove();
				} else{ 
					tableTd += "<img src='/busyBeeImg/" + data.profPic_Server + "'width='100px' height='100px' alt=''/></td>";
				}
				tableTd += "<td><input type='text' id='profMsg' name='profMsg' value='" + data.profMsg + "'></td>"
							+ "<td>" + data.regidate.substr(0,10) + "</td>"
							+ "<td><input type='hidden' id='phone_public' name='phone_public' value='" + data.phone_public + "'></td>"
						+ '</tr>'
				$("#tBody").append(tableTd);
						
				if(data.phone_public==null) {
					$("#p_Check").prop('checked', false);
				} else {
					$("#p_Check").prop('checked', true);
				}
			}
		},
		error:function(){
			alert('error');
		}
	});
});

function filechange(){
	
	$("#fChange").val('changed');
	var cancelBtn = "<button type='button' id='cancelChange'>변경 취소</button>";
	$("#f").append(cancelBtn)
	
	alert($("#fChange").val());
}

function public_Change(){
	
	if($("#p_Check").is(':checked')) {
		$("#phone_public").val('on');
	} else {
		$("#phone_public").val(null);
	}
}

function changeBee(){
	$("#bChange").val('changed');
	var cancelBtn = "<button type='button' id='cancelChange'>변경 취소</button>";
	$("#f").append(cancelBtn)
	
}

function go_updUser() {
	
	if($("#fChange").val()=='changed') {
		$("#frm").attr("action", "updUser_y.do");
		$("#frm").submit();
	} else if ($("#bChange").val()=='changed'){
		$("#frm").attr("action", "updUser_y.do");
		$("#frm").submit();
	}
	else {
		$("#frm").attr("action", "updUser_n.do");
		$("#frm").submit();
	}
	

}

function go_delUser() {
	
	location.href="delUser.do?id=" + '<%=id%>';
}


$(document).on("click", "#cancelChange", function(){
	$("#fChange").val('');
	$("#bChange").val('');
	$("#profPic").val('');
	$(this).remove();
	
});

$(document).on("change", "input[type='file']", function(){

	// 이미지 확장자 유효성 검사
	var file_path = $(this).val();
	var reg = /(.*?)\.(jpg|jpeg|png)$/;

	if (file_path != "" && (file_path.match(reg) == null || reg.test(file_path) == false)) {

		if ($.browser.msie) { // ie 일때 
			$(this).replaceWith($(this).clone(true));
		} else {
			$(this).val("");
		}
		alert("이미지 파일만 업로드 가능합니다.");
		$("#cancelChange").remove();
	}
	
	// 파일명 길이 유효성 검사
	var filename = $("#profPic").val().substr(12);
	if(filename.length>20) {
		alert("파일명은 확장자를 포함하여, 20자를 넘길 수 없습니다.");
		$(this).val("");
		$("#cancelChange").remove();
	}
	
	// [참고] 저는 C:/fakepath/로 파일 경로가 설정되기 때문에 substr(12)로 잡았는데,
	// 다른 분이 테스트하시는 환경에서는 오류가 날 수 있으니
	// 프로필 사진명은 짧게 해서 올리시는 것을 추천합니다!
});

</script>
</body>
</html>