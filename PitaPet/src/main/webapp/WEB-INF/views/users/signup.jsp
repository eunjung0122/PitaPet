<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>핏어펫(Pit a Pet) - 사지않고 유기동물을 입양하는 문화를 만듭니다</title>
<jsp:include page="/resources/resource.jsp"></jsp:include>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
</head>
<body>
<div id="signup">
	<div class="container">
		<c:choose>
			<c:when test=${empty param.id }>
			 	<a :href="info">${param.id }</a>님 가입 되었습니다.
	   			<a :href="loginform">로그인 하러가기</a>
			</c:when>
		</c:choose>
	</div>
</div>

<script src="${pageContext.request.contextPath}/resources/js/gura_util.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>
   const base_url="http://localhost:8888/spring";
   new Vue({
      el: "#signup",
      data() {
    	  return{
    		 	 info:"${pageContext.request.contextPath}/users/info.do",
    		 	loginform:"${pageContext.request.contextPath}/users/loginform.do"
    	  }
      }
   });
   
        

</script>
</body>
</html>