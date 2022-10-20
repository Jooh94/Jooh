//alert('asd')
function bwrite(){
let inputs = document.querySelectorAll('input')
let info = {
		btitle : inputs[0].value ,
		bcontent : inputs[1].value ,
		bwrite : inputs[2].value  ,
		bpassword : inputs[3].value
	}
		$.ajax({
url : "http://localhost:8282/jsptest2/write" ,
data : info ,
type : "POST" ,
success :  function(re){
		if( re === 'true' ){ location.href="list.html"}
		else{ alert('실패');}
		}
			})
}