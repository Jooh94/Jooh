/* 

 왼쪽 방향키 = 37
 위쪽 방향키 = 38
 오른쪽 방향키 = 39
 아래쪽 방향키 = 40

*/

/*별의 초기 설정*/
const star = document.querySelector('h1')
star.style.position = 'absolute' /*css =조작 포지션 : 절대위치 */

/* 별의 이동을 출력하는 기능 */
let [ x , y] = [ 0 , 0] /* 키보드 이동 값 */

/* 
		(1번 이나 2번 둘이똑같음 아무거나 써도댐)
		1번 						2번  
let [ x , y] = [ 0 , 0]    let x = 0 
						   let y = 0
*/


const block = 10 /* 이동 단위 */
const print = () => {
	
	
	star.style.left =`${x*block}px`
	star.style.top = `${y*block}px`
}
print()

const  [left , up , right , down] = [ 37, 38, 39, 40]

document.body.addEventListener('keydown' , (event) =>{
	
	//if : 논리제어 [경우의수가 정해져 있지 않는경우]
	// switch [break] :  값 제어 [정해진 경우의수]
	
	switch( event.keyCode){
		case left :
			x-= 1
			break
		case up :
			y-= 1
			break
		case right :
			x += 1
			break
		case down :
			y += 1
			break
		
	}
	print()
	
}) 