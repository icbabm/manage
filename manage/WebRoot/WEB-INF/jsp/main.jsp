  <style>
		*{margin:0;padding:0;list-style-type:none;}
		
		#box{
			width:1000px;
			height:800px;
			margin:0 auto;
			margin-top:50px;
			position:relative;
		}
		.box01,.box02,.box03,.box04,.box05,.box06,.box07,.box08,.box09{
			width:300px;
			height:300px;
			border-radius:300px 0;
			background:pink;
			opacity:0.6;
			position:absolute;
			bottom:100px;
			left:500px;
			transform-origin:0 300px;
			transform:rotate(-45deg);
			transition:all 8s;
		}
		#box:hover :nth-child(3){
			transform:rotate(-23deg);
		}
		#box:hover :nth-child(4){
			transform:rotate(0deg);
		}
		#box:hover :nth-child(5){
			transform:rotate(23deg);
		}
		#box:hover :nth-child(6){
			transform:rotate(45deg);
		}
		#box:hover :nth-child(7){
			transform:rotate(-68deg);
		}
		#box:hover :nth-child(8){
			transform:rotate(-90deg);
		}
		#box:hover :nth-child(9){
			transform:rotate(-113deg);
		}
		#box:hover :nth-child(10){
			transform:rotate(-135deg);
		}
	</style>

	<div id="box">
		<div class="box01"></div>
		<div class="box02"></div>
		<div class="box03"></div>
		<div class="box04"></div>
		<div class="box05"></div>
		<div class="box06"></div>
		<div class="box07"></div>
		<div class="box08"></div>
		<div class="box09"></div>
	</div>