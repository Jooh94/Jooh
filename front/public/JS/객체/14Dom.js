/*

	contextmenu:오른쪽 클릭 [ 메뉴 ] 했을때 이벤트

*/

// 모든 사진들의 요소 호출
const imgs = document.querySelectorAll("img")
	//배열[객체] = ???????All-> 여러개 -> 배열 (인덱스)
// 2.
for ( let i = 0 ; i<imgs.length; i++){
	imgs[i].addEventListener( "contextmenu" , (event) => {
		event.preventDefault()
	})		
}
/*
//3.
for (let i in imgs){
	imgs[i].addEventListener( "contextmenu" , (event) => {
	event.preventDefault()
	})		

}

//4.
for (let i of imgs){
	imgs[i].addEventListener( "contextmenu" , (event) => {
	event.preventDefault()
	})		
}

//5.
imgs.forEach((img)=>{
	img.addEventListener('contextmenu',(event)=>{
		event.preventDefault()	
	})
})
*/
/* -----------------------*/

let 상태 = false /*체크박스를 체크 여부 저장 변수 */

// html 요소 가져오기
const 체크박스 = document.querySelector('input')

//
체크박스.addEventListener('change' , ( 이벤트속성 ) =>{
	상태  =이벤트속성.currentTarget.ckecked
}) 
const 링크 = document.querySelector('a')
 링크.addEventListener('click', (이벤트속성)=>{
 if (!상태){ // ! : true -> false  // false ->true
	
	이벤트속성.preventDefault()
}	
})














