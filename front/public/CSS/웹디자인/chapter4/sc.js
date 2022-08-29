
/* chartist.js 이용한 차트구현 */
/* 
	변수 = 값
	배열 = {값1 , 값2}
	객체 =


*/
/* 파이탗트 {원형차트} 데이터 객체 선언 */


let pieData = { 
	labels : ['웹디자니어','웹개발자','서버 엔지니어','영엉직'],
	series : [14 , 9 , 8 , 6 ]
}
let pieOptions ={
	width: '100%',
	height:  '400px'
}

new Chartist.Pie('.pie_chart',pieData ,pieOptions)

/* 막대차트 */
let barData = {
	lablles : ['2018년','2019년','2020년'],
	series : [[10,16,29]]
}
let barOptions = {
	
	//y축
	axisY : {  //* let 객체명 = {키 :{ } }
		offset :60 ,								//1. 
		scaleMinSpa : 50,							//2. 선 간격[px]
		labelInterpolationFnc : function(value){	//3. 3.Y축 눈금표시
			return value + ' 명'
		}
	},
	width : '100%',
	height : '400px;'
}

new Chartist.Bar('.bar_chart',barData,barOptions)


	
	
	let barData2 = {
	lablles : [],
	series : [[],[]]
}
let barOptions2 = {
	
	//y축
	axisY : {  //* let 객체명 = {키 :{ } }
		offset :60 ,								//1. 
		scaleMinSpa : 50,							//2. 선 간격[px]
		labelInterpolationFnc : function(value){	//3. 3.Y축 눈금표시
			return value + ' 명'
		}
	},
	width : '100%',
	height : '400px;'
}
function 차트그리기 (){
	const name = document.getElementById('name').value;
	const money = document.getElementById('money').value;
	
	barData2.lablles.push(name)
	barData2.series[0].push(money)

new Chartist.Bar('.bar_chart2',barData2,barOptions2)
}