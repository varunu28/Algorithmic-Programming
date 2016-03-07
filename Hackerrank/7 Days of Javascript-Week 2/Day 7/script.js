function BinaryCalculator(divRes){
	this.divRes=divRes;

	this.enter="";
	this.operando=false;
	this.op1="";
	this.op2="";
	this.operator=0;
}

BinaryCalculator.prototype.dec2bin = function(resul){
	return (resul >>> 0).toString(2);
};

BinaryCalculator.prototype.operand = function(value){
	if(!this.operator)
		this.op1+=value;
	else
		this.op2+=value;
	this.operando=true;
	this.enter+=value;
	this.divRes.innerHTML=this.enter;
};

BinaryCalculator.prototype.addOperator = function(value,label){
	if(!this.operator&&this.operando) {
		this.operator=value;
		this.enter+=label;
		this.divRes.innerHTML=this.enter;
	}
};

BinaryCalculator.prototype.clear = function(){
	this.enter="";
	this.divRes.innerHTML=this.enter;
	this.operando=false;
	this.operator=0;
};

BinaryCalculator.prototype.equal = function(){
	var resul=0;
	var strResul="";
	
	if(this.op1.length&&this.op2.length) {
		var operando1=parseInt(this.op1,2);
		var operando2=parseInt(this.op2,2);
				
		switch(this.operator) {
			case 1:
				resul=operando1+operando2;
			break;
			case 2:
				resul=operando1-operando2;
			break;
			case 3:
				resul=operando1*operando2;
			break;
			case 4:
				try {
					resul=operando1/operando2;
				} catch (err) {
					console.log(err.message);
				} finally {
					resul=operando1/operando2;
				}				
			break;
		}
		strResul=this.dec2bin(resul);
	
		this.enter=strResul;
		this.op1=strResul;
		this.op2="";
		this.operator=0;
	}	
	return(strResul);
};

// -------------------------------------------------------------------------------------------------
var divRes=document.getElementById("res");
var btnClr=document.getElementById("btnClr");
var btnEql=document.getElementById("btnEql");
var btnSum=document.getElementById("btnSum");
var btnSub=document.getElementById("btnSub");
var btnMul=document.getElementById("btnMul");
var btnDiv=document.getElementById("btnDiv");

var day7=new BinaryCalculator(divRes);

btn0.onclick = function() {
	day7.operand("0");
};

btn1.onclick = function() {
	day7.operand("1");
};

btnClr.onclick = function() {
	day7.clear();
};

btnEql.onclick = function() {
	var strResult=day7.equal();
	if(strResult.length)
		divRes.innerHTML=strResult;
};

btnSum.onclick = function() {
	day7.addOperator(1,"+");
};

btnSub.onclick = function() {
	day7.addOperator(2,"-");
};

btnMul.onclick = function() {
	day7.addOperator(3,"*");
};

btnDiv.onclick = function() {
	day7.addOperator(4,"/");
};