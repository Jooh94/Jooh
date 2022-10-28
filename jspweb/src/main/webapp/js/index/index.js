alert('asd')

getpactive1();
function getpactive1(){
$.ajax({
	url:"/jspweb/admin/regist",
	data : {"type":1,"option":"pactive1"},
	success:function(re){
		let json = JSON.parse(re)
		console.log(json)
		let html = '';
		json.forEach(p => {
		 
	
			
		})
		document.querySelector('.itemlist').innerHTML += html;




	}
})
}