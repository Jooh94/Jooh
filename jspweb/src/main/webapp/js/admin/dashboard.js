

// 1. 해당 사이드바 태그 호출
let sidebar = document.querySelector('.sidebar')
let mainbox = document.querySelector('#mainbox')
	
//2. 해당 사이드바 클릭했을때 이벤트	
sidebar.addEventListener('click',function(){	
	// 해당 사이드바 css 변경 [left 속성을 0으로변경]
	sidebar.style.left = 0;
	
})

//3. 본문 div 클릭했을때 이벤트	
mainbox.addEventListener('click',function(){	
	// 해당 사이드바 css 변경 [left 속성을 0으로변경]
	sidebar.style.left = '-170px';
	
})

function pagechage(page){
	
	$('#mainbox').load(page)
}